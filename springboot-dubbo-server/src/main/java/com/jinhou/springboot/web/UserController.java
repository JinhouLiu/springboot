package com.jinhou.springboot.web;


import com.jinhou.springboot.common.Page;
import com.jinhou.springboot.common.Pageable;
import com.jinhou.springboot.domain.UserPO;
import com.jinhou.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping(value={"page"})
    @ResponseBody
    public Page<UserPO> page(){
        Pageable   pageable=new Pageable();
        Page<UserPO>  page=new Page<>(userService.findAll(),userService.count(),pageable);
        return  page;
    }

}
