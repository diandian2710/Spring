package com.kuang.demo01;

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
