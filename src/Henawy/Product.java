/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

 abstract class Product {
    
    int quantity;
    String name;
    int ID;
    int reclev;
    int sellprice;
    
    public Product()
    {
        quantity=20;
        name="Unnamed product";
        ID=0000;
        reclev=10;
        sellprice=100;
    }
    
    public Product(int ID)
    {
        quantity=20;
        name="Unnamed product";
        this.ID=ID;
        reclev=10;
        sellprice=100;
    }
    
    public Product(int ID,String name)
    {
        quantity=20;
        this.name=name;
        this.ID=ID;
        reclev=10;
        sellprice=100;
    }
    
    public Product(int ID ,int quantity)
    {
        this.quantity=quantity;
        name="Unnamed product";
        this.ID=ID;
        reclev=10;
        sellprice=100;
    }
    
    public Product(int ID,int quantity, int sellprice)
    {
        this.quantity=quantity;
        name="Unnamed product";
        this.ID=ID;
        reclev=10;
        this.sellprice=sellprice;
    }
    
    public Product(int ID, int quantity, int sellprice, int reclev)
    {
        this.quantity=quantity;
        name="Unnamed product";
        this.ID=ID;
        this.reclev=reclev;
        this.sellprice=sellprice;
    }
    
    public Product(int ID, int quantity, int sellprice, int reclev, String name)
    {
        this.quantity=quantity;
        this.name=name;
        this.ID=ID;
        this.reclev=reclev;
        this.sellprice=sellprice;
    }
    
    int Buy(int add)
    {
        quantity=quantity+add;
        return quantity;
    }
    
    int sell(int sell)
    {
        if(sell<=quantity)
            quantity=quantity-sell;
        return quantity;
    }
    
    String data()
    {
        String total="";
        
        total=total+"Quantity:"+quantity+"\nID:"+ID+"\nName:"+name+"\nPrice:"+sellprice+"\nMin Level of Q:"+reclev+"\n";
        
        return total;
    }
    
}
