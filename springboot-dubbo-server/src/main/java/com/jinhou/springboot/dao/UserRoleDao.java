package com.jinhou.springboot.dao;


import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.domain.UserRolePO;

import java.util.Set;

public interface UserRoleDao extends  BaseDao<UserRolePO,Long>  {


    Set<RolePO>   findByUserId(Long  id);
}
