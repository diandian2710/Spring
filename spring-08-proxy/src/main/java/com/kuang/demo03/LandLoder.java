package com.kuang.demo03;

//房东
public class LandLoder implements Rent {
//   public void rent(){
//      System.out.println("房东要租房");
//   }

   public void rent(String str) {
      System.out.println("房东要租房" + str);

   }

   public void bill(int a) {
      System.out.println("房东给中介的房租是" + a);
   }
}
