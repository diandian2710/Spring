##角色分析
- 抽象角色：一般会使用接口或者抽象类来解决：Rent Interface
- 真实角色： 被代理的角色: Landloder
- 代理角色： 代理真实角色， 代理真实角色后， 我们一般会做一些附属操作: Proxy
- 客户： 访问代理对象的人: Client

##代码步骤：
1. 接口
```
//租房接口
public interface Rent {
}
```
2. 真实角色
```
//房东
public class LandLoder implements Rent{
   public void rent(){
      System.out.println("房东要租房");
   }
}
```
3. 代理角色
```
public class Proxy implements Rent {
    private LandLoder landLoder;

    public Proxy() {
    }

    public Proxy(LandLoder landLoder) {
        this.landLoder = landLoder;
    }

   public void rent(){
        landLoder.rent();
        seeHouse();
        commission();
        signContract();
   }

   public void seeHouse(){
       System.out.println("中介带你看房k");
   }

   public void commission(){
       System.out.println("收中介费");
   }

   public void signContract(){
       System.out.println("签合同");
   }

}

```
4. 客户端访问代理角色
```
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
```

##代理模式的好处
- 可以使真实角色的操作更加纯粹!不用去关注一些公共的业务
- 公共也就交给代理角色！实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理!

##缺点
- 一个真实角色就会产生一个代理角色， 从而导致代码量翻倍, 开发效率会变低

##加深理解


