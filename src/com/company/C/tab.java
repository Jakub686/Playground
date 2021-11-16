package com.company.C;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class tab {

    public static void main(String[] args) {
        int tab[][] = {{1, 2, 3, 7}, {4, 5, 6}};
        for (int i = 0; i < tab.length; i++) {
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(tab.length);

    }
}

/*
aaaaa
aaaaa
aaaaa
 */
