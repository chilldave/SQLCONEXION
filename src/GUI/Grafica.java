/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.List;
import SQL.SelectData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import SQL.DeleteData;
import SQL.InsertData;
import SQL.UpdateData;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author CarlosUMG 
 */
public class Grafica extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */ 
    int nS = 0;

    public Grafica() {
        initComponents();
        hiddenLabelWarning();
        this.tfdID.setEditable(true);
        mostrarDatos();
        setLocationRelativeTo(null); // Centra el JFrame en la pantalla

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();
        BtnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdID = new javax.swing.JTextField();
        tfldName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tfldPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfldStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfldExpiration = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaBD.setBackground(new java.awt.Color(255, 255, 255));
        tablaBD.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tablaBD.setForeground(new java.awt.Color(0, 0, 0));
        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBD);

        BtnSave.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/save.png"))); // NOI18N
        BtnSave.setText("GUARDAR");
        BtnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BtnSaveFocusLost(evt);
            }
        });
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        BtnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BtnSaveKeyTyped(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/new.png"))); // NOI18N
        btnClear.setText("NUEVO");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/trash-can.png"))); // NOI18N
        btnDelete.setText("ELIMINAR");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        jLabel1.setText("LA CASITA FELIZ S.A.");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("DESCRIPCION");

        tfdID.setEditable(false);
        tfdID.setBackground(new java.awt.Color(255, 255, 255));
        tfdID.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfdID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIDActionPerformed(evt);
            }
        });
        tfdID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdIDKeyTyped(evt);
            }
        });

        tfldName.setBackground(new java.awt.Color(255, 255, 255));
        tfldName.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfldNameKeyTyped(evt);
            }
        });

        txtAreaDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaDescription.setColumns(20);
        txtAreaDescription.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtAreaDescription.setRows(5);
        txtAreaDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaDescriptionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaDescription);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("PRECIO");

        tfldPrice.setBackground(new java.awt.Color(255, 255, 255));
        tfldPrice.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfldPriceKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("CANTIDAD");

        tfldStock.setBackground(new java.awt.Color(255, 255, 255));
        tfldStock.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfldStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfldStockActionPerformed(evt);
            }
        });
        tfldStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfldStockKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("FECHA EXP.");

        tfldExpiration.setBackground(new java.awt.Color(255, 255, 255));
        tfldExpiration.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfldExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfldExpirationActionPerformed(evt);
            }
        });
        tfldExpiration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfldExpirationKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)
                                .addComponent(tfldExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(25, 25, 25)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfldExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
//        checkTxtField();
        try {
            int id = Integer.parseInt(this.tfdID.getText());
            String name = this.tfldName.getText();
            String description = this.txtAreaDescription.getText();
            float price = Float.parseFloat(this.tfldPrice.getText());
            int stock = Integer.parseInt(this.tfldStock.getText());
            String expiration = this.tfldExpiration.getText();

            // SI LA EJECUCION FUE EXITOSA NOS DEVOLVERA UN 1 Y MOSTRARA DATOS Y LIMPIARA LOS ESPACIOS 
            if (nS == 0) {
                InsertData insert1 = new InsertData();
                int result = insert1.insertData(id, name, description, price, stock, expiration);
                if (result > 0) {
                    mostrarDatos();
                    JOptionPane.showMessageDialog(null, "Registro agregado exitosamente...");

                    cleaUpTxtField();
                }
            } else {
              
                UpdateData update1 = new UpdateData();
                int result = update1.UpdateInformacion(id, name, description, price, stock, expiration);
                if (result > 0) {
                    mostrarDatos();
                    JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente...");

                    cleaUpTxtField();
                    nS = 0;
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("No information typed. " + e);
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
        }


    }//GEN-LAST:event_BtnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.tfdID.setEditable(true);
        cleaUpTxtField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        try {
            int filaSeleccionada = this.tablaBD.getSelectedRow();
            String valor = tablaBD.getValueAt(filaSeleccionada, 0).toString();
            DeleteData delete1 = new DeleteData();
            delete1.deleteRow(valor);
            mostrarDatos();
            cleaUpTxtField();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("This is an error : " + e);
            JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfdIDActionPerformed

    private void tfdIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdIDKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tfdIDKeyTyped

    private void tfldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfldNameKeyTyped
        // TODO add your handling code here:
        if (this.tfldName.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_tfldNameKeyTyped

    private void tfldExpirationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfldExpirationKeyTyped
        // TODO add your handling code here:
        if (this.tfldExpiration.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_tfldExpirationKeyTyped

    private void txtAreaDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescriptionKeyTyped
        // TODO add your handling code here:
        if (this.txtAreaDescription.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAreaDescriptionKeyTyped

    private void tfldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfldPriceKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        
        if((character<'0' || character >'9')&& (character != KeyEvent.VK_BACK_SPACE)&& (character!='.'|| this.tfldPrice.getText().contains("."))){
            evt.consume();
        }
        if (this.tfldPrice.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_tfldPriceKeyTyped

    private void BtnSaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSaveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveKeyTyped

    private void tfldExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfldExpirationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfldExpirationActionPerformed

    private void BtnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnSaveFocusLost
        // TODO add your handling code here:
//        checkTxtField();
    }//GEN-LAST:event_BtnSaveFocusLost

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseClicked

    private void tablaBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBDMouseClicked
        // TODO add your handling code here:
        //establecemos parametros a los TextField 
        
        int fila = this.tablaBD.getSelectedRow();
        
            this.tfdID.setEditable(false);
            this.tfdID.setText(this.tablaBD.getValueAt(fila, 0).toString());
        this.tfldName.setText(this.tablaBD.getValueAt(fila, 1).toString());
        this.txtAreaDescription.setText(this.tablaBD.getValueAt(fila, 2).toString());
        this.tfldPrice.setText(this.tablaBD.getValueAt(fila, 3).toString());
        this.tfldStock.setText(this.tablaBD.getValueAt(fila, 4).toString());
        this.tfldExpiration.setText(this.tablaBD.getValueAt(fila, 5).toString());
        this.nS = 1;
        
        

    }//GEN-LAST:event_tablaBDMouseClicked

    private void tfldStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfldStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfldStockActionPerformed

    private void tfldStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfldStockKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        
        if((character<'0' || character >'9')&& (character != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_tfldStockKeyTyped

    private void hiddenLabelWarning() {
/*
        this.JLWID.setVisible(false);
        this.JLWNAME.setVisible(false);
        this.JLWDES.setVisible(false);
        this.JLWPRICE.setVisible(false);
        this.JLWSTOCK.setVisible(false);
        this.JLWEXP.setVisible(false);
*/
    }

    public void mostrarDatos() {
        //Mostrar datos o listar 
        DefaultTableModel model = new DefaultTableModel();
        List<String[]> resultados = SelectData.obtenerunselect();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Stock");
        model.addColumn("Fecha Exp.");

        this.tablaBD.setModel(model);
        for (int i = 0; i < resultados.size(); i++) {
            
            String[] fila = resultados.get(i);
                        
//            
            
            
            System.out.println("Resolutado "+ resultados.size()+" --- "+fila[3]);
            model.addRow(fila);
        }
    }

    private void cleaUpTxtField() {
        this.tfdID.setText("");
        this.tfldName.setText("");
        this.txtAreaDescription.setText("");
        this.tfldPrice.setText("");
        this.tfldStock.setText("");
        this.tfldExpiration.setText("");
    }

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
                if ("DarkMetal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnSave;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaBD;
    public javax.swing.JTextField tfdID;
    public javax.swing.JTextField tfldExpiration;
    public javax.swing.JTextField tfldName;
    public javax.swing.JTextField tfldPrice;
    public javax.swing.JTextField tfldStock;
    public javax.swing.JTextArea txtAreaDescription;
    // End of variables declaration//GEN-END:variables
}
