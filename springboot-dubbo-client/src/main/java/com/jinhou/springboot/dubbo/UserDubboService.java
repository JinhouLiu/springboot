package com.jinhou.springboot.dubbo;

import com.jinhou.springboot.domain.UserPO;

public interface UserDubboService {

    UserPO findByUserId(Long id);
}
