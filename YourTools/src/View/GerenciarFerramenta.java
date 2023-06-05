package View;

import Model.Ferramentas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthu
 */
public class GerenciarFerramenta extends javax.swing.JFrame {

    private Ferramentas objFerramenta;
    
    public GerenciarFerramenta() {
        initComponents();
        this.objFerramenta = new Ferramentas();
        carregaTabelaFerramentas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ferramentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_marca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c_cAquisicao = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        table_ferramentas.setBackground(new java.awt.Color(204, 204, 204));
        table_ferramentas.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        table_ferramentas.setForeground(new java.awt.Color(255, 255, 255));
        table_ferramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ferramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ferramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_ferramentas);
        if (table_ferramentas.getColumnModel().getColumnCount() > 0) {
            table_ferramentas.getColumnModel().getColumn(0).setResizable(false);
            table_ferramentas.getColumnModel().getColumn(0).setPreferredWidth(43);
            table_ferramentas.getColumnModel().getColumn(1).setResizable(false);
            table_ferramentas.getColumnModel().getColumn(1).setPreferredWidth(160);
            table_ferramentas.getColumnModel().getColumn(2).setResizable(false);
            table_ferramentas.getColumnModel().getColumn(2).setPreferredWidth(160);
            table_ferramentas.getColumnModel().getColumn(3).setResizable(false);
            table_ferramentas.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 125, 195));
        jLabel1.setText("Custo");

        jLabel2.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 125, 195));
        jLabel2.setText("Marca");

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_marca.setBackground(new java.awt.Color(204, 204, 204));
        c_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_marcaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_cancelar.setBackground(new java.awt.Color(1, 125, 195));
        btn_cancelar.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(1, 125, 195));
        btn_alterar.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_apagar.setBackground(new java.awt.Color(1, 125, 195));
        btn_apagar.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        btn_apagar.setForeground(new java.awt.Color(255, 255, 255));
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 125, 195));
        jLabel5.setText("Nome");

        c_cAquisicao.setBackground(new java.awt.Color(204, 204, 204));
        c_cAquisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cAquisicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_cAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_apagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_alterar)
                        .addGap(30, 30, 30)
                        .addComponent(btn_apagar)
                        .addGap(28, 28, 28)
                        .addComponent(btn_cancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informações");
        jMenu2.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_marcaActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void c_cAquisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cAquisicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cAquisicaoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        try {
            // recebendo e validando dados da interface gr�fica.
            int id = 0;
            String nome = "";
            String marca = "";
            double custoAquisicao = 0.0;

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_marca.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                marca = this.c_marca.getText();
            }

            if (this.c_cAquisicao.getText().length() < 0) {
                throw new Mensagens("Idade deve ser n�mero e maior que zero.");
            } else {
                custoAquisicao = Double.parseDouble(this.c_cAquisicao.getText());
            }

            if (this.table_ferramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.table_ferramentas.getValueAt(this.table_ferramentas.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objFerramenta.UpdateFerramentasBD(id, nome, marca, custoAquisicao)) {

                // limpa os campos
                this.c_nome.setText("");
                this.c_marca.setText("");
                this.c_cAquisicao.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterada com Sucesso!");

            }
            System.out.println(this.objFerramenta.getMinhaListaFerramentas().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } finally {
            carregaTabelaFerramentas(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.table_ferramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.table_ferramentas.getValueAt(this.table_ferramentas.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta Ferramenta ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objFerramenta.DeleteFerramentasBD(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                    this.c_marca.setText("");
                    this.c_cAquisicao.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");

                }

            }

            System.out.println(this.objFerramenta.getMinhaListaFerramentas().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabelaFerramentas();
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void table_ferramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ferramentasMouseClicked
        if (this.table_ferramentas.getSelectedRow() != -1) {

            String nome = this.table_ferramentas.getValueAt(this.table_ferramentas.getSelectedRow(), 1).toString();
            String marca = this.table_ferramentas.getValueAt(this.table_ferramentas.getSelectedRow(), 2).toString();
            String custoAquisicao = this.table_ferramentas.getValueAt(this.table_ferramentas.getSelectedRow(), 3).toString();

            this.c_nome.setText(nome);
            this.c_marca.setText(marca);
            this.c_cAquisicao.setText(custoAquisicao);

        }
    }//GEN-LAST:event_table_ferramentasMouseClicked

    @SuppressWarnings("unchecked")
    public void carregaTabelaFerramentas() {

        DefaultTableModel modelo = (DefaultTableModel) this.table_ferramentas.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramentas> minhalista = new ArrayList<>();
        minhalista = objFerramenta.getMinhaListaFerramentas();

        for (Ferramentas a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getCustoAquisicao()
            });
        }

        System.out.println("atualizado");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JTextField c_cAquisicao;
    private javax.swing.JTextField c_marca;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table_ferramentas;
    // End of variables declaration//GEN-END:variables
}
