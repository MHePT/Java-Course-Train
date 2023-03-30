/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

public class Manager extends employee {
    
    String title;
    
    public Manager()
    {
        title="Sales Manager";
            
    }
    
    public Manager(String ID, String Name, int Age, double Salary,String title)
    {
        super(ID, Name, Age, Salary);
        this.title=title;
    }
    
    String data()
    {
        String total=super.getClass()+"  "+title;
        return total;
    }
}
