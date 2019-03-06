package com.kwgproperty.server.dataworker.dao.master;

import com.kwgproperty.server.dataworker.entity.MProject;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ProjectDao {

    List<MProject> getProjects();

}
