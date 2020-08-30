package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.kuang.pojo.User"/>
//@Component组件
@Component
public class User {
    public String name;
    //相当于<property name="name" value="XihengWang"/>
    @Value("XihengWang")
    public void setName(String name) {
        this.name = name;
    }
}
