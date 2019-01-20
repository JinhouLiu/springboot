package com.jinhou.springboot.dao.impl;

import com.jinhou.springboot.dao.UserDao;
import com.jinhou.springboot.domain.UserPO;
import com.jinhou.springboot.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository("userDaoImpl")
public class UserDaoImpl  extends BaseDaoImpl<UserPO,Long> implements UserDao{


    @Resource
    UserMapper userMapper;

    @Override
    public UserPO findByUserId(Long id) {
        return userMapper.findByUserId(id);
    }


    @Override
    public UserPO findByUserName(String  username) {
        return userMapper.findByUserName(username);
    }

}
