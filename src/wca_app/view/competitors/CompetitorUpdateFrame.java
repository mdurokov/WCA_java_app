/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.competitors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import wca_app.controller.CompetitionController;
import wca_app.controller.CompetitorController;
import wca_app.controller.CountryController;
import wca_app.model.Competitor;
import wca_app.model.Country;

/**
 *
 * @author Mata
 */
public class CompetitorUpdateFrame extends javax.swing.JFrame {

    private Competitor entity;
    private CompetitorController controller;
    private CompetitorsPanel panel;

    public CompetitorUpdateFrame(CompetitorsPanel panel, Competitor competitor) {
        initComponents();
        getRootPane().setDefaultButton(saveBtn);
        controller = new CompetitorController();
        this.panel = panel;
        entity = competitor;
        loadCountries();
        loadEntityProperties(entity);

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
        firstNameLbl = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        countryLbl = new javax.swing.JLabel();
        countryCmb = new javax.swing.JComboBox<>();
        tagLbl = new javax.swing.JLabel();
        tagField = new javax.swing.JTextField();
        genderCmb = new javax.swing.JComboBox<>();
        genderLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fieldsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Competitor"));

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

        firstNameLbl.setText("First name:");

        lastNameLbl.setText("Last name:");

        countryLbl.setText("Country: ");

        tagLbl.setText("Tag:");

        genderCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        genderLbl.setText("Gender:");

        javax.swing.GroupLayout fieldsPnlLayout = new javax.swing.GroupLayout(fieldsPnl);
        fieldsPnl.setLayout(fieldsPnlLayout);
        fieldsPnlLayout.setHorizontalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(firstNameField)))
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(countryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(genderLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(countryCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderCmb, 0, 197, Short.MAX_VALUE)))
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addComponent(tagLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(87, 87, 87)
                        .addComponent(tagField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fieldsPnlLayout.setVerticalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLbl)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLbl)
                    .addComponent(countryCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagLbl)
                    .addComponent(tagField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn))
                .addContainerGap())
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Changes not saved! Do you want to proceed?", "Exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        if (JOptionPane.showConfirmDialog(getRootPane(),
                "Changes not saved! Do you want to proceed?", "Exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        if (!fillEntityProperties()) {
            return;
        }
        try {
            controller.update(entity);
            panel.refreshEntityView();
            dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private boolean fillEntityProperties() {
        entity.setFirstName(firstNameField.getText());
        entity.setLastName(lastNameField.getText());
        entity.setTag(tagField.getText());
        entity.setCountry_id(countryCmb.getItemAt(countryCmb.getSelectedIndex()));
        if (genderCmb.getSelectedIndex() == 0) {
            entity.setGender('M');
        } else {
            entity.setGender('F');
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<Country> countryCmb;
    private javax.swing.JLabel countryLbl;
    private javax.swing.JPanel fieldsPnl;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JComboBox<String> genderCmb;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tagField;
    private javax.swing.JLabel tagLbl;
    // End of variables declaration//GEN-END:variables

    private void loadCountries() {
        CountryController countryController = new CountryController();
        DefaultComboBoxModel<Country> model = new DefaultComboBoxModel<>();
        countryController.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        countryCmb.setModel(model);
    }

    private void loadEntityProperties(Competitor competitor) {
        firstNameField.setText(competitor.getFirstName());
        lastNameField.setText(competitor.getLastName());
        countryCmb.setSelectedItem(competitor.getCountry_id());
        if (competitor.getGender() == 'M') {
            genderCmb.setSelectedIndex(0);
        } else {
            genderCmb.setSelectedIndex(1);
        }
        tagField.setText(competitor.getTag());

    }

}