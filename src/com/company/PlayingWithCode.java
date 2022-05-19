package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class PlayingWithCode {
    public static void main(String args[]) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\java examples\\java\\play\\src\\com\\company\\bufferWriter\\sb.json"));
            writer.write("bla bla");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
