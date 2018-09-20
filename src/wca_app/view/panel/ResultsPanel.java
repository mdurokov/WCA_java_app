/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.panel;

import java.util.List;
import javax.swing.JOptionPane;
import wca_app.controller.ResultsController;
import wca_app.model.Competitor;
import wca_app.model.Operator;
import wca_app.model.Result;
import wca_app.tablemodel.CompetitorTableModel;
import wca_app.tablemodel.ResultTableModel;

/**
 *
 * @author Mata
 */
public class ResultsPanel extends javax.swing.JPanel {

    private ResultsController resultController;
    
    private Operator operator;
    /**
     * Creates new form CompetitionsPanel
     */
    public ResultsPanel(Operator operator) {
        initComponents();
        setName("Results");
        this.operator = operator;
        try {
            resultController = new ResultsController();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        refreshResultsView();
        
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
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        openBtn = new javax.swing.JButton();

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

        searchBtn.setText("Search");

        addBtn.setText("Add New");

        updateBtn.setText("Update");

        deleteBtn.setText("Delete");

        jLabel1.setText("Results");

        openBtn.setText("Open");

        javax.swing.GroupLayout controlButtonPnl1Layout = new javax.swing.GroupLayout(controlButtonPnl1);
        controlButtonPnl1.setLayout(controlButtonPnl1Layout);
        controlButtonPnl1Layout.setHorizontalGroup(
            controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlButtonPnl1Layout.createSequentialGroup()
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(18, 18, 18)
                .addComponent(openBtn)
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn))
        );
        controlButtonPnl1Layout.setVerticalGroup(
            controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButtonPnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlButtonPnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(addBtn)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(openBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrlPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
            .addComponent(controlButtonPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(controlButtonPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrlPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel controlButtonPnl1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrlPnl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void refreshResultsView() {
        try {
            List<Result> results = resultController.getEntities();
            ResultTableModel model = new ResultTableModel(results);
            table.setModel(model);
            if(model.getRowCount()>0){
                table.setRowSelectionInterval(0, 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
