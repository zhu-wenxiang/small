package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        Socket client1=new Socket(InetAddress.getLocalHost(), 8888);

        InputStream in = client1.getInputStream();
        byte[] inBytes=new byte[1024];
        int len;
        while((len=in.read(inBytes))!=-1){
            System.out.println(new String(inBytes, 0, len ));
        }
        client1.close();
    }
}
