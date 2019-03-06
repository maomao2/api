package com.kwgproperty.server.dataworker.service.impl;

import com.kwgproperty.server.dataworker.dao.master.ProjectDao;
import com.kwgproperty.server.dataworker.entity.MProject;
import com.kwgproperty.server.dataworker.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<MProject> getProjects() {
        return projectDao.getProjects();
    }
}
