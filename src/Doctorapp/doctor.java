/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctorapp;

import javax.swing.JOptionPane;

/**
 *
 * @author dodo
 */
public class doctor extends patient {

    /**
     * Creates new form doctor
     */
    public doctor() {
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
        logout = new javax.swing.JButton();
        nextptnt = new javax.swing.JLabel();
        curntptnt = new javax.swing.JLabel();
        prvsptnt = new javax.swing.JLabel();
        nxttxt = new javax.swing.JTextField();
        crnttxt = new javax.swing.JTextField();
        pvstxt = new javax.swing.JTextField();
        detcrnt = new javax.swing.JButton();
        detnxt = new javax.swing.JButton();
        detprvs = new javax.swing.JButton();
        ttlptnt = new javax.swing.JLabel();
        ptntlft = new javax.swing.JLabel();
        ttlptns = new javax.swing.JLabel();
        ptntlftt = new javax.swing.JLabel();
        ttlmny = new javax.swing.JLabel();
        ttlmnyy = new javax.swing.JLabel();
        nxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
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

        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        nextptnt.setText("Next Patient:");

        curntptnt.setText("Current Patient:");

        prvsptnt.setText("Previous Patient:");

        detcrnt.setText("Details");
        detcrnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detcrntActionPerformed(evt);
            }
        });

        detnxt.setText("Details");
        detnxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detnxtActionPerformed(evt);
            }
        });

        detprvs.setText("Details");
        detprvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detprvsActionPerformed(evt);
            }
        });

        ttlptnt.setText("Total Patients:");

        ptntlft.setText("Patient Left:");

        ttlptns.setText("jLabel3");

        ptntlftt.setText("jLabel4");

        ttlmny.setText("Total Money:");

        ttlmnyy.setText("jLabel6");

        nxt.setText("Next");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nextptnt)
                                .addGap(35, 35, 35)
                                .addComponent(nxttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detnxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prvsptnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pvstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detprvs))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(curntptnt)
                                .addGap(18, 18, 18)
                                .addComponent(crnttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detcrnt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nxt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ttlptnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttlptns))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ptntlft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ptntlftt)))
                        .addGap(75, 75, 75)
                        .addComponent(ttlmny)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttlmnyy)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextptnt)
                    .addComponent(nxttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detnxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(curntptnt)
                            .addComponent(crnttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detcrnt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nxt)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prvsptnt)
                    .addComponent(pvstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detprvs))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttlptnt)
                    .addComponent(ttlptns)
                    .addComponent(ttlmny)
                    .addComponent(ttlmnyy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptntlft)
                    .addComponent(ptntlftt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(logout)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int crntno;
    int lft;
    int total;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(1);
    }//GEN-LAST:event_exitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for(int i=0;i<ptns.size();i++)
        {
           total=total+ptns.get(i).payed;
        }
        crnttxt.setText(""+ptns.get(0).name);
        pvstxt.setText(""+ptns.get(1).name);
        ttlmnyy.setText(""+total);
        ttlptns.setText(""+ptns.size()+1);
        ptntlftt.setText(""+ptns.size()+1);
    }//GEN-LAST:event_formWindowOpened

    private void detcrntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detcrntActionPerformed
        
        if(crntno==ptns.size())
        JOptionPane.showMessageDialog(this, ptns.get(crntno).Getdata());
    }//GEN-LAST:event_detcrntActionPerformed

    private void detnxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detnxtActionPerformed

        if(crntno+1<=ptns.size())
        JOptionPane.showMessageDialog(this, ptns.get(crntno+1).Getdata());
    }//GEN-LAST:event_detnxtActionPerformed

    private void detprvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detprvsActionPerformed

        if(crntno-1>=ptns.size())
        JOptionPane.showMessageDialog(this, ptns.get(crntno-1).Getdata());
    }//GEN-LAST:event_detprvsActionPerformed

    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed

        crntno=crntno+1;
        lft=lft-1;
        ptntlftt.setText(""+ptns.size()+1+lft);
        crnttxt.setText(""+ptns.get(crntno).name);
        pvstxt.setText(""+ptns.get(crntno-1).name);
        nxttxt.setText(""+ptns.get(crntno+1).name);
    }//GEN-LAST:event_nxtActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        for(int i=0;i<ptns.size();i++)
        {
           total=total+ptns.get(i).payed;
        }
        ttlmnyy.setText(""+total);
        ttlptns.setText(""+ptns.size()+1);
        ptntlftt.setText(""+ptns.size()+1);
    }//GEN-LAST:event_formWindowGainedFocus

    LogIn lgin;
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        this.setVisible(false);
            dispose();
        if(lgin==null) 
               lgin=new LogIn();
        lgin.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField crnttxt;
    private javax.swing.JLabel curntptnt;
    private javax.swing.JButton detcrnt;
    private javax.swing.JButton detnxt;
    private javax.swing.JButton detprvs;
    private javax.swing.JButton exit;
    private javax.swing.JButton logout;
    private javax.swing.JLabel nextptnt;
    private javax.swing.JButton nxt;
    private javax.swing.JTextField nxttxt;
    private javax.swing.JLabel prvsptnt;
    private javax.swing.JLabel ptntlft;
    private javax.swing.JLabel ptntlftt;
    private javax.swing.JTextField pvstxt;
    private javax.swing.JLabel ttlmny;
    private javax.swing.JLabel ttlmnyy;
    private javax.swing.JLabel ttlptns;
    private javax.swing.JLabel ttlptnt;
    // End of variables declaration//GEN-END:variables
}