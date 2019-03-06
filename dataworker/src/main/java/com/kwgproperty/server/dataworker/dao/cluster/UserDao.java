package com.kwgproperty.server.dataworker.dao.cluster;

import com.kwgproperty.server.dataworker.entity.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    MUser getUserByPhone(String phone);

}
