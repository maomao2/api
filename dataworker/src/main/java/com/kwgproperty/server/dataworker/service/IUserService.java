package com.kwgproperty.server.dataworker.service;

import com.kwgproperty.server.dataworker.entity.MProject;
import com.kwgproperty.server.dataworker.entity.MUser;

import java.util.List;

/**
 * 用户业务接口层
 *
 * Created by bysocket on 07/02/2017.
 */
public interface IUserService {

    MUser getUserByPhone(String phone);
}
