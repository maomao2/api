package com.kwgproperty.server.dataworker.dao.master;

import com.kwgproperty.server.dataworker.entity.MISERPCST;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by jclang on 2017/9/18.
 */
@Mapper
public interface ISERPCSTDao {

    MISERPCST checkIsERTCST(@Param("buname") String buname, @Param("lpname") String lpname, @Param("fqname") String fqname,
                            @Param("bldname") String bldname, @Param("room") String room, @Param("cstname") String cstname,
                            @Param("cardid") String cardid);

}
