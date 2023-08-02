package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

    public static void main(String[] args) throws IOException {
        ServerSocket server1=new ServerSocket(8888);
        Socket serverSocket= server1.accept();

        OutputStream out= serverSocket.getOutputStream();
        InputStream in = serverSocket.getInputStream();
        String hello="欢迎光临"+serverSocket.getInetAddress().getHostAddress()+" "+server1.getInetAddress().getHostName();
        out.write(hello.getBytes());
        serverSocket.close();

    }
    
}
