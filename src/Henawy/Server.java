/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    
    @Override
    public void run()
    {
        String str;
        try{
            ServerSocket s1=new ServerSocket(2000);
            Socket s=s1.accept();
            DataInputStream d1=new DataInputStream(s.getInputStream());
            do{
                str=d1.readLine();
                System.out.println(str);
            }while(!str.equals("bye"));
            
        }catch(Exception e)
        {
            
        }
    }
}
