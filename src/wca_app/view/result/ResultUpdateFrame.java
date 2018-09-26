/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.result;

import wca_app.view.competition.*;
import java.math.BigInteger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import wca_app.controller.CompetitionController;
import wca_app.controller.CompetitorController;
import wca_app.controller.CountryController;
import wca_app.controller.EventContorller;
import wca_app.controller.FormatController;
import wca_app.controller.ResultController;
import wca_app.controller.RoundTypeController;
import wca_app.model.Competition;
import wca_app.model.Competitor;
import wca_app.model.Country;
import wca_app.model.Event;
import wca_app.model.Format;
import wca_app.model.Result;
import wca_app.model.RoundType;
import wca_app.tablemodel.CompetitionTableModel;

/**
 *
 * @author Mata
 */
public class ResultUpdateFrame extends javax.swing.JFrame {

    private Result entity;
    private ResultController controller;
    private ResultsPanel panel;

    public ResultUpdateFrame(ResultsPanel panel, Result entity) {
        initComponents();
        getRootPane().setDefaultButton(saveBtn);
        this.panel = panel;
        this.entity = entity;
        controller = new ResultController();
        loadCompetitions();
        loadCompetitiors();
        loadEvent();
        loadFormats();
        loadRoundTypes();
        loadEntityProperties();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsPnl = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        competitionCmb = new javax.swing.JComboBox<>();
        competitorCmb = new javax.swing.JComboBox<>();
        roundTypeCmb = new javax.swing.JComboBox<>();
        eventCmb = new javax.swing.JComboBox<>();
        formatCmb = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        value1Field = new javax.swing.JTextField();
        value2Field = new javax.swing.JTextField();
        value3Field = new javax.swing.JTextField();
        value4Field = new javax.swing.JTextField();
        value5Field = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        positionField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fieldsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Result"));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Competition: ");

        jLabel2.setText("Competitor: ");

        jLabel3.setText("Event:");

        jLabel4.setText("Format: ");

        jLabel5.setText("Round type: ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Value 1: ");

        jLabel7.setText("Value 2: ");

        jLabel8.setText("Value 3: ");

        jLabel9.setText("Value 4: ");

        jLabel10.setText("Value 5: ");

        jLabel11.setText("Position: ");

        javax.swing.GroupLayout fieldsPnlLayout = new javax.swing.GroupLayout(fieldsPnl);
        fieldsPnl.setLayout(fieldsPnlLayout);
        fieldsPnlLayout.setHorizontalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPnlLayout.createSequentialGroup()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn))
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(competitionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(competitorCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eventCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roundTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(value1Field))
                                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(value2Field))
                                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(value3Field))
                                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(value4Field))
                                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(value5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(positionField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fieldsPnlLayout.setVerticalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(fieldsPnlLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(competitionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(competitorCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(eventCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(formatCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(roundTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1))
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(value1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(value2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(value3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(value4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(value5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(positionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fieldsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Changes not saved! Do you want to proceed?", "Exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Changes not saved! Do you want to proceed?", "Exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (!fillEntityProperties()) {
            return;
        }
        try {
            Result newResult = controller.add(entity);
            panel.refreshEntityView();
            for(int i = 0; i < panel.getTable().getModel().getRowCount();i++){
                if(panel.getTable().getValueAt(i, CompetitionTableModel.ID_COL)
                        == newResult.getId()){
                    panel.getTable().setRowSelectionInterval(i, i);
                    break;
                }
            }
            dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<Competition> competitionCmb;
    private javax.swing.JComboBox<Competitor> competitorCmb;
    private javax.swing.JComboBox<Event> eventCmb;
    private javax.swing.JPanel fieldsPnl;
    private javax.swing.JComboBox<Format> formatCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField positionField;
    private javax.swing.JComboBox<RoundType> roundTypeCmb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField value1Field;
    private javax.swing.JTextField value2Field;
    private javax.swing.JTextField value3Field;
    private javax.swing.JTextField value4Field;
    private javax.swing.JTextField value5Field;
    // End of variables declaration//GEN-END:variables

    private void loadCompetitions() {
        CompetitionController controller = new CompetitionController();
        DefaultComboBoxModel<Competition> model = new DefaultComboBoxModel<>();
        controller.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        competitionCmb.setModel(model);
    }
    
    private void loadEvent(){
        EventContorller controller = new EventContorller();
        DefaultComboBoxModel<Event> model = new DefaultComboBoxModel<>();
        controller.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        eventCmb.setModel(model);
    }
    
    private void loadFormats(){
        FormatController controller = new FormatController();
        DefaultComboBoxModel<Format> model = new DefaultComboBoxModel<>();
        controller.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        formatCmb.setModel(model);
    }
    
    private void loadRoundTypes(){
        CompetitorController controller = new CompetitorController();
        DefaultComboBoxModel<Competitor> model = new DefaultComboBoxModel<>();
        controller.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        competitorCmb.setModel(model);
    }
    
    private void loadCompetitiors(){
        RoundTypeController controller = new RoundTypeController();
        DefaultComboBoxModel<RoundType> model = new DefaultComboBoxModel<>();
        controller.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        roundTypeCmb.setModel(model);
    }
    
    private void loadEntityProperties(){
        competitionCmb.setSelectedItem(entity.getCompetition_id());
        competitorCmb.setSelectedItem(entity.getCompetitor_id());
        eventCmb.setSelectedItem(entity.getEvent_id());
        formatCmb.setSelectedItem(entity.getFormat_id());
        value1Field.setText(String.valueOf(entity.getValue1()));
        value2Field.setText(String.valueOf(entity.getValue2()));
        value3Field.setText(String.valueOf(entity.getValue3()));
        value4Field.setText(String.valueOf(entity.getValue4()));
        value5Field.setText(String.valueOf(entity.getValue5()));
        positionField.setText(String.valueOf(entity.getPosition()));   
    }

    private boolean fillEntityProperties() {
        entity.setCompetition_id(competitionCmb
                .getItemAt(competitionCmb.getSelectedIndex()));
        entity.setCompetitor_id(competitorCmb
                .getItemAt(competitorCmb.getSelectedIndex()));
        entity.setEvent_id(eventCmb.getItemAt(eventCmb.getSelectedIndex()));
        entity.setFormat_id(formatCmb.getItemAt(formatCmb.getSelectedIndex()));
        entity.setValue1(Integer.valueOf(value1Field.getText()));
        entity.setValue2(Integer.valueOf(value2Field.getText()));
        entity.setValue3(Integer.valueOf(value3Field.getText()));
        entity.setValue4(Integer.valueOf(value4Field.getText()));
        entity.setValue5(Integer.valueOf(value5Field.getText()));
        entity.setPosition(Integer.valueOf(positionField.getText()));
        return true;
    }

}
