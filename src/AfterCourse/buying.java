/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

import javax.swing.JOptionPane;

public class buying extends AfterCourse {

    /**
     * Creates new form buying
     */
    public buying() {
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
        payy = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        ids = new javax.swing.JTextField();
        or = new javax.swing.JLabel();
        COURSE = new javax.swing.JComboBox<>();

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

        payy.setText("Pay");
        payy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payyActionPerformed(evt);
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

        ids.setText("ID");
        ids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idsMouseClicked(evt);
            }
        });
        ids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsActionPerformed(evt);
            }
        });

        or.setText("OR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exit)
                                .addGap(174, 174, 174)))
                        .addGap(21, 21, 21)
                        .addComponent(payy))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(COURSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(or))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or)
                .addGap(13, 13, 13)
                .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(COURSE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(payy)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        this .dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

        payy.requestFocus();
    }//GEN-LAST:event_nameActionPerformed

    private void idsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsActionPerformed

        payy.requestFocus();
    }//GEN-LAST:event_idsActionPerformed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked

        name.setText("");
        ids.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void idsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idsMouseClicked

        ids.setText("");
        name.setText("");
    }//GEN-LAST:event_idsMouseClicked

    private void payyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payyActionPerformed

        String str="";
        int count=0;
        if(ids.getText().equals(""))
        {
        for(int i=0;i<students.size();i++)
        {
            if(name.getText().contains(students.get(i).Name)&&count==0)
            {
                count++;
            int conf=JOptionPane.showConfirmDialog(this,"Confirm Name:\n"+students.get(i).Name+"\nID:"+students.get(i).Id+"\nPaid State:"+students.get(i).paid,"Confirming",JOptionPane.YES_NO_CANCEL_OPTION);
            if(conf==JOptionPane.YES_OPTION)
            {
                int amnt=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Amount"));
                str=(String) COURSE.getSelectedItem();
                students.get(i).attend(str);
                students.get(i).paid(amnt);
            }
            }
        }

         count=0;   
        }else if(name.getText().equals(""))
        {

            for(int i=0;i<students.size();i++)
        {
            if(ids.getText().equals(String.valueOf(students.get(i).Id))&&count==0)
            {
                count++;
            int conf=JOptionPane.showConfirmDialog(this ,"Confirm Student:\n"+students.get(i).Getdata(),"Confirming",JOptionPane.YES_NO_CANCEL_OPTION);
            if(conf==JOptionPane.YES_OPTION)
            {
                int amnt=Integer.parseInt(JOptionPane.showInputDialog(this,"Enter Amount"));
                str=(String) COURSE.getSelectedItem();
                students.get(i).attend(str);
                students.get(i).paid(amnt);
            }
            }
        }
            
        }
    }//GEN-LAST:event_payyActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for(int i=0;i<course.size();i++)
        {
            String str=AfterCourse.course.get(i).name;
            COURSE.addItem(str);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(buying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buying.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buying().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COURSE;
    private javax.swing.JButton exit;
    private javax.swing.JTextField ids;
    private javax.swing.JTextField name;
    private javax.swing.JLabel or;
    private javax.swing.JButton payy;
    // End of variables declaration//GEN-END:variables
}