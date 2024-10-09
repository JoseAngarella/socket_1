package it.itismeucci;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket ss = new ServerSocket(5673);
        Socket mys = ss.accept();

        System.out.println("qualcuno si è collegato");
    }
}