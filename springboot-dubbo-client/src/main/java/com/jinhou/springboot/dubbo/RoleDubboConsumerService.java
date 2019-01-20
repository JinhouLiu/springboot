package com.jinhou.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jinhou.springboot.domain.RolePO;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public class RoleDubboConsumerService implements RoleDubboService{


    @Reference(version = "1.0.0")
    RoleDubboService roleDubboService;

    @Override
    public List<RolePO> selectByUserId(Long id) {
        return roleDubboService.selectByUserId(id);
    }
}
