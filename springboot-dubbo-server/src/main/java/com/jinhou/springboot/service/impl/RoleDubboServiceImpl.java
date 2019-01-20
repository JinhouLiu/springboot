package com.jinhou.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jinhou.springboot.dao.RoleDao;
import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.service.RoleDubboService;

import javax.annotation.Resource;
import java.util.List;


@Service(version = "1.0.0")
public class RoleDubboServiceImpl  implements RoleDubboService {

    @Resource(name = "roleDaoImpl")
    private RoleDao roleDao;

    @Override
    public List<RolePO> selectByUserId(Long id) {
        return roleDao.findByUserId(id);
    }
}
