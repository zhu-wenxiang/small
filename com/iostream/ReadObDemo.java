package com.iostream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadObDemo {
    
    public static void main(String[] args) {
        try (

            FileInputStream fos=new FileInputStream("./com/iostream/objects.dat");
            //new DataOutputStream(fos);


        ){
            
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
