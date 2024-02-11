/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parent;

/**
 *
 * @author av152
 */
public class Parent {
    void showParent() {
        System.out.println("in shhow parent");

    }

  static class Child extends Parent {
        void showChild() {
            System.out.println("in the child class  ");
        }

    }

    

    public static void main(String[] args) {
     Child ob = new Child();
        ob.showChild();
        ob.showParent();
    }
}
