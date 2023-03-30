/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

public class courses {
    int ID;
    int price;
    boolean paid;
    String name;
    int hours;
    int left=price;
    
    public courses()
    {
        ID=0000;
        price=800;
        name="Unnamed Course";
        hours=40;
        left=price;
    }
    
    public courses(String name,int ID,int price,int hours)
    {
        this.ID=ID;
        this.price=price;
        this.name=name;
        this.hours=hours;
        left=price;
    }
    
    int paid(int price)
    {

        if(this.left==price)
        {
            paid=true;
            left=0;
        }
        else if(this.left>=price)
        {
           left=this.left-price;
        }
            
        return left;
    }
    
    String Getdata()
    {
        String total="Name:"+name+"\nID:"+ID+"\nPrice:"+price+"\nDuration:"+hours;
        return total;
    }
}
