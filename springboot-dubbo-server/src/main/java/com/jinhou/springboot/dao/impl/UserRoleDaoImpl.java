package com.jinhou.springboot.dao.impl;

import com.jinhou.springboot.dao.UserRoleDao;
import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.domain.UserRolePO;
import com.jinhou.springboot.mapper.UserRoleMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Set;


@Repository("userRoleDaoImpl")
public class UserRoleDaoImpl extends BaseDaoImpl<UserRolePO,Long> implements UserRoleDao {

    @Resource
    UserRoleMapper userRoleMapper;

    public   Set<RolePO> findByUserId(Long  id)
    {

    return  userRoleMapper.findByUserId(id);

    }


    public   Set<RolePO> findByUser(Long  id)
    {

        return  userRoleMapper.findByUserId(id);

    }

}
