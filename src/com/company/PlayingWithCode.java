package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlayingWithCode {

    public static final String DEFAULT_APPLICATION_NAME = "MyDemoApp";
    public static final int MAX_IMAGE_SIZE_KB = 4096;


    public static void main(String args[]) throws IOException {
        File file = new File("D:\\file.txt");
        FileWriter writer = new FileWriter(file,true); // overwrites the file

        writer.write("Hello, World\n");
        writer.close();

    }
}
