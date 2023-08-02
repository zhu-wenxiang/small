package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        byte[] address = { 127, 0, 0, 1 };
        InetAddress servAddress = InetAddress.getByAddress(address);
        Socket c2Socket = new Socket(servAddress, 8878);
        OutputStream outputStream = c2Socket.getOutputStream();
        InputStream inputStream = c2Socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String info = "hello world";
        outputStream.write(info.getBytes());

        System.out.println(br.readLine());
        c2Socket.close();

    }

}
