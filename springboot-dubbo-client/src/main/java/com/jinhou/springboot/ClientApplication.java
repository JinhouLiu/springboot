package com.jinhou.springboot;

import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.dubbo.RoleDubboConsumerService;
import com.jinhou.springboot.dubbo.UserDubboConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        UserDubboConsumerService userService = run.getBean(UserDubboConsumerService.class);
        userService.printUser();


        RoleDubboConsumerService  roleDubboConsumerService=run.getBean(RoleDubboConsumerService.class);
         List<RolePO>  list=roleDubboConsumerService.selectByUserId(1L);

         for (RolePO  role : list)
         {

            System.out.print(role.getId());

         }
    }
}
