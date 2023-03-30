/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Henawy;

import Henawy.Sales;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Assignment2 extends javax.swing.JFrame {

    /**
     * Creates new form Assignment2
     */
    public Assignment2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        sell = new javax.swing.JButton();
        databtn = new javax.swing.JButton();
        buy = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        earning = new javax.swing.JButton();
        sort = new javax.swing.JButton();
        everycostumer = new javax.swing.JButton();
        random = new javax.swing.JButton();
        enterdata = new javax.swing.JButton();
        Draw = new javax.swing.JButton();
        readata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        sell.setText("Sell");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });

        databtn.setText("Data");
        databtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databtnActionPerformed(evt);
            }
        });

        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        sales.setText("Total Sales");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        earning.setText("Total Earning");
        earning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningActionPerformed(evt);
            }
        });

        sort.setText("sort");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        everycostumer.setText("Buy Detailes");
        everycostumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everycostumerActionPerformed(evt);
            }
        });

        random.setText("random");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        enterdata.setText("Enter Data");
        enterdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterdataActionPerformed(evt);
            }
        });

        Draw.setText("Draw");
        Draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawActionPerformed(evt);
            }
        });

        readata.setText("Read Data");
        readata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(databtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(readata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Draw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(random))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buy))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sell, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(earning, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(everycostumer, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buy)
                .addGap(18, 18, 18)
                .addComponent(sell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(earning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(everycostumer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(random)
                    .addComponent(Draw)
                    .addComponent(databtn)
                    .addComponent(sort)
                    .addComponent(enterdata)
                    .addComponent(readata))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

            //Product y=new Product() {};
            Sales slsclss;
            ArrayList<Sales> Data   = new ArrayList<>();
            ArrayList<Sales> Sorter = new ArrayList<>();
            String client="";
            int count4=0;  
            int QEntered;
            int count1=0;

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed

        int identered=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter ID"));
        int count=0;
        for(int i=0;i<Data.size();i++)
        {
            if(identered==Data.get(i).ID)
            {
                int Qentered=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity"));
                
                Data.get(i).Buy(Qentered);
            }
            if(identered!=Data.get(i).ID)
            {
                count++;
            }
        }
        if(count>=Data.size())
            { 
               JOptionPane.showMessageDialog(this, "Not Found");
            }
    }//GEN-LAST:event_buyActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        
        int count=0;
        int count2=0;
        int count3=0;
        
        int identered=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter ID"));
        for(int i=0;i<Data.size();i++)
        {
            if(identered==Data.get(i).ID)
            {
                count2++;
                count3++;
                count4=i;
            }
            if(identered!=Data.get(i).ID)
            {
                count++;
            }
        }
        
            if(count3==1)
            {
               QEntered=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity"));
               
                if(Data.get(identered).quantity<QEntered)
                    {
                        JOptionPane.showMessageDialog(this, "Insufficient Quantity in stock "+Data.get(identered).quantity+" Left", "Warning", 2);
                    }else
                {
                
                Data.get(count4).sell(QEntered);
                Data.get(count4).earn(QEntered);
                Data.get(count4).totalsell(QEntered);
                Sorter.get(count4).sell(QEntered);
                Sorter.get(count4).earn(QEntered);
                Sorter.get(count4).totalsell(QEntered);
                client=client+"ID:"+Data.get(count4).ID;
                client=client+"\nQuantity Sold"+QEntered;
                client=client+"\nEarn:"+Data.get(count4).total2+"\n\n";
                count1++;
                }
            } 
        if(count2>=2)
           JOptionPane.showMessageDialog(this, "There is "+count2+" Items have same ID");
            
        if(count==Data.size())
           JOptionPane.showMessageDialog(this, "Not Found");
            
        if(Data.get(identered).reclev>=Data.get(identered).quantity)
           JOptionPane.showMessageDialog(this, "Please buy from this product "+Data.get(identered).quantity+" Left", "Warning", 0);
        
        else if(0==Data.get(identered).quantity)
           JOptionPane.showMessageDialog(this, "Please buy from this product "+Data.get(identered).quantity+" Left", "Warning", 0); 
    }//GEN-LAST:event_sellActionPerformed

    private void databtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databtnActionPerformed

        String total= "";
        String total2= "";
        try{
        for(int i=0;i<Data.size();i++)
            {
               String str =Data.get(i).datapro();
               total=total+str+"\n";
               String str2=Data.get(i).data();
               total2=total2+str2+"\n";
            }
        JOptionPane.showMessageDialog(this, total);
        JOptionPane.showMessageDialog(this, total2);
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_databtnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void earningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningActionPerformed

        int total=0;
        for(int i=0;i<Data.size();i++)
        {
            total=total+Data.get(i).total2;
        }
        JOptionPane.showMessageDialog(this, total);
    }//GEN-LAST:event_earningActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed

        int total=0;
        for(int i=0;i<Data.size();i++)
        {
            total=total+Data.get(i).total;
        }
        JOptionPane.showMessageDialog(this, total);
    }//GEN-LAST:event_salesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

       /* String i2;
       for(int i=0;i<5;i++)
        {
            i2=""+i;
         Data.add(slsclss=new Sales(i,i2));
            Sorter.add(slsclss=new Sales(i,i2));
        }*/
    }//GEN-LAST:event_formWindowOpened

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed

        String total= "";
        Sorter.sort(null);
        for(int i=0;i<Sorter.size();i++)
            {
               String str2=Sorter.get(i).data();
               total=total+str2+"\n";
            }
        JOptionPane.showMessageDialog(this, total);       
    }//GEN-LAST:event_sortActionPerformed

    private void everycostumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_everycostumerActionPerformed
 
        JOptionPane.showMessageDialog(this, client);
    }//GEN-LAST:event_everycostumerActionPerformed

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed

        String total="";
        Random r=new Random();
        ArrayList<String> Shuffling=new ArrayList<>();
        
        for(int i=0;i<=5;i++)
        {
        int m=r.nextInt(25);
        m=m+97;
        char c=(char) m;
        String v="";
        v=v+c;
        Shuffling.add(v);
        
        int m1=r.nextInt(25);
        m1=m1+65;
        char c1=(char) m1;
        String v1="";
        v1=v1+c1;
        Shuffling.add(v1);
        
        int m2=r.nextInt(10);
        String v2="";
        v2=v2+m2;
        Shuffling.add(v2);
        }
        
        for (int i=0;i<Shuffling.size();i++)
        {
        int b=r.nextInt(Shuffling.size());
        total=total+Shuffling.get(b);
        }
        
        JOptionPane.showMessageDialog(this, total);
    }//GEN-LAST:event_randomActionPerformed

    private void enterdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterdataActionPerformed

        String name=JOptionPane.showInputDialog(this, "Enter Name");
        int id=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter ID"));
        int quantity=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity"));
        int sellprice=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Sell Price"));
        int buyprice=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Buy Price"));
        int reclev=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Record Level"));
        //Data.add(slsclss=new Sales(id,quantity,sellprice,buyprice,reclev,name));
        //Sorter.add(slsclss=new Sales(id,quantity,sellprice,buyprice,reclev,name));
        
        try {
            FileOutputStream Datafile=new FileOutputStream("/Users/dodo/Desktop/Datafile.txt",true);
            DataOutputStream data=new DataOutputStream(Datafile);
            data.writeUTF(name+"\n");
            data.writeUTF(id+"\n");
            data.writeUTF(quantity+"\n");
            data.writeUTF(sellprice+"\n");
            data.writeUTF(buyprice+"\n");
            data.writeUTF(reclev+"\n");
            data.close();
            Datafile.close();
            
        } 
        catch (Exception e) {
            
        }
    }//GEN-LAST:event_enterdataActionPerformed

    private void DrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawActionPerformed

        int y=0;
        int x1=-80;
        int count=0;
        
        for(int i=0;i<Data.size();i++)
        {
        x1=x1+80;
        JButton btn=new JButton();
        btn.setText(Data.get(i).name);
        btn.setBackground(Color.white);
        btn.setBounds(x1, y, 80, 30);
        this.getContentPane().add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JButton btnclkd=(JButton)e.getSource();
            
            int count1=-1;
            int count2=0;
            int count3=0;
            int count4=0;
            
            for(int q=0;q<Data.size();q++)
            {
            if(btn.getText().equals(Data.get(q).name))
            {
                count2++;
                count3++;
                count4=q;
            }else
            if(!btn.getText().equals(Data.get(q).name))
            
                count1++;
            }
            
            if(count3==1)
            {
               QEntered=Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity"));
               
                if(Data.get(count4).quantity<QEntered)
                    {
                        JOptionPane.showMessageDialog(null, "Insufficient Quantity in stock "+Data.get(count4).quantity+" Left", "Warning", 2);
                    }else
                {
                
                Data.get(count4).sell(QEntered);
                Data.get(count4).earn(QEntered);
                Data.get(count4).totalsell(QEntered);
                Sorter.get(count4).sell(QEntered);
                Sorter.get(count4).earn(QEntered);
                Sorter.get(count4).totalsell(QEntered);
                client=client+"ID:"+Data.get(count4).ID;
                client=client+"\nQuantity Sold"+QEntered;
                client=client+"\nEarn:"+Data.get(count4).total2+"\n\n";
                count1++;
                }
            } 
        if(count2>=2)
           JOptionPane.showMessageDialog(null, "There is "+count2+" Items have same ID");
        
        if(Data.size()==count1)
           JOptionPane.showMessageDialog(null, "Not Found");
            
        if(Data.get(count4).reclev>=Data.get(count4).quantity)
            btnclkd.setBackground(Color.orange);
        
        if(0==Data.get(count4).quantity)
            btnclkd.setBackground(Color.red);
        }
        });
        count++;
        if(Data.size()>5&&count>5)
        {
            y=y+30;
            count=0;
        }
        }
        this.repaint();
        x1=-80;
        y=0;
    }//GEN-LAST:event_DrawActionPerformed

    private void readataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readataActionPerformed

        String str="";
        String str2="";
        int id = 0;
        int quantity=0;
        int sellprice=0;
        int buyprice=0;
        int reclev=0;
        int count=0;
        
        try{
        FileInputStream Datafile=new FileInputStream("/Users/dodo/Desktop/Datafile.txt");
        DataInputStream dataa=new DataInputStream(Datafile);
        
        
        while(Datafile.available()>0)
        {
            str=dataa.readUTF().trim();
            if (count==0)
            {
                str2=str;
                count++;
            }
            else if(count==1)
            {
                id=Integer.parseInt(str);
                count++;
            }else if(count==2)
            {
                quantity=Integer.parseInt(str);
                count++;
            }else if(count==3)
            {
                sellprice=Integer.parseInt(str);
                count++;
            }else if(count==4)
            {
                buyprice=Integer.parseInt(str);
                count++;
            }else if(count==5)
            {
                reclev=Integer.parseInt(str);
               Data.add(slsclss=new Sales(id,quantity,sellprice,buyprice,reclev,str2));
               Sorter.add(slsclss=new Sales(id,quantity,sellprice,buyprice,reclev,str2));
               count=0;
            }
           
        }
        dataa.close();
        Datafile.close();
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getStackTrace());
        }
    }//GEN-LAST:event_readataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Assignment2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Draw;
    private javax.swing.JButton buy;
    private javax.swing.JButton databtn;
    private javax.swing.JButton earning;
    private javax.swing.JButton enterdata;
    private javax.swing.JButton everycostumer;
    private javax.swing.JButton exit;
    private javax.swing.JButton random;
    private javax.swing.JButton readata;
    private javax.swing.JButton sales;
    private javax.swing.JButton sell;
    private javax.swing.JButton sort;
    // End of variables declaration//GEN-END:variables
}
