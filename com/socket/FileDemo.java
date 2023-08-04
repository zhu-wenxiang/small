package com.socket;

import java.io.File;
import java.io.Reader;

public class FileDemo {
    public static void main(String[] args) {
        // 递归列出文件夹中的所有文件
        File myFile = new File("/Users/jasonzhu/Pictures");
        findAllFiles(myFile);

    }

    public static void findAllFiles(File file) {
        System.out.println(file);
        if ((!(file.getName().endsWith(".photoslibrary")))||file.isDirectory()  ) {
            for (File item : file.listFiles()) {
                findAllFiles(item);
            }
        } else
            System.out.println(file.getName());

    }
}
