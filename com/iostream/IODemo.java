package com.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IODemo {
    public static void main(String[] args) throws IOException {
        Entity entity=new Entity(3, 11, "nono");
        FileOutputStream fo=new FileOutputStream("./com/iostream/objects.dat");
        ObjectOutputStream ob=new ObjectOutputStream(fo);
        ob.writeObject(entity);
        ob.close();
        fo.close();

    }
}
