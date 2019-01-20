package com.jinhou.springboot.service;

import com.jinhou.springboot.domain.UserPO;

public interface UserService extends BaseService<UserPO,Long> {

    UserPO   findByUserId(Long id);

    UserPO   findByUserName(String namename);



}
