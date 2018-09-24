/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view;

import wca_app.model.Competition;
import wca_app.model.Competitor;
import wca_app.model.Result;
import wca_app.model.Scramble;

/**
 *
 * @author Mata
 */
public class DeleteProgresForm extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProgresForm
     */
    public DeleteProgresForm(int max) {
        initComponents();
        deletePrb.setMaximum(max);
    }

    public void changeAppearance(int i, int max, Competition competition){
        deletePrb.setValue(i);
        infoLbl.setText("Deleting: " + competition.getName());
        percentageLbl.setText(i + "/" + max);
    }
    
    public void changeAppearance(int i, int max, Competitor competitor){
        deletePrb.setValue(i);
        infoLbl.setText("Deleting: " + competitor.getFirstName() + " "
                + competitor.getLastName());
        percentageLbl.setText(i + "/" + max);
    }
    
    public void changeAppearance(int i, int max, Scramble scramble){
        deletePrb.setValue(i);
        infoLbl.setText("Deleting: " + scramble.getScramble());
        percentageLbl.setText(i + "/" + max);
    }
    
    public void changeAppearance(int i, int max, Result result){
        deletePrb.setValue(i);
        infoLbl.setText("Deleting: " + result.getId());
        percentageLbl.setText(i + "/" + max);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletePrb = new javax.swing.JProgressBar();
        infoLbl = new javax.swing.JLabel();
        percentageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deletePrb.setForeground(new java.awt.Color(0, 255, 102));

        infoLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infoLbl.setText("Deleting: ");

        percentageLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(percentageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePrb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(infoLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(infoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(percentageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePrb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JProgressBar deletePrb;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel percentageLbl;
    // End of variables declaration//GEN-END:variables
}
