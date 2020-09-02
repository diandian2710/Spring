package com.kuang.demo02;

public class UserServiceProxy  implements UserService{

    UserSeviceImpl userSevice;

    public void setUserSevice(UserSeviceImpl userSevice) {
        this.userSevice = userSevice;
    }

    public void add() {
        log("add");
        userSevice.add();

    }

    public void delete() {
        log("delete");
        userSevice.delete();
    }

    public void update() {
        log("update");
        userSevice.update();
    }

    public void query() {
        log("query");
        userSevice.query();
    }
    //日志方法
    public void log(String msg){
        System.out.println("使用了" + msg + "方法");
    }
}
