package com.kuang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
//   Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//        new Class<?>[] { Foo.class },
//        handler);

public class ProxyInvocationhandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;
    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(rent, args);
        return null;
    }
}
