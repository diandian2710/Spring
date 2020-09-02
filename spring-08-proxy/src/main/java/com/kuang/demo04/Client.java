package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserSeviceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserSeviceImpl usrService = new UserSeviceImpl();
        //代理角色，不存在
        ProxyInvocationhandler pih = new ProxyInvocationhandler();
        pih.setTarget(usrService); //设置代理的对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
        proxy.add();
        proxy.query();
    }
}
