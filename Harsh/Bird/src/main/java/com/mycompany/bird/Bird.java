/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bird;

/**
 *
 * @author av152
 */
public class  Bird {
    
    void fly(){
        System.out.println(" bird fly");  
    }  
      static class   Parrot extends Bird{
       void showColor(){
           System.out.println("yellow color");
   }
      }
    

    public static void main(String[] args) {
           Parrot ob=new Parrot();
           ob.fly();
           ob.showColor();
    }

}