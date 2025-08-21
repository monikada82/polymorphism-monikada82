package com.driver;

public class Main {
    static class Product{
       public int product(int x,int y){
           return x*y;
       }
       public int product(int x,int y,int z){
           return x*y*z; //product
       }
       public double product(double x,double y){
           return x*y;
       }
   }
    public static void main(String[] args){
        Product p=new Product();
        System.out.println(p.product(10,3));
        System.out.println((p.product(5,1,9)));
        System.out.println(p.product(4.6,9.0));
    }
}


