package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        LandLoder landLoder = new LandLoder();
        //代理,中介帮房东租房子，但是代理一般会有一些附属操作
        Proxy proxy = new Proxy(landLoder);
        //你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
