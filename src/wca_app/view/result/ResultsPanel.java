/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app.view.result;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import wca_app.controller.ResultController;
import wca_app.model.Operator;
import wca_app.model.Result;
import wca_app.tablemodel.ResultTableModel;
import wca_app.util.HibernateUtil;
import wca_app.view.DeleteProgresForm;
import wca_app.view.competition.CompetitionUpdateFrame;

/**
 *
 * @author Mata
 */
public class ResultsPanel extends javax.swing.JPanel {

    private ResultController controller;
    private ResultAddFrame addFrame;
    private ResultUpdateFrame updateFrame;
    private Operator operator;

    /**
     * Creates new form CompetitionsPanel
     */
    public ResultsPanel(Operator operator) {
        initComponents();
        setName("Results");
        this.operator = operator;
        try {
            controller = new ResultController();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error creating results "
                    + "controller: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        refreshEntityView();

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

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add New");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        addFrame = new ResultAddFrame(this);
        addFrame.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int row = table.getSelectedRow();
        Result entity = (Result) table.getValueAt(row,
                ResultTableModel.OBJECT_COL);
        updateFrame = new ResultUpdateFrame(this, entity);
        updateFrame.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (table.getSelectedRows().length == 1) {
            if (JOptionPane.showConfirmDialog(getRootPane(), "Are you sure you"
                    + " want to delete selected item?",
                    "Confirm", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                try {
                    Result entity = (Result) table
                            .getValueAt(table.getSelectedRow(),
                                    ResultTableModel.OBJECT_COL);
                    controller.deleteEntity(entity);
                } catch (Exception ex) {
                    HibernateUtil.getSession().clear();
                    JOptionPane.showMessageDialog(getRootPane(), "Competition "
                            + table.getSelectedRow()
                            + " can't be deleted");
                }
                refreshEntityView();
            }
        } else {
            if (JOptionPane.showConfirmDialog(getRootPane(), "Are you sure you"
                    + " want to delete selected items?", 
                    "Confirm", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                new MultiDelete().start();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        refreshEntityView();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        if (evt.getKeyCode() == 10) {
            refreshEntityView();
        }
    }//GEN-LAST:event_searchFieldKeyReleased


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

    public class MultiDelete extends Thread {

        public void run() {
            int max = table.getSelectedRowCount();
            int j = 0;
            DeleteProgresForm deleteForm = new DeleteProgresForm(max);
            deleteForm.setVisible(true);
            for (int i : table.getSelectedRows()) {
                Result entity = (Result) table.getValueAt(i,
                        ResultTableModel.OBJECT_COL);
                j++;
                deleteForm.changeAppearance(j, max, entity);
                try {
                    controller.deleteEntity(entity);
                } catch (Exception e) {
                    HibernateUtil.getSession().clear();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            deleteForm.dispose();
            refreshEntityView();
        }
    }

    protected void refreshEntityView() {
        try {
            List<Result> results
                    = controller.getEntities(searchField.getText());
            ResultTableModel model
                    = new ResultTableModel(results);
            table.setModel(model);
            if(model.getRowCount() > 0){
                updateBtn.setEnabled(true);
                deleteBtn.setEnabled(true);
            }else{
                updateBtn.setEnabled(false);
                deleteBtn.setEnabled(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error while refreshing "
                    + "result view: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JTable getTable() {
        return table;
    }

}
