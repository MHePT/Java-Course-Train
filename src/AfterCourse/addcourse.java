/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

import javax.swing.JOptionPane;

public class addcourse extends AfterCourse {

    /**
     * Creates new form addcourse
     */
    public addcourse() {
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

        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        idd = new javax.swing.JTextField();
        pricee = new javax.swing.JTextField();
        Hours = new javax.swing.JTextField();
        enterid = new javax.swing.JLabel();
        enterprice = new javax.swing.JLabel();
        enterhrs = new javax.swing.JLabel();
        entername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        name.setText("Name");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        idd.setText("ID");
        idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddActionPerformed(evt);
            }
        });

        pricee.setText("Price");
        pricee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceeActionPerformed(evt);
            }
        });

        Hours.setText("Hours");
        Hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoursActionPerformed(evt);
            }
        });

        enterid.setForeground(new java.awt.Color(255, 0, 0));
        enterid.setText("Please Enter ID!");

        enterprice.setForeground(new java.awt.Color(255, 0, 0));
        enterprice.setText("Please Enter Price!");

        enterhrs.setForeground(new java.awt.Color(255, 0, 0));
        enterhrs.setText("Please Enter Hrs!");

        entername.setForeground(new java.awt.Color(255, 0, 0));
        entername.setText("Please Enter Name!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hours, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterid)
                            .addComponent(entername)
                            .addComponent(enterprice)
                            .addComponent(enterhrs))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entername))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enterid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterhrs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(exit)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        setTitle("Adding New Course");
        enterid.setVisible(false);
        entername.setVisible(false);
        enterprice.setVisible(false);
        enterhrs.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked

        name.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

        idd.requestFocus();
        idd.setText("");
        if(name.getText()==null)
        {
            entername.setVisible(true);
        }else{
            entername.setVisible(false);
        }
    }//GEN-LAST:event_nameActionPerformed

    private void iddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddActionPerformed

        pricee.requestFocus();
        pricee.setText("");
        if(idd.getText()==null)
        {
            enterid.setVisible(true);
        }else{
            enterid.setVisible(false);
        }
    }//GEN-LAST:event_iddActionPerformed

    private void priceeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceeActionPerformed

        Hours.requestFocus();
        Hours.setText("");
        if(pricee.getText()==null)
        {
            enterprice.setVisible(true);
        }else{
            enterprice.setVisible(false);
        }
    }//GEN-LAST:event_priceeActionPerformed

    private void HoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoursActionPerformed

        save.requestFocus();
        if(Hours.getText()==null)
        {
            enterhrs.setVisible(true);
        }else{
            enterhrs.setVisible(false);
        }
    }//GEN-LAST:event_HoursActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        this.dispose();
    }//GEN-LAST:event_exitActionPerformed
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        String e2="";
        int counter=0;
        
       // do{
        try{
        e2="";
        int ID=Integer.parseInt(idd.getText());
        int price=Integer.parseInt(pricee.getText());
        int hrs=Integer.parseInt(Hours.getText());
        
        AfterCourse.course.add(stdclss=new student(name.getText(),ID,price,hrs));
        if(crsf==null)
            crsf=new coursefile();
        crsf.start();
        Hours.setText("");
        name.setText("");
        idd.setText("");
        pricee.setText("");
        name.requestFocus();
        counter=0;
            
        }catch(NumberFormatException e){
        
            e2=""+e;
            JOptionPane.showMessageDialog(this, "Please Enter Number Not Charachter at ID,Price and Hours");
            counter++;
        }
       // }while(e2!=null&&counter==0);
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hours;
    private javax.swing.JLabel enterhrs;
    private javax.swing.JLabel enterid;
    private javax.swing.JLabel entername;
    private javax.swing.JLabel enterprice;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idd;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pricee;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}