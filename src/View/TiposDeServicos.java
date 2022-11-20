/*
   Essa view vai exibir as informações para o usuário informa os dados que vão se armazenado no banco de dados
 */
package View;

import Dao.ClienteDao;
import Dao.TiposDeServicosDao;
import Modelo.ClienteModel;
import Modelo.TiposDeServicosModel;
import java.awt.Event;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anderson
 */
public class TiposDeServicos extends javax.swing.JFrame {

    /**
     * Creates new form TiposDeServicos
     */
    public TiposDeServicos() {
        initComponents();
        
          //Abrir no centro da tela;
        setLocationRelativeTo(this);
        
        exibirJcamboxCliente();
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btDeleta = new javax.swing.JButton();
        btLista = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabTipoServicos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("         Tipos De Serviços");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informe os Dados:"));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        jLabel1.setText("Informe Nome:");

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
        });

        jLabel2.setText("Descrição:");

        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtdKeyReleased(evt);
            }
        });

        jLabel3.setText("Qtd:");

        txtUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnitKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnitKeyReleased(evt);
            }
        });

        jLabel4.setText("Valor Unitário");

        txtTotal.setEditable(false);
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });

        jLabel5.setText("Total:");

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o Cliente:" }));
        jComboBoxCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxClienteKeyReleased(evt);
            }
        });

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel7.setText("Data:");

        btAdd.setText("Adicionar");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDeleta.setText("Deletar");
        btDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletaActionPerformed(evt);
            }
        });

        btLista.setText("Lista");
        btLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btDeleta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabTipoServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodTipoSv", "CodCliente", "Descrição", "Quantidade", "ValorUnit", "ValorTotal", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabTipoServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTipoServicosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabTipoServicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    // Variavel para receber  o código do tipo de serviço
     String codigotiposervico="";
    
    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        
   
    }//GEN-LAST:event_txtTotalKeyReleased

    private void txtUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitKeyPressed
         
    }//GEN-LAST:event_txtUnitKeyPressed


    
    private void txtUnitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitKeyReleased
       
     
        
          // Ações para colocar o curso nos campos pelas setas
          
          // letra L para limpar o campo
           if(evt.getKeyCode()==evt.VK_L){
             txtUnit.setText("");
         }
           // seta esqueda para muda o curso para o campo do lado esquedor
           if(evt.getKeyCode()==evt.VK_LEFT){
             txtQtd.requestFocus();
         }
            if(txtQtd.getText().equals("")&&txtUnit.getText().equals("")){
                txtTotal.setText("");
            }
         
        // o try vai monitora para saber se tem algum error
        try {
           // Essa variável quantidade vai passar o dado digitado de String para double
        double quantidade = Double.parseDouble(txtQtd.getText());
         // Essa variável valor Unitário vai passar o dado digitado de String para double
        double valorUnit = Double.parseDouble(txtUnit.getText());
        //  Essa variável total vai fazer a multiplicação da quantidade com valor unitário
        double total=quantidade*valorUnit;
       
         // Essa variável do campo de texto total vai exibir o total no próprio campo
        txtTotal.setText(""+total);
        // O catch  vai fazer fazer o tratamento caso venha acontecer um error
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtUnitKeyReleased

    private void txtQtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyReleased
      
          // Ações para colocar o curso nos campos pelas setas
          
          // letra L para limpar o campo
           if(evt.getKeyCode()==evt.VK_L){
             txtQtd.setText("");
         }
           // seta esqueda para muda o curso para o campo do lado esquedor
           if(evt.getKeyCode()==evt.VK_LEFT){
             txtDescricao.requestFocus();
         }
           // seta direita para muda o curso para o campo do lado direito
            if(evt.getKeyCode()==evt.VK_RIGHT){
             txtUnit.requestFocus();
         }
          
            if(txtQtd.getText().equals("")&&txtUnit.getText().equals("")){
                txtTotal.setText("");
            }
         
           
        // o try vai monitora para saber se tem algum error
        try {
           // Essa variável quantidade vai passar o dado digitado de String para double
        double quantidade = Double.parseDouble(txtQtd.getText());
         // Essa variável valor Unitário vai passar o dado digitado de String para double
        double valorUnit = Double.parseDouble(txtUnit.getText());
        //  Essa variável total vai fazer a multiplicação da quantidade com valor unitário
        double total=quantidade*valorUnit;
      
         // Essa variável do campo de texto total vai exibir o total no próprio campo
        txtTotal.setText(""+total);
        // O catch  vai fazer fazer o tratamento caso venha acontecer um error
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtQtdKeyReleased

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
         
          // Ações para colocar o curso nos campos pelas setas
          
          // letra L para limpar o campo
           if(evt.getKeyCode()==evt.VK_DELETE){
             txtDescricao.setText("");
         }
           // seta esqueda para muda o curso para o campo do lado esquedor
           if(evt.getKeyCode()==evt.VK_RIGHT){
             txtQtd.requestFocus();
         }
            // seta esqueda para muda o curso para o campo do lado esquedor
           if(evt.getKeyCode()==evt.VK_LEFT){
             jComboBoxCliente.requestFocus();
         }
    }//GEN-LAST:event_txtDescricaoKeyReleased

    private void jComboBoxClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxClienteKeyReleased
         // seta esqueda para muda o curso para o campo do lado esquedor
           if(evt.getKeyCode()==evt.VK_RIGHT){
             txtDescricao.requestFocus();
         }
    }//GEN-LAST:event_jComboBoxClienteKeyReleased

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
       
    }//GEN-LAST:event_jPanel2KeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
       
    }//GEN-LAST:event_formKeyReleased

    private void btDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletaActionPerformed
        // Essa ação vai deletar um tipo de serviço
        // Método para deletar um tipo de serviço
          deletaTipoDeServico();
    }//GEN-LAST:event_btDeletaActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
         //Essa ação vai adicionar os dados no banco de dados
         //Método que adiconarr os dados no banco de dados
         addTipoServicos();
    }//GEN-LAST:event_btAddActionPerformed

    private void btListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaActionPerformed
        // Essa ação vai lista todos tipos de serviços 
        // Método para lista todos tipos de serviços
        listaTodosTiposDeServicos();
    }//GEN-LAST:event_btListaActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // Essa ação vai alterar o tipo de serviço
        //Método para alterar o tipo de serviço
        alterarTipoDeServico();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tabTipoServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTipoServicosMouseClicked
       
           //Seta os valores nos campos de textos ao clicar na linha da tabela;
        if (tabTipoServicos.getSelectedRow() != -1) {

            txtCod.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 0).toString());
            txtDescricao.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 2).toString());
            txtQtd.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 3).toString());
            txtUnit.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 4).toString());
            txtTotal.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 5).toString());
            txtData.setText(tabTipoServicos.getValueAt(tabTipoServicos.getSelectedRow(), 6).toString());
           
          
        }

          codigotiposervico=txtCod.getText();
    }//GEN-LAST:event_tabTipoServicosMouseClicked
    
    //Método para adicionar no banco de dados
     public void addTipoServicos(){
         // Uma instância da classe TiposDeServicosDao criando um objeto
         TiposDeServicosDao daoTds = new TiposDeServicosDao();
         // Uma instância da classe TiposDeServicosModel criando um objeto
         TiposDeServicosModel add = new TiposDeServicosModel();
         //Passando os atributos do tipos de serviços
         add.setCodCliente(jComboBoxCliente.getSelectedItem().toString());
         add.setDescricao(txtDescricao.getText());
         add.setQtd(Integer.parseInt(txtQtd.getText()));
         add.setValorUnit(Double.parseDouble(txtUnit.getText()));
         add.setValorTotal(Double.parseDouble(txtTotal.getText()));
         add.setData(txtData.getText());
         // adicionando os dados no objeto tipo daoCli
         daoTds.adicionaTiposDeServico(add);
         
     }
    
      // Método para lista os clientes no jcomboxCliente 
        public void exibirJcamboxCliente(){
            // Instância a classe ClineteDao para criar um objeto
            ClienteDao cliente = new ClienteDao();
            //um forit para percorrer os objetos e adicionar na JcomboxCliente
            for (ClienteModel tp : cliente.visualizarClientes()) {
                   jComboBoxCliente.addItem(tp);
            }
        }
        
        
        //Método para visualizar todos tipos de serviços ;
    public void listaTodosTiposDeServicos() {
        DefaultTableModel  modelo = (DefaultTableModel) tabTipoServicos.getModel();
        //Método para não repetir os dados na tabela ;
         modelo.setNumRows(0);
        
        
        // Uma instância da classe TiposDeServicosDao criando um objeto
         TiposDeServicosDao daoTds = new TiposDeServicosDao();
        
       //Um Laço de repetição para lista todos tipos de serviços na tabela
        for (TiposDeServicosModel item : daoTds.visualizarTiposDeServicos()) {
            // Passando o objeto do tipo de servicos para o objeto da tabela Jtable ou tabTipoServicos
            modelo.addRow(new Object[]{
                //Passando os objetos 
                item.getCodTipoServicos(),
                item.getCodCliente(),
                item.getDescricao(),
                item.getQtd(),
                item.getValorUnit(),
                item.getValorTotal(),
                item.getData()

            });
        }

    }
    // Método para deletar um tipo de serviço
    public void deletaTipoDeServico(){
          // Uma instância da classe TiposDeServicosDao criando um objeto
         TiposDeServicosDao daoTds = new TiposDeServicosDao();
         // Uma instância da classe TiposDeServicosModel criando um objeto
         TiposDeServicosModel deleta = new TiposDeServicosModel();
        // Passando o código no parâmentro
         deleta.setCodTipoServicos(txtQtd.getText());
         // Passando o objeto do modelo para o objeto dao
         daoTds.deletaTipoDeServico(deleta);
    }
    
    // MÉTODO PARA ALTERAR TIPO DE SERVIÇO
     public void alterarTipoDeServico(){
           // Uma instância da classe TiposDeServicosDao criando um objeto
         TiposDeServicosDao daoTds = new TiposDeServicosDao();
         // Uma instância da classe TiposDeServicosModel criando um objeto
         TiposDeServicosModel altera = new TiposDeServicosModel();
         // PASSANDO OS DADOS NOS PARÂMENTROS NO OBJETO TiposDeServicosModel
         altera.setCodCliente(jComboBoxCliente.getSelectedItem().toString());
         altera.setDescricao(txtDescricao.getText());
         altera.setQtd(Integer.parseInt(txtQtd.getText()));
         altera.setValorUnit(Double.parseDouble(txtUnit.getText()));
         altera.setValorTotal(Double.parseDouble(txtTotal.getText()));
         altera.setData(txtData.getText());
         //Passando o código do tipo de serviço para alterar 
         altera.setCodTipoServicos(codigotiposervico);
         //Pssando o objeto TiposDeServicos para o objeto TiposDeServicosDao
         daoTds.atualizarTipoDeServico(altera);
     }
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiposDeServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btDeleta;
    private javax.swing.JButton btLista;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabTipoServicos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
