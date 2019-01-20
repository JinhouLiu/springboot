package com.jinhou.springboot.dao;

import com.jinhou.springboot.domain.UserPO;



public interface UserDao extends  BaseDao<UserPO,Long> {



    UserPO findByUserId(Long  id);

    UserPO   findByUserName(String namename);



}
