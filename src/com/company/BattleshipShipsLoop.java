package com.company;

public class BattleshipShipsLoop {
    public static void main(String[] args) {

        int[] shipFive = new int[10];

        int[] coordinates = {0,1,0,1,0,1,0,1,2,3};
        for(int i =0; i<=9 ; i++){
            shipFive[i]=coordinates[i];
            if(i==3)
                shipFive[i]=coordinates[i]+1;
            if(i==5)
                shipFive[i]=coordinates[i]+2;
            if(i==7)
                shipFive[i]=coordinates[i]+3;
        }
    }
}
