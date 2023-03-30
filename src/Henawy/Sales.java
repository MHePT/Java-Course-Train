/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

import Henawy.Product;

public class Sales extends Product implements Comparable<Sales>{
    
    int Qsold;
    int buyprice;
    int totalsell;
    int earn;
    int total2=0;
    int total=0;

    
    public Sales()
    {
        super();
        ID=0000;
        Qsold=0;
        buyprice=80;
        totalsell=0;
    }
    
    public Sales(int ID)
    {
        super(ID);
        Qsold=0;
        buyprice=80;
        totalsell=0;
    }
    
    public Sales(int ID ,String name)
    {
        super(ID,name);
        Qsold=0;
        buyprice=80;
        totalsell=0;
    }
    
    public Sales(int ID,int quantity)
    {
        super(ID,quantity);
        Qsold=0;
        this.buyprice=80;
        totalsell=0;
    }
    
    public Sales(int ID,int quantity,int sellprice,int buyprice)
    {
        super(ID,quantity,sellprice);
        Qsold=0;
        this.buyprice=buyprice;
        this.totalsell=0;
    }
    
    public Sales(int ID, int quantity, int sellprice,int buyprice, int reclev, String name)
    {
        super(ID,quantity,sellprice,reclev,name);
        Qsold=0;
        this.buyprice=buyprice;
        totalsell=0;
    }
    
    @Override
    int sell(int x)
    {
        super.sell(x);
        Qsold=Qsold+x;
        
        return Qsold;
    }
    
    int totalsell(int a)
    {
        totalsell=(sellprice)*a;
        total=total+totalsell;
        return total;
    }
    
    int earn(int a)
    {
        earn=(sellprice-buyprice)*a;
        total2=total2+earn;
        return total2;
    }
    
    @Override
    String data()
    {
        String total1="";  
        total1=total1+"ID:"+ID+"\nQuantity Sold:"+Qsold+"\nBuy Price:"+buyprice+
        "\nSell Price:"+sellprice+"\nTotal Sell:"+totalsell+"\nTotal Earn:"+earn+"\n";
        return total1;
    }
    
    String datapro()
    {
        return super.data();
    }

    @Override
    public int compareTo(Sales o) {
        if(this.earn<o.earn)
            return 1;
        else if (o.earn<this.earn)
            return -1;
        else return 0;
    }
    
    public int compareTo(Sales o,String i) {
        String a="Ascending";
        String d="Descending";
        if(i.equalsIgnoreCase(a))
        {
        if(this.earn<o.earn)
            return 1;
        else if (o.earn<this.earn)
            return -1;
        }
        
        if(i.equalsIgnoreCase(d))
        {
        if(this.earn>o.earn)
            return 1;
        else if (o.earn>this.earn)
            return -1;
        else return 0;
        }else
            return 0;
        
    }
            
   
    
}
