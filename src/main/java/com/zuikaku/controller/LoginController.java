package com.zuikaku.controller;

import com.zuikaku.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.zuikaku.exception.MyLoginException;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login/")
public class LoginController {
    //登陆请求

    //登陆成功 重定向到列表页
    @RequestMapping(value = "log",method = RequestMethod.POST)
    public String login(User user, HttpSession session) throws MyLoginException
    {

        //判断用户

        System.out.println("输入的用户名"+user.getUsername());
        System.out.println("输入的密码"+user.getPassword());


        if(IsAdmin(user)) {//判断是管理员后 重定向到列表页
            session.setAttribute("user",user);
        }else {
            throw new MyLoginException("非后台管理员或密码错误");
        }

        return "redirect:/admin/items";
    }
    //登陆失败 前往登陆页面
    @RequestMapping(value = "log",method = RequestMethod.GET)
    public String login()
    {

        //定向到登陆页
        return "/admin/login_page";
    }

    //判断是不是管理员
    public boolean IsAdmin(User user)
    {
        boolean isadmin=false;
        if(user.getUsername().equals("谭宇")&&user.getPassword().equals("660317"))
        {
            isadmin=true;
        }
        return isadmin;
    }

}
