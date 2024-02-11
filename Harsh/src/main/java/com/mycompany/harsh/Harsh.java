/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harsh;

/**
 *
 * @author av152
 */
public class Harsh {
    void showParent() {
        System.out.println("in shhow parent");

    }

    class Child extends Parent {
        void showChild() {
            System.out.println("in the child class  ");
        }

    }

    public static void main(String[] args) {
        Child ob = new Child();
        ob.showChild();
        ob.showParent();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
