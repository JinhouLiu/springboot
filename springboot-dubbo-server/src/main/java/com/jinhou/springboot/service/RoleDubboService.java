package com.jinhou.springboot.service;

import com.jinhou.springboot.domain.RolePO;

import java.util.List;

public interface RoleDubboService {

    List<RolePO>   selectByUserId(Long   id);

}
