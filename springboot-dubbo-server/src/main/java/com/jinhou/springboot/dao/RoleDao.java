package com.jinhou.springboot.dao;

import com.jinhou.springboot.domain.RolePO;

import java.util.List;

public interface RoleDao {


    List<RolePO>    findByUserId(Long   id);


}
