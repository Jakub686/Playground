package com.company.chapter2;

public class B_17 {

    static void b_17(){

         boolean keepGoing = true;
         int result = 15, i = 10;
         do {
             i--;
             if(i==8) keepGoing = false;
             result -= 2;
             } while(keepGoing);
        System.out.println(result);




    }

}
