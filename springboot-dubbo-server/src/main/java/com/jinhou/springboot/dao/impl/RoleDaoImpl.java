package com.jinhou.springboot.dao.impl;

import com.jinhou.springboot.dao.RoleDao;
import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("roleDaoImpl")
public class RoleDaoImpl implements RoleDao{



    @Resource
    RoleMapper roleMapper;

    @Override
    public List<RolePO> findByUserId(Long id) {
        return roleMapper.selectByUserId(id);
    }
}
