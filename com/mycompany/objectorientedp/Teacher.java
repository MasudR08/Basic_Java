
package com.mycompany.objectorientedp;


public class Teacher {
  
    String name,gender;
    int age,phone;
    
   Teacher(String n,String g,int p,int a){
       name=n;
       gender=g;
       phone=p;
       age=a;
   }
    
    void DisplayInformation(){
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
        System.out.println("Phone :"+phone);
       
    }
}
