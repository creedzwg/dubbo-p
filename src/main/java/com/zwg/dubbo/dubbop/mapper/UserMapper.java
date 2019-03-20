package com.zwg.dubbo.dubbop.mapper;

import bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 张文刚
 * @Date: 2019/03/18  14:25
 * @Version: V1.0
 * @Description:
 */
@Mapper
@Transactional(readOnly = true)
public interface UserMapper {
    @Select("select id,name from user where id=#{id}")
     User getUser(@Param("id") Integer id);

    @Select("select id,name from user where id=#{id}")
    Integer addUser(User  user);
}
