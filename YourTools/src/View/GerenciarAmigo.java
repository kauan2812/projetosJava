package View;

import Model.Amigos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarAmigo extends javax.swing.JFrame {

    private Amigos objAmigo;
   
    public GerenciarAmigo() {
        initComponents();
        this.objAmigo = new Amigos();
        carregaTabelaAmigos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_amigos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_telefone = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        table_amigos.setBackground(new java.awt.Color(204, 204, 204));
        table_amigos.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        table_amigos.setForeground(new java.awt.Color(255, 255, 255));
        table_amigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_amigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_amigos);
        if (table_amigos.getColumnModel().getColumnCount() > 0) {
            table_amigos.getColumnModel().getColumn(0).setResizable(false);
            table_amigos.getColumnModel().getColumn(0).setPreferredWidth(50);
            table_amigos.getColumnModel().getColumn(1).setResizable(false);
            table_amigos.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 125, 195));
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Futura Std Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 125, 195));
        jLabel2.setText("Telefone");

        c_nome.setBackground(new java.awt.Color(204, 204, 204));
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_telefone.setBackground(new java.awt.Color(204, 204, 204));
        c_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_telefoneActionPerformed(evt);
            }
        });

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
                        .addGap(79, 79, 79)
                        .addComponent(btn_cancelar)
                        .addGap(73, 73, 73)
                        .addComponent(btn_alterar)
                        .addGap(59, 59, 59)
                        .addComponent(btn_apagar)
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_apagar))
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void c_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_telefoneActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        try {
            // recebendo e validando dados da interface gr�fica.
            int id = 0;
            String nome = "";
            int telefone = 0;

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_telefone.getText().length() < 7) {
                throw new Mensagens("Idade deve ser n�mero e maior que zero.");
            } else {
                telefone = Integer.parseInt(this.c_telefone.getText());
            }

            if (this.table_amigos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para Alterar");
            } else {
                id = Integer.parseInt(this.table_amigos.getValueAt(this.table_amigos.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objAmigo.UpdateAmigosBD(id, nome, telefone)) {

                // limpa os campos
                this.c_nome.setText("");
                this.c_telefone.setText("");
                JOptionPane.showMessageDialog(rootPane, "Amigo Alterado com Sucesso!");

            }
            System.out.println(this.objAmigo.getMinhaListaAmigos().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } finally {
            carregaTabelaAmigos(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.table_amigos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para APAGAR");
            } else {
                id = Integer.parseInt(this.table_amigos.getValueAt(this.table_amigos.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Amigo ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objAmigo.DeleteAmigosBD(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                    this.c_telefone.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo Apagado com Sucesso!");

                }

            }

            System.out.println(this.objAmigo.getMinhaListaAmigos().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabelaAmigos();
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void table_amigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_amigosMouseClicked
        if (this.table_amigos.getSelectedRow() != -1) {

            String nome = this.table_amigos.getValueAt(this.table_amigos.getSelectedRow(), 1).toString();
            String telefone = this.table_amigos.getValueAt(this.table_amigos.getSelectedRow(), 2).toString();

            this.c_nome.setText(nome);
            this.c_telefone.setText(telefone);

        }
    }//GEN-LAST:event_table_amigosMouseClicked
     
    @SuppressWarnings("unchecked")
    public void carregaTabelaAmigos() {

        DefaultTableModel modelo = (DefaultTableModel) this.table_amigos.getModel();
        modelo.setNumRows(0);

        ArrayList<Amigos> minhalista = new ArrayList<>();
        minhalista = objAmigo.getMinhaListaAmigos();

        for (Amigos a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone()
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
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_amigos;
    // End of variables declaration//GEN-END:variables
}
