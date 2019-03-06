package com.kwgproperty.server.dataworker.service.impl;

import com.kwgproperty.server.dataworker.dao.master.ProduceEvidenceDao;
import com.kwgproperty.server.dataworker.dao.master.ProjectDao;
import com.kwgproperty.server.dataworker.entity.MProduceEvidence;
import com.kwgproperty.server.dataworker.entity.MProject;
import com.kwgproperty.server.dataworker.service.IProduceEvidenceService;
import com.kwgproperty.server.dataworker.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceEvidenceServiceImpl implements IProduceEvidenceService {

    @Autowired
    private ProduceEvidenceDao produceEvidenceDao;

    @Override
    public List<MProduceEvidence> findProduceEvidenceByRoomId(String roomId) {
        return produceEvidenceDao.findProduceEvidenceByRoomId(roomId);
    }
}
