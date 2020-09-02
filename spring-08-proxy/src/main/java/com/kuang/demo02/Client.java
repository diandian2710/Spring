package com.kuang.demo02;

public class Client {
    public static void main(String[] args) {
        UserSeviceImpl userSevice = new UserSeviceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserSevice(userSevice);
        userServiceProxy.add();
        userServiceProxy.delete();
    }
}
