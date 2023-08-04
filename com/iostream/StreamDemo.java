package com.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
//字节流的基本使用
public class StreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fileIn=new FileInputStream("1.txt");
        FileOutputStream fileOut=new FileOutputStream("2.txt",true);
        byte[] readIt=new byte[1024];
        int len=0;
        int b=0;
        while((b=fileIn.read())!=-1){
            System.out.println((char)b);
        }
        while((len=fileIn.read(readIt))!=-1){
            fileOut.write(readIt, 0, len);
        }
    }
}