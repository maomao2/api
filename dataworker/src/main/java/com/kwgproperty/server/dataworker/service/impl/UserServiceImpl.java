package com.kwgproperty.server.dataworker.service.impl;

import com.kwgproperty.server.dataworker.dao.cluster.UserDao;
import com.kwgproperty.server.dataworker.dao.master.ProjectDao;
import com.kwgproperty.server.dataworker.entity.MProject;
import com.kwgproperty.server.dataworker.entity.MUser;
import com.kwgproperty.server.dataworker.service.IProjectService;
import com.kwgproperty.server.dataworker.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public MUser getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }
}
