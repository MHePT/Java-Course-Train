/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;


public class employee {
    
    String ID;
    String Name;
    int Age;
    double Salary;
    
    public employee(String ID, String Name, int Age, double Salary)
    {
        this.ID=ID;
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;
    }
    
    
    public employee()
    {
        ID="0000";
        Name="New";
        Age=0;
        Salary=100;
        
    }
    
    double CalcTax()
    {
       double t=Salary*0.14;
       return t;
    }
    
    String Data()
    {
        String total=ID+" "+Name+" "+Salary;
        return total;
    }
    
}
