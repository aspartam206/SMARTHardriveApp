/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wicaku;

import javax.swing.UIManager;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author wicaku
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
        this.setLocationRelativeTo(null); //center the frame on start
        this.setLookandFeel();
        this.setPlaceholder();

    }

    void setPlaceholder() {
        PromptSupport.setPrompt("Reallocated Sectors Count", iSMART5);
        PromptSupport.setPrompt("Spin Retry Count", iSMART10);
        PromptSupport.setPrompt("Reported Uncorrectable Errors", iSMART187);
        PromptSupport.setPrompt("Command Timeout", iSMART188);
        PromptSupport.setPrompt("Current Pending Sector Count", iSMART197);
        PromptSupport.setPrompt("Uncorrectable Sector Count", iSMART198);
        PromptSupport.setPrompt("Multi-Zone Error Rate", iSMART200);
        PromptSupport.setPrompt("Soft Read Error Rate", iSMART201);
    }

    void setLookandFeel() {
        try {
            
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        System.out.println("Error setting native LAF: " + e);
        }
        /*try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        System.out.println("Error setting native LAF: " + e);
        }*/

        /*try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
        System.out.println("Error setting native LAF: " + e);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inLabel = new javax.swing.JLabel();
        inLabel1 = new javax.swing.JLabel();
        SmartValuePanel = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        label187 = new javax.swing.JLabel();
        label188 = new javax.swing.JLabel();
        label197 = new javax.swing.JLabel();
        label198 = new javax.swing.JLabel();
        iSMART5 = new javax.swing.JTextField();
        iSMART187 = new javax.swing.JTextField();
        iSMART188 = new javax.swing.JTextField();
        iSMART197 = new javax.swing.JTextField();
        iSMART198 = new javax.swing.JTextField();
        SmartOptionalPanel = new javax.swing.JPanel();
        label10 = new javax.swing.JLabel();
        label200 = new javax.swing.JLabel();
        label201 = new javax.swing.JLabel();
        iSMART10 = new javax.swing.JTextField();
        iSMART200 = new javax.swing.JTextField();
        iSMART201 = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        oStatusBtn = new javax.swing.JButton();
        oClear = new javax.swing.JButton();
        oResult = new javax.swing.JLabel();
        ConsolePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oConsole = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S.M.A.R.T Hardrive Checker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        inLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inLabel.setText("S.M.A.R.T stand for Self-Monitoring, Analysis and Reporting Technology");
        inLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        inLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inLabel1.setText("That is some monitoring technology in HDD and SSD");
        inLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SmartValuePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("S.M.A.R.T Value"));
        SmartValuePanel.setToolTipText("Input Value Here");

        label5.setText("5");

        label187.setText("187");

        label188.setText("188");

        label197.setText("197");

        label198.setText("198");

        javax.swing.GroupLayout SmartValuePanelLayout = new javax.swing.GroupLayout(SmartValuePanel);
        SmartValuePanel.setLayout(SmartValuePanelLayout);
        SmartValuePanelLayout.setHorizontalGroup(
            SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label198)
                    .addComponent(label197)
                    .addComponent(label188)
                    .addComponent(label187)
                    .addComponent(label5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iSMART187, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART188, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART197, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART198, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SmartValuePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label187, label188, label197, label198, label5});

        SmartValuePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iSMART187, iSMART188, iSMART197, iSMART198, iSMART5});

        SmartValuePanelLayout.setVerticalGroup(
            SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label187))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label188))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label197))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label198))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SmartValuePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label187, label188, label197, label198, label5});

        SmartValuePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {iSMART187, iSMART188, iSMART197, iSMART198, iSMART5});

        SmartOptionalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Optional Value"));
        SmartOptionalPanel.setToolTipText("Input Value Here");

        label10.setText("10");

        label200.setText("200");

        label201.setText("201");

        javax.swing.GroupLayout SmartOptionalPanelLayout = new javax.swing.GroupLayout(SmartOptionalPanel);
        SmartOptionalPanel.setLayout(SmartOptionalPanelLayout);
        SmartOptionalPanelLayout.setHorizontalGroup(
            SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartOptionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label201)
                    .addComponent(label200)
                    .addComponent(label10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iSMART200, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART201, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSMART10, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SmartOptionalPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iSMART10, iSMART200, iSMART201});

        SmartOptionalPanelLayout.setVerticalGroup(
            SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartOptionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartOptionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iSMART201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label201))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SmartOptionalPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {iSMART10, iSMART200, iSMART201});

        oStatusBtn.setText("Check Status");
        oStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oStatusBtnActionPerformed(evt);
            }
        });

        oClear.setText("Clear");
        oClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oStatusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        oResult.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        oResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oResult.setText("STATUS");
        oResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        oConsole.setEditable(false);
        oConsole.setColumns(20);
        oConsole.setRows(5);
        jScrollPane1.setViewportView(oConsole);

        javax.swing.GroupLayout ConsolePanelLayout = new javax.swing.GroupLayout(ConsolePanel);
        ConsolePanel.setLayout(ConsolePanelLayout);
        ConsolePanelLayout.setHorizontalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        ConsolePanelLayout.setVerticalGroup(
            ConsolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SmartValuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmartOptionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConsolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(inLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addComponent(inLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SmartValuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SmartOptionalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oStatusBtnActionPerformed
        // TODO add your handling code here:
        main app = new main();

        //System.out.println(iSMART5.getText().isEmpty());
        /*if (iSMART5.getText().isEmpty()
        && iSMART10.getText().isEmpty()
        && iSMART187.getText().isEmpty()
        && iSMART188.getText().isEmpty()
        && iSMART197.getText().isEmpty()
        && iSMART198.getText().isEmpty()
        && iSMART200.getText().isEmpty()
        && iSMART201.getText().isEmpty()) {
        oResult.append(app.mCheckStatus());
        } else if (iSMART10.getText().isEmpty()
        && iSMART200.getText().isEmpty()
        && iSMART201.getText().isEmpty()) {
        oResult.append(app.mCheckStatus(
        Double.valueOf(iSMART5.getText()),
        Double.valueOf(iSMART187.getText()),
        Double.valueOf(iSMART188.getText()),
        Double.valueOf(iSMART197.getText()),
        Double.valueOf(iSMART198.getText())));
        } else {
        oResult.append(app.mCheckStatus(
        Double.valueOf(iSMART5.getText()),
        Double.valueOf(iSMART10.getText()),
        Double.valueOf(iSMART187.getText()),
        Double.valueOf(iSMART188.getText()),
        Double.valueOf(iSMART197.getText()),
        Double.valueOf(iSMART198.getText()),
        Double.valueOf(iSMART200.getText()),
        Double.valueOf(iSMART201.getText())));
        }*/
        Double t5, t10, t187, t188, t197, t198, t200, t201;
        Double empty = 0.0;
        try {

            //parse empty to 0.0 value      smart 5
            if (iSMART5.getText().isEmpty()) {
                t5 = empty;
            } else {
                t5 = Double.valueOf(iSMART5.getText());
            }

            //parse empty to 0.0 value      smart 10
            if (iSMART10.getText().isEmpty()) {
                t10 = empty;
            } else {
                t10 = Double.valueOf(iSMART10.getText());
            }

            //parse empty to 0.0 value      smart 187
            if (iSMART187.getText().isEmpty()) {
                t187 = empty;
            } else {
                t187 = Double.valueOf(iSMART187.getText());
            }

            //parse empty to 0.0 value      smart 187
            if (iSMART188.getText().isEmpty()) {
                t188 = empty;
            } else {
                t188 = Double.valueOf(iSMART188.getText());
            }

            //parse empty to 0.0 value      smart 197
            if (iSMART197.getText().isEmpty()) {
                t197 = empty;
            } else {
                t197 = Double.valueOf(iSMART197.getText());
            }

            //parse empty to 0.0 value      smart 198
            if (iSMART198.getText().isEmpty()) {
                t198 = empty;
            } else {
                t198 = Double.valueOf(iSMART198.getText());
            }

            //parse empty to 0.0 value      smart 200
            if (iSMART200.getText().isEmpty()) {
                t200 = empty;
            } else {
                t200 = Double.valueOf(iSMART200.getText());
            }

            //parse empty to 0.0 value      smart 201
            if (iSMART201.getText().isEmpty()) {
                t201 = empty;
            } else {
                t201 = Double.valueOf(iSMART201.getText());
            }
            
            oResult.setText(app.mCheckStatus(t5, t10, t187, t188, t197, t198, t200, t201));
            oConsole.append(app.mCheckConsole());
            
        } catch (NumberFormatException numberFormatException) {
            oResult.setText("unknown: an error has occured");
            oConsole.append(numberFormatException.getMessage());
        }
    }//GEN-LAST:event_oStatusBtnActionPerformed

    private void oClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oClearActionPerformed
        iSMART5.setText("");
        iSMART10.setText("");
        iSMART187.setText("");
        iSMART188.setText("");
        iSMART197.setText("");
        iSMART198.setText("");
        iSMART200.setText("");
        iSMART201.setText("");
        oResult.setText("STATUS");
        oConsole.setText("");
    }//GEN-LAST:event_oClearActionPerformed

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConsolePanel;
    private javax.swing.JPanel SmartOptionalPanel;
    private javax.swing.JPanel SmartValuePanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField iSMART10;
    private javax.swing.JTextField iSMART187;
    private javax.swing.JTextField iSMART188;
    private javax.swing.JTextField iSMART197;
    private javax.swing.JTextField iSMART198;
    private javax.swing.JTextField iSMART200;
    private javax.swing.JTextField iSMART201;
    private javax.swing.JTextField iSMART5;
    private javax.swing.JLabel inLabel;
    private javax.swing.JLabel inLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label187;
    private javax.swing.JLabel label188;
    private javax.swing.JLabel label197;
    private javax.swing.JLabel label198;
    private javax.swing.JLabel label200;
    private javax.swing.JLabel label201;
    private javax.swing.JLabel label5;
    private javax.swing.JButton oClear;
    private javax.swing.JTextArea oConsole;
    private javax.swing.JLabel oResult;
    private javax.swing.JButton oStatusBtn;
    // End of variables declaration//GEN-END:variables
}
