package com.jinhou.springboot.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
    public String   index(HttpServletRequest request){

        System.out.println(request.getHeaderNames());
        return "index";
    }


    @RequestMapping(value="login", method= RequestMethod.GET)
    @ResponseBody
    public String   login(){

        return "login";
    }


    /**
     * Go login
     * @param request
     * @return
     */
    @RequestMapping(value="login", method= RequestMethod.POST)
    public String login(HttpServletRequest request, RedirectAttributes redriect) {
        String account = request.getParameter("name");
        String password = request.getParameter("password");

        UsernamePasswordToken upt = new UsernamePasswordToken(account, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(upt);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            redriect.addFlashAttribute("errorText", "您的账号或密码输入错误!");
            return "redirect:/login";
        }
        return "";
    }


     @RequestMapping(value={"main"})
    @ResponseBody
    public String   main(){

        return "main";
    }





}
