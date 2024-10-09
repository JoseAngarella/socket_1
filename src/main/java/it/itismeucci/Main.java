package it.itismeucci;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(5673);
            Socket mys = ss.accept();

            System.out.println("qualcuno si è collegato");
            BufferedReader in = new BufferedReader(new InputStreamReader(mys.getInputStream()));
            DataOutputStream out=new DataOutputStream(mys.getOutputStream());
            
            String stringaRicevuta= in.readLine();
            System.out.println("stringa ricevuta= "+stringaRicevuta);

            String stringMaiuscola = stringaRicevuta.toUpperCase();
            out.writeBytes(stringMaiuscola+'\n');

            mys.close();
            ss.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
            
    }
}   