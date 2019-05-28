package com.zuikaku.exception;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyGlobalException {

    //处理登录异常
    @ExceptionHandler(MyLoginException.class)
    String myHandler(MyLoginException e, Model model)
    {
        model.addAttribute("errorMsg",e.getMsg());//前台对应的是这个名字errorMsg
        System.out.println("全局异常产生了登录异常"+e.getMsg());
        return "admin/login_page";
    }
}
