/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

public class student extends courses {
    
    String Name;
    int Id;
    String level;
    boolean passed;
    String Courseattended="None";
    
    public student()
    {
        Name="New Unnamed Student";
        Id=0000;
        level="Level 0";
        paid=false;
        passed=true;
    }
    
    public student(String name,int ID,int price,int hours)
    {
        super(name,ID,price,hours);
        
    }
    
    public student(String Name,int Id)
    {
        this.Name=Name;
        this.Id=Id;
        level="Level 0";
        paid=false;
        passed=true;
    }
    
    public student(String Name,int Id,String Level,boolean paid)
    {
        super();
        this.Name=Name;
        this.Id=Id;
        this.level=Level;
        this.paid=paid;
    }
    
    public student(String Name,int Id,String Level)
    {
        super();
        this.Name=Name;
        this.Id=Id;
        this.level=Level;
        this.paid=false;
    }
    
    public student(String Name,int Id,String Level,boolean paid,String name,int ID,int price,int hours)
    {
        super(name,ID,price,hours);
        this.Name=Name;
        this.Id=Id;
        this.level=Level;
        this.paid=paid;
    }
    public student(String Name,int Id,String Level,String name,int ID,int price,int hours)
    {
        super(name,ID,price,hours);
        this.Name=Name;
        this.Id=Id;
        this.level=Level;
        this.paid=false;
    }
    
    
    String levup(int deg)
    {
        String lvl;
        lvl="Level "+deg;
        return lvl;
    }
    
    String attend(String course)
    {
        Courseattended=course;
        return Courseattended;
    }
    
    String GetDatas(){
        
        String total="Name:"+Name+"\nID:"+Id+"\nLevel:"+level+"\nPaid:"+paid+"\nLeft:"+left;
        
        return total;
    }
    
    
}
