package com.jinhou.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jinhou.springboot.dao.UserDao;
import com.jinhou.springboot.domain.UserPO;
import com.jinhou.springboot.service.UserService;

import javax.annotation.Resource;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service("userServiceImpl")
public class    UserServiceImpl   extends BaseServiceImpl<UserPO,Long>  implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;


    @Resource(name = "userDaoImpl")
    public void setBaseDao(UserDao userDao) {
        super.setBaseDao(userDao);
    }

    @Override
    public UserPO findByUserId(Long id) {
        return userDao.findByUserId(1L);
    }


    @Override
    public UserPO findByUserName(String username) {
        return userDao.findByUserName(username);
    }

}
