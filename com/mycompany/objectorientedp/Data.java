
package com.mycompany.objectorientedp;

public class Data {
    String name,gender;
    int age,phone;
    
    void setDisplay(String n,String g,int a,int p){
        
        name=n;
        gender=g;
        age=a;
        phone=p;
    }
    
    void DisplayInformation(){
       System.out.println("Name is :"+name);
       System.out.println("Gender is :"+gender);
       System.out.println("Age is :"+age);
       System.out.println("Phone is :"+phone);
    }

    
   public static void main(String[] args) {
   Data data1 = new Data();
   data1.setDisplay("Masud Rana", "Male",25,1710312227);
   data1.DisplayInformation();
       System.out.println();
   
   Data data2=new Data();
   data2.setDisplay("Konok Hossain", "Male", 25, 1882972408);
   data2.DisplayInformation();
   
   }
 }