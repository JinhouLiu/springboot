package com.jinhou.springboot.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommonController {

    @RequestMapping(value={"", "/", "index"})
    @ResponseBody
    public String   index(){

        return "index";
    }


//    @RequestMapping(value="login", method= RequestMethod.GET)
//    @ResponseBody
//    public String   login(){
//
//        return "login";
//    }


    /**
     * Go login
     * @param request
     * @return
     */
    @RequestMapping(value="login")
    public String login(HttpServletRequest request) {
        // 看 FormAuthenticationFilter 对登陆的处理
//        String account = request.getParameter("name");
//        String password = request.getParameter("password");
        Subject subject = SecurityUtils.getSubject();
        if(subject.getPrincipal() == null){
            return "登陆失败";
        }
        Object exceptionKey = request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        if(exceptionKey != null){
            System.out.println("登陆失败");
            return "redirect:/login";
        }else{
            return "redirect:/";            // 自动跳转
        }
    }


    @RequestMapping(value={"main"})
    @ResponseBody
    public String   main(){

        return "main";
    }





}
