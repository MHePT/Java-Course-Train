/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctorapp;

public class patients {
    
    String name;
    String Address;
    int ID;
    int age;
    int phoneno;
    int payed;
    int payleft;
    
    public patients(){
        
         name="Unnamed Patient";
         Address="Unknown Address";
         ID=00;
         age=10;
         phoneno=00000000000;
         payed=0;
         payleft=120;
    }
    
    public patients(String name){
        
         this.name=name;
         Address="Unknown Address";
         ID=00;
         age=10;
         phoneno=00000000000;
         payed=0;
    }
    
    public patients(String name,int age,int ID,int phoneno){
        
         this.name=name;
         Address="Unknown Address";
         ID=00;
         this.age=age;
         this.phoneno=phoneno;
         this.payed=payed;
    }
    
    public patients(String name,int age,int ID){
        
         this.name=name;
         Address="Unknown Address";
         this.ID=ID;
         this.age=age;
         phoneno=00000000000;
         payed=0;
    }
    
    public patients(String name,String Address,int ID){
        
         this.name=name;
         this.Address=Address;
         this.ID=ID;
         age=10;
         phoneno=00000000000;
         payed=0;
    }
    
    public patients(String name,String Address,int age,int ID){
        
         this.name=name;
         this.Address=Address;
         this.ID=ID;
         this.age=age;
         phoneno=00000000000;
         payed=0;
    }
    
    public patients(String name,String Address,int ID,int age,int phoneno){
        
         this.name=name;
         this.Address=Address;
         this.ID=ID;
         this.age=age;
         this.phoneno=phoneno;
         this.payed=0;
    }
    
    public patients(String name,String Address,int ID,int age,int phoneno,int payed){
        
         this.name=name;
         this.Address=Address;
         this.ID=ID;
         this.age=age;
         this.phoneno=phoneno;
         this.payed=payed;
    }
    
    
    String buying(int amount){
       
        if(amount<=payleft)
        {
            payleft=payleft-amount;
            payed = payed+amount;
        }
        String total="Payed:"+payed+"\nLeft:"+payleft;
        return total;
    }
    
    String Getdata(){
        
        String total="Name:"+name+"\nAge:"+age+"\nAddress:"+Address+"\nPhone No:"+phoneno+"\nID:"+ID+"\n";
        return total;
    }
}
