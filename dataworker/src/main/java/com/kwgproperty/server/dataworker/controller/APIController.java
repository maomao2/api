package com.kwgproperty.server.dataworker.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kwgproperty.server.dataworker.entity.MISERPCST;
import com.kwgproperty.server.dataworker.entity.MProduceEvidence;
import com.kwgproperty.server.dataworker.entity.MUser;
import com.kwgproperty.server.dataworker.service.IISERTCSTService;
import com.kwgproperty.server.dataworker.service.IProduceEvidenceService;
import com.kwgproperty.server.dataworker.service.IUserService;
import com.kwgproperty.server.dataworker.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jclang on 2017/9/18.
 */
@RestController
@RequestMapping("/api")
public class APIController {

    protected final static Logger logger = LoggerFactory.getLogger(APIController.class);
    @Autowired
    private IISERTCSTService iisertcstService;
    @Autowired
    private IProduceEvidenceService produceEvidenceService;
    @Autowired
    private IUserService userService;

    @GetMapping("/produceevidence")
    public String getProduceEvidence(String roomId) {
        logger.error("getProduceEvidence roomId:" + roomId);
        if (roomId != null && roomId.length() > 0) {
            try {
                List<MProduceEvidence> produceEvidences = produceEvidenceService.findProduceEvidenceByRoomId(roomId);
                JSONArray ja = new JSONArray();
                for (MProduceEvidence mProduceEvidence : produceEvidences) {
                    if (mProduceEvidence != null) {
                        if (setProduceEvidenceStr(mProduceEvidence) && checkIsNotExist(ja, mProduceEvidence.getStatus())) {
                            JSONObject jo = new JSONObject();
                            jo.put("contract_id", mProduceEvidence.getContract_id());
                            jo.put("room_id", mProduceEvidence.getRoom_id());
                            jo.put("room_number", mProduceEvidence.getRoom_number());
                            jo.put("status", mProduceEvidence.getStatus());
                            jo.put("finish_time", mProduceEvidence.getFinish_time());
                            ja.put(jo);
                        }
                    }
                }
                logger.error("getProduceEvidence result:" + ja.toString());
                if (ja.length() > 0) {
                    return ja.toString();
                } else {
                    return "";
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                return "";
            }
        } else {
            return "";
        }
    }

    @GetMapping("/iserpcst")
    public String testIsERPCST(String buname, String lpname, String fqname,
                               String bldname, String room, String cstname,
                               String cardid) {
        if (room == null || room.length() == 0) {
            return "{\"price_level\":\"\",\"is_owner\":\"非ERP业主\"}";
        }
        try {
            MISERPCST miserpcst = iisertcstService.checkIsERTCST(buname, lpname, fqname, bldname, room, cstname, cardid);
            JSONObject jo = new JSONObject();
            if (miserpcst != null) {
                jo.put("is_owner", miserpcst.getIs_owner());
                jo.put("price_level", miserpcst.getPrice_level());
            }
            return jo.toString();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return "{\"price_level\":\"\",\"is_owner\":\"非ERP业主\"}";
        }
    }

    public boolean setProduceEvidenceStr(MProduceEvidence mProduceEvidence) {
        if ("已交接钥匙".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("办证通知");
            return true;
        } else if ("资料提交".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("资料提交");
            return true;
        } else if ("资料整理".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("资料整理");
            return true;
        } else if ("已送件".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("资料移交房管局");
            return true;
        } else if ("已办房产证".equals(mProduceEvidence.getStatus()) || "领证并发送《领证通知书》".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("出证");
            return true;
        } else if ("业主已签收".equals(mProduceEvidence.getStatus()) || "业主签收".equals(mProduceEvidence.getStatus())) {
            mProduceEvidence.setStatus("领证");
            return true;
        }
        return false;
    }

    public boolean checkIsNotExist(JSONArray ja, String status) {
        if (ja != null) {
            for (int i = 0; i < ja.length(); i++) {
                JSONObject jo = ja.getJSONObject(i);
                if (jo != null && status != null && status.equals(jo.getString("status"))) {
                    return false;
                }
            }
        }
        return true;
    }

    @GetMapping("/user")
    public String getUser(String phone) {
        logger.error("getUser phone:" + phone);
        if (phone != null && phone.length() > 0) {
            try {
                MUser user = userService.getUserByPhone(phone);
                if (user == null) {
                    return "";
                } else {
                    return new ObjectMapper().writeValueAsString(user);
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                return "";
            }
        } else {
            return "";
        }
    }

}
