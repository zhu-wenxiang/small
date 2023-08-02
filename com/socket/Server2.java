package com.socket;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8878);
        Socket server = serverSocket.accept();

        InputStream in = server.getInputStream();
        OutputStream out = server.getOutputStream();

        BufferedReader bufferedIn = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String inWord = bufferedIn.readLine();
            System.out.println("input word is "+inWord);
            if ("bye".equals(inWord)|| inWord==null || inWord.equals(""))
                break;
            StringBuilder st=new StringBuilder(inWord);
            String reply = st.reverse().toString();
            out.write(reply.getBytes());
        }
        serverSocket.close();

    }
}
