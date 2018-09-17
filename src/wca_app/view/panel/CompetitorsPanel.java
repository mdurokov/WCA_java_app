/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.panel;

import java.util.List;
import javax.swing.JOptionPane;
import wca_app.controller.CompetitorController;
import wca_app.model.Competitor;
import wca_app.tablemodel.CompetitionTableModel;
import wca_app.tablemodel.CompetitorTableModel;

/**
 *
 * @author Mata
 */
public class CompetitorsPanel extends javax.swing.JPanel {

    private CompetitorController competitorController;
    /**
     * Creates new form CompetitionsPanel
     */
    public CompetitorsPanel() {
        initComponents();
        setName("Competitors");
        try {
            competitorController = new CompetitorController();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        refreshCompetitionsView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrlPnl = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        controlButtonPnl1 = new javax.swing.JPanel();
        searchField1 = new javax.swing.JTextField();
        searchBtn1 = new javax.swing.JButton();
        addBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(825, 0));

        tableScrlPnl.setPreferredSize(new java.awt.Dimension(100, 402));
        tableScrlPnl.setWheelScrollingEnabled(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableScrlPnl.setViewportView(table);

        searchBtn1.setText("Search");

        addBtn1.setText("Add New");

        updateBtn1.setText("Update");

        deleteBtn1.setText("Delete");

        jLabel1.setText("Competitors");

        javax.swing.GroupLayout controlButtonPnl1Layout = new javax.swing.GroupLayout(controlButtonPnl1);
        controlButtonPnl1.setLayout(controlButtonPnl1Layout);
        controlButtonPnl1Layout.setHorizontalGroup(
            controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlButtonPnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBtn1)
                .addGap(18, 18, 18)
                .addComponent(updateBtn1)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn1)
                .addContainerGap())
        );
        controlButtonPnl1Layout.setVerticalGroup(
            controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtonPnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn1)
                    .addGroup(controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlButtonPnl1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn1)
                            .addComponent(updateBtn1)
                            .addComponent(deleteBtn1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlButtonPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tableScrlPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(controlButtonPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrlPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn1;
    private javax.swing.JPanel controlButtonPnl1;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JTextField searchField1;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrlPnl;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables

    private void refreshCompetitionsView() {
        try {
            List<Competitor> competitors = competitorController.getEntities();
            CompetitorTableModel model = new CompetitorTableModel(competitors);
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
