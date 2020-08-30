package com.kuang.pojo;

public class UserT {
    private String name;

    public UserT(){
        System.out.println("无参数构造");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
