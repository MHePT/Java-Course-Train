/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

public class threading extends Thread{
    
    @Override
    public void run()
    {
        for(int i=0;i<1000000;i++)
        {
            System.out.print(i);
        }
    }
    
}
