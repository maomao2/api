package com.kwgproperty.server.dataworker.service;

import com.kwgproperty.server.dataworker.entity.MISERPCST;
import com.kwgproperty.server.dataworker.entity.MProject;

import java.util.List;

/**
 * 用户业务接口层
 *
 * Created by bysocket on 07/02/2017.
 */
public interface IISERTCSTService {

    MISERPCST checkIsERTCST(String buname, String lpname, String fqname,
                            String bldname, String room, String cstname,
                            String cardid);
}
