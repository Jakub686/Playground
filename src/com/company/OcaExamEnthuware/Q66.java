package com.company.OcaExamEnthuware;

public class Q66 {
    public static void main(String[] args){
        fo : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break fo;
            }
            System.out.println( "hello");
        }
    }
}
