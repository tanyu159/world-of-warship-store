package com.zuikaku.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        //获取请求
        String URI=request.getRequestURI();
        if(!URI.contains("login"))
        {
            //不是登陆请求则拦截
            Object user = request.getSession().getAttribute("user");
            if(user==null)
            {
                //没有登陆
                response.sendRedirect(request.getContextPath()+"/login/log");
                return false;
            }
        }
        return true;//true表示不拦截,false被拦截就不再执行了

    }
}
