package com.kuang.demo02;

public class UserSeviceImpl implements UserService{

    public void add() {
        System.out.println("add user");
    }

    public void delete() {
        System.out.println("delete a user");
    }

    public void update() {
        System.out.println("update a user");
    }

    public void query() {
        System.out.println("query a user");
    }

    //1.改变原有的业务代码，在公司中是大忌
    //
}
