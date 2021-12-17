package com.company.chapter5.this1;
//this - Słowo kluczowe this jest odniesieniem do bieżącego obiektu, czyli np. obiektu którego metodę właśnie wywołujemy. Za pomocą this możemy się odnieść np. do pól, metod czy konstruktorów klasy danego obiektu
public class thiss {
    int x;
    // Constructor with a parameter
    public thiss(int x) {
        this.x = x;
    }
    public static void main(String[] args) {
        thiss myObj = new thiss(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
