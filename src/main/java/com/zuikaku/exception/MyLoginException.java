package com.zuikaku.exception;

public class MyLoginException extends Exception{
    private String msg;

    public String getMsg() {
        return msg;
    }
    public MyLoginException(String msg)
    {
        super();
        this.msg=msg;
        System.out.println("产生了登录异常"+msg);
    }
}
