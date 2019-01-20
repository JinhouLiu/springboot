package com.jinhou.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jinhou.springboot.domain.UserPO;
import org.springframework.stereotype.Component;


@Component
public class UserDubboConsumerService {

    @Reference(version = "1.0.0")
    UserDubboService userDubboService;


    public void printUser() {
        String cityName="温岭";
        UserPO userPO=userDubboService.findByUserId(1L);
        System.out.print(userPO.getId());
        System.out.println(userPO.toString());
    }
}
