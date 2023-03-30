/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

import javax.swing.JOptionPane;

public class bankacc {
    
    String Name;
    String Address;
    int ID;
    double Money;
    int withdrawal;
    double deposit;
    
    public bankacc()
    {
        Name="Unnamed";
        ID=1111;
        Money=100;
        Address="No data";
    }
    
    public bankacc(String n,int i,double m)
    {
        Name=n;
        ID=i;
        Money=m;
    }
    
    String Data()
    {
        String total="ID:"+ID+"\nName:"+Name+"\nAddress:"+Address+"\nMoney:"+Money;
        return total;
    }
    
    double CalcTax()
    {
        Double total=Money*0.14;
        return total;
    }
    
    double Money()
    {
        
        return Money;
    }
    
    double withdrawal()
    {
        int total = 0;
        double amount=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Withdrawal amount"));
        if(amount<=Money)
        {
        Money=Money-amount;
        }
        if(amount>=Money)
        {
            JOptionPane.showMessageDialog(null, "Insufficient funds");
        }
       return Money; 
    }
    
    double deposit()
    {
        double amount=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Deposit amount"));
        
        Money=Money+amount;
      
        
        return Money;
    }

}
