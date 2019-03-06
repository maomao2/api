package com.kwgproperty.server.dataworker.service;

import com.kwgproperty.server.dataworker.entity.MProduceEvidence;
import com.kwgproperty.server.dataworker.entity.MProject;

import java.util.List;

/**
 * 用户业务接口层
 *
 * Created by bysocket on 07/02/2017.
 */
public interface IProduceEvidenceService {

    List<MProduceEvidence> findProduceEvidenceByRoomId(String roomId);
}
