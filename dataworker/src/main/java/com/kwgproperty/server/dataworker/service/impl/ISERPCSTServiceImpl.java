package com.kwgproperty.server.dataworker.service.impl;

import com.kwgproperty.server.dataworker.dao.master.ISERPCSTDao;
import com.kwgproperty.server.dataworker.dao.master.ProjectDao;
import com.kwgproperty.server.dataworker.entity.MISERPCST;
import com.kwgproperty.server.dataworker.entity.MProject;
import com.kwgproperty.server.dataworker.service.IISERTCSTService;
import com.kwgproperty.server.dataworker.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISERPCSTServiceImpl implements IISERTCSTService {

    @Autowired
    private ISERPCSTDao iserpcstDao;

    @Override
    public MISERPCST checkIsERTCST(String buname, String lpname, String fqname, String bldname, String room, String cstname, String cardid) {
        return iserpcstDao.checkIsERTCST(buname, lpname, fqname, bldname, room, cstname, cardid);
    }
}
