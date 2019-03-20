package com.zwg.dubbo.dubbop.service;

import bean.User;
import com.alibaba.dubbo.config.annotation.Service;
import com.zwg.dubbo.dubbop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

/**
 * @Author: 张文刚
 * @Date: 2019/03/17  17:19
 * @Version: V1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
         return userMapper.getUser(id);

    }
}
