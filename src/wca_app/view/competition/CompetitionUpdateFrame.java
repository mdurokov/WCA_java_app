/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.competition;

import java.math.BigInteger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import wca_app.controller.CompetitionController;
import wca_app.controller.CountryController;
import wca_app.model.Competition;
import wca_app.model.Country;
import wca_app.tablemodel.CompetitionTableModel;

/**
 *
 * @author Mata
 */
public class CompetitionUpdateFrame extends javax.swing.JFrame {

    private Competition entity;
    private CompetitionController controller;
    private CompetitionsPanel panel;

    public CompetitionUpdateFrame(CompetitionsPanel panel, Competition entity) {
        initComponents();
        getRootPane().setDefaultButton(saveBtn);
        controller = new CompetitionController();
        this.entity = entity;
        this.panel = panel;
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
        nameLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        countryLbl = new javax.swing.JLabel();
        countryCmb = new javax.swing.JComboBox<>();
        startDateLbl = new javax.swing.JLabel();
        endDateLbl = new javax.swing.JLabel();
        startDateDtp = new org.jdesktop.swingx.JXDatePicker();
        endDateDtp = new org.jdesktop.swingx.JXDatePicker();
        cellNameLbl = new javax.swing.JLabel();
        cellNameField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        latitudeLbl = new javax.swing.JLabel();
        latitudeField = new javax.swing.JTextField();
        longitudeLbl = new javax.swing.JLabel();
        longitudeField = new javax.swing.JTextField();
        organiserLbl = new javax.swing.JLabel();
        organiserField = new javax.swing.JTextField();
        venueLbl = new javax.swing.JLabel();
        venueField = new javax.swing.JTextField();
        venueDetailsLbl = new javax.swing.JLabel();
        venueDetailsField = new javax.swing.JTextField();
        venueAddressLbl = new javax.swing.JLabel();
        venueAddressField = new javax.swing.JTextField();
        wcaDelegateLbl = new javax.swing.JLabel();
        wcaDelegateField = new javax.swing.JTextField();
        informationLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationTxt = new javax.swing.JTextArea();
        specificationLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        specificationTxt = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fieldsPnl.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Competition"));

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

        nameLbl.setLabelFor(nameField);
        nameLbl.setText("Name: ");

        cityLbl.setLabelFor(cityField);
        cityLbl.setText("City: ");

        countryLbl.setLabelFor(countryCmb);
        countryLbl.setText("Country: ");

        startDateLbl.setLabelFor(startDateDtp);
        startDateLbl.setText("Start date: ");

        endDateLbl.setLabelFor(endDateDtp);
        endDateLbl.setText("End date:");

        cellNameLbl.setLabelFor(cellNameField);
        cellNameLbl.setText("Cell name:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Optional"));

        latitudeLbl.setLabelFor(latitudeField);
        latitudeLbl.setText("Latitude: ");

        longitudeLbl.setLabelFor(longitudeField);
        longitudeLbl.setText("Longitude: ");

        organiserLbl.setLabelFor(organiserField);
        organiserLbl.setText("Organiser: ");

        venueLbl.setLabelFor(venueField);
        venueLbl.setText("Venue: ");

        venueDetailsLbl.setLabelFor(venueDetailsField);
        venueDetailsLbl.setText("Venue details: ");

        venueAddressLbl.setLabelFor(venueAddressField);
        venueAddressLbl.setText("Venue address: ");

        wcaDelegateLbl.setLabelFor(wcaDelegateField);
        wcaDelegateLbl.setText("WCA delegate");

        informationLbl.setLabelFor(informationTxt);
        informationLbl.setText("Information: ");

        informationTxt.setColumns(20);
        informationTxt.setRows(5);
        jScrollPane1.setViewportView(informationTxt);

        specificationLbl.setLabelFor(specificationTxt);
        specificationLbl.setText("Competition spceifications: ");

        specificationTxt.setColumns(20);
        specificationTxt.setRows(5);
        jScrollPane2.setViewportView(specificationTxt);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(wcaDelegateLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(wcaDelegateField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(latitudeLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(latitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(venueLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(venueField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(longitudeLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(longitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(venueDetailsLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(venueDetailsField)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(organiserLbl)
                                    .addComponent(venueAddressLbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(organiserField)
                                    .addComponent(venueAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(informationLbl)
                                .addGap(329, 329, 329)
                                .addComponent(specificationLbl)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitudeLbl)
                    .addComponent(latitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longitudeLbl)
                    .addComponent(longitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organiserLbl)
                    .addComponent(organiserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venueLbl)
                    .addComponent(venueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venueDetailsLbl)
                    .addComponent(venueDetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venueAddressLbl)
                    .addComponent(venueAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wcaDelegateLbl)
                    .addComponent(wcaDelegateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informationLbl)
                    .addComponent(specificationLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        javax.swing.GroupLayout fieldsPnlLayout = new javax.swing.GroupLayout(fieldsPnl);
        fieldsPnl.setLayout(fieldsPnlLayout);
        fieldsPnlLayout.setHorizontalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fieldsPnlLayout.createSequentialGroup()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(cityLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(countryCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addComponent(cityField)
                            .addComponent(nameField))
                        .addGap(40, 40, 40)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(cellNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(fieldsPnlLayout.createSequentialGroup()
                                .addComponent(endDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGap(11, 11, 11)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateDtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDateDtp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cellNameField))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        fieldsPnlLayout.setVerticalGroup(
            fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateLbl)
                            .addComponent(nameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityLbl)
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateLbl)))
                    .addGroup(fieldsPnlLayout.createSequentialGroup()
                        .addComponent(startDateDtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateDtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLbl)
                    .addComponent(countryCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellNameLbl)
                    .addComponent(cellNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
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
            .addComponent(fieldsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Competition newCompetition = controller.update(entity);
            panel.refreshEntityView();
            for(int i = 0; i < panel.getTable().getModel().getRowCount();i++){
                if(panel.getTable().getValueAt(i, CompetitionTableModel.ID_COL)
                        == newCompetition.getId()){
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
    private javax.swing.JTextField cellNameField;
    private javax.swing.JLabel cellNameLbl;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JComboBox<Country> countryCmb;
    private javax.swing.JLabel countryLbl;
    private org.jdesktop.swingx.JXDatePicker endDateDtp;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JPanel fieldsPnl;
    private javax.swing.JLabel informationLbl;
    private javax.swing.JTextArea informationTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField latitudeField;
    private javax.swing.JLabel latitudeLbl;
    private javax.swing.JTextField longitudeField;
    private javax.swing.JLabel longitudeLbl;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField organiserField;
    private javax.swing.JLabel organiserLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel specificationLbl;
    private javax.swing.JTextArea specificationTxt;
    private org.jdesktop.swingx.JXDatePicker startDateDtp;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JTextField venueAddressField;
    private javax.swing.JLabel venueAddressLbl;
    private javax.swing.JTextField venueDetailsField;
    private javax.swing.JLabel venueDetailsLbl;
    private javax.swing.JTextField venueField;
    private javax.swing.JLabel venueLbl;
    private javax.swing.JTextField wcaDelegateField;
    private javax.swing.JLabel wcaDelegateLbl;
    // End of variables declaration//GEN-END:variables

    private void loadCountries() {
        CountryController countryController = new CountryController();
        DefaultComboBoxModel<Country> model = new DefaultComboBoxModel<>();
        countryController.getEntities().forEach((s) -> {
            model.addElement(s);
        });
        countryCmb.setModel(model);
    }

    private void loadEntityProperties(Competition competition) {
        nameField.setText(competition.getName());
        cityField.setText(competition.getCity());
        startDateDtp.setDate(competition.getStartDate());
        endDateDtp.setDate(competition.getEndDate());
        cellNameField.setText(competition.getCellName());
        countryCmb.setSelectedItem(competition.getCountry_id());
        if (!("null".equals(String.valueOf(competition.getLatitude())))) {
            latitudeField.setText(String.valueOf(competition.getLatitude()));
        } else {
            latitudeField.setText("");
        }
        if (!("null".equals(String.valueOf(competition.getLongitude())))) {
            longitudeField.setText(String.valueOf(competition.getLongitude()));
        } else {
            latitudeField.setText("");
        }
        organiserField.setText(competition.getOrganiser());
        venueField.setText(competition.getVenue());
        venueDetailsField.setText(competition.getVenueDetails());
        venueAddressField.setText(competition.getVenueAddress());
        wcaDelegateField.setText(competition.getWcaDelegate());
        informationTxt.setText(competition.getInformation());
        specificationTxt.setText(competition.getSpecification());
    }

    private boolean fillEntityProperties() {
        entity.setName(nameField.getText());
        entity.setCity(cityField.getText());
        entity.setStartDate(startDateDtp.getDate());
        entity.setEndDate(endDateDtp.getDate());
        entity.setCountry_id(countryCmb.getItemAt(countryCmb.getSelectedIndex()));
        entity.setCellName(cellNameField.getText());

        if (!(latitudeField.getText().trim().isEmpty() || latitudeField.getText() == null)) {
            entity.setLatitude(new BigInteger(latitudeField.getText()));
        }
        if (!(longitudeField.getText().trim().isEmpty() || longitudeField.getText() == null)) {
            entity.setLongitude(new BigInteger(longitudeField.getText()));
        }
        if (!(organiserField.getText().trim().isEmpty() || organiserField.getText() == null)) {
            entity.setOrganiser(organiserField.getText());
        }
        if (!(venueField.getText().trim().isEmpty() || venueField.getText() == null)) {
            entity.setVenue(venueField.getText());
        }
        if (!(venueDetailsField.getText().trim().isEmpty() || venueDetailsField.getText() == null)) {
            entity.setVenueDetails(venueDetailsField.getText());
        }
        if (!(venueAddressField.getText().trim().isEmpty() || venueAddressField.getText() == null)) {
            entity.setVenueAddress(venueAddressField.getText());
        }
        if (!(wcaDelegateField.getText().trim().isEmpty() || wcaDelegateField.getText() == null)) {
            entity.setWcaDelegate(wcaDelegateField.getText());
        }
        if (!(informationTxt.getText().trim().isEmpty() || informationTxt.getText() == null)) {
            entity.setInformation(informationTxt.getText());
        }
        if (!(specificationTxt.getText().trim().isEmpty() || specificationTxt.getText() == null)) {
            entity.setSpecification(specificationTxt.getText());
        }
        return true;
    }

}
