package programming.beroepsproduct1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;

public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        populateList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTransactie = new javax.swing.JButton();
        boxYear = new javax.swing.JComboBox();
        boxMonth = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new programming.beroepsproduct1.CurrencyLabel();
        monthTotal = new programming.beroepsproduct1.CurrencyLabel();
        previousTotal = new programming.beroepsproduct1.CurrencyLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTransactie.setText("Nieuwe Transactie");
        btnTransactie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactieActionPerformed(evt);
            }
        });

        boxYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        boxYear.setSelectedIndex(5);
        boxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxYearActionPerformed(evt);
            }
        });

        boxMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December" }));
        boxMonth.setSelectedIndex(Calendar.getInstance().get(Calendar.MONTH));
        boxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMonthActionPerformed(evt);
            }
        });

        jLabel1.setText("Nieuw Saldo:");

        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setCellRenderer(new Transactionrender());
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listMousePressed(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jLabel2.setText("Deze maand:");

        jLabel3.setText("Vorige Saldo:");

        total.setText("currencyLabel1");

        monthTotal.setText("currencyLabel2");

        previousTotal.setText("currencyLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btnTransactie))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(monthTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(previousTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransactie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(monthTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getboxYear() {
        return Integer.parseInt((String) boxYear.getSelectedItem());
    }

    public int getboxMonth() {
        return boxMonth.getSelectedIndex();
    }

    public void populateList() {
        AbstractListModel listModel = new AbstractListModel<Transactie>() {
            private final ArrayList<Transactie> list = Database.select(getboxYear(), getboxMonth());

            @Override
            public int getSize() {
                return list.size();
            }

            @Override
            public Transactie getElementAt(int i) {
                return list.get(i);
            }
        };

        list.setModel(listModel);
        updateTotal();
    }

    public void updateTotal() {
        double total = Database.totalBedrag(getboxYear(), getboxMonth());
        int year = getboxYear();
        int month = getboxMonth() - 1;

        if (month < 0) {
            month = 11;
            year--;
        }
        double total2 = Database.totalBedrag(year, month);
        this.previousTotal.setAmount(total2);
        this.monthTotal.setAmount(total - total2);
        this.total.setAmount(total);
    }

    private void btnTransactieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactieActionPerformed
        TransactionDialog f = new TransactionDialog(this, true, getboxYear(), getboxMonth());
        f.setVisible(true);
        populateList();
    }//GEN-LAST:event_btnTransactieActionPerformed

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged

    }//GEN-LAST:event_listValueChanged

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
//        String selected = jList1.getSelectedValue().toString();
//        txt_titel.setText(selected);
    }//GEN-LAST:event_listMouseClicked

    private void boxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxYearActionPerformed
        populateList();
    }//GEN-LAST:event_boxYearActionPerformed

    private void boxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMonthActionPerformed
        populateList();
    }//GEN-LAST:event_boxMonthActionPerformed

    private void listMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMousePressed
        if (evt.isPopupTrigger()) {
            list.setSelectedIndex(list.locationToIndex(evt.getPoint()));

            JMenuItem edit = new JMenuItem(new AbstractAction("Bewerken") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Show the dialog and update the list afterwards.
                    Transactie transactie = (Transactie) list.getSelectedValue();
                    TransactionDialog dialog = new TransactionDialog(MainFrame.this, true, transactie);
                    dialog.setVisible(true);
                    populateList();
                }
            });

            JMenuItem delete = new JMenuItem(new AbstractAction("Verwijderen") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int res = JOptionPane.showConfirmDialog(list, "Weet je zeker dat je deze transactie wilt verwijderen?", null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                    if (res == JOptionPane.YES_OPTION) {
                        // Remove transaction from the database and update the list.
                        Transactie transactie = (Transactie) list.getSelectedValue();
                        Database.remove(transactie.getId());
                        populateList();
                    }
                }
            });

            // Create context menu and show at the clicked location.
            JPopupMenu menu = new JPopupMenu();
            menu.add(edit);
            menu.add(delete);
            menu.show(list, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listMousePressed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxMonth;
    private javax.swing.JComboBox boxYear;
    private javax.swing.JButton btnTransactie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private programming.beroepsproduct1.CurrencyLabel monthTotal;
    private programming.beroepsproduct1.CurrencyLabel previousTotal;
    private programming.beroepsproduct1.CurrencyLabel total;
    // End of variables declaration//GEN-END:variables
}
