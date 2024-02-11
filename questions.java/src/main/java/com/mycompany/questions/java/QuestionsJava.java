
package com.mycompany.questions.java;

public class QuestionsJava {
    int id;
    String name;
    
   void Display(){
       System.out.println(id+" "+name);
   }
    public static void main(String[] args) {
          QuestionsJava b= new QuestionsJava();
          QuestionsJava n1=new QuestionsJava();
          b.Display();
          n1.Display();
        
    }
}
