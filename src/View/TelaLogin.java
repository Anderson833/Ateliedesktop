/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Conexao.Conexao_BD;
import Dao.Daologin;
import Modelo.CodigoGlobal;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        
        //CENTRALIZANDO VIEW AO CENTRO;
        setLocationRelativeTo(this);
        
      //  logarSemPressionarBota();
     
    }
    
       //Variavel para pegar usuario do banco de dados
        String usuario="";
        
        //variavel para pegar a senha do usuario no banco
        String senha="";
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUSUARIO = new javax.swing.JTextField();
        BTLOGIN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        mostra = new javax.swing.JCheckBox();
        btCadastro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acessar Sistema");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/usuario-masculino.png"))); // NOI18N
        jLabel1.setText("Usu??rio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/senha.png"))); // NOI18N
        jLabel2.setText("  Senha:");

        txtUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSUARIOActionPerformed(evt);
            }
        });
        txtUSUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUSUARIOKeyPressed(evt);
            }
        });

        BTLOGIN.setBackground(new java.awt.Color(255, 255, 255));
        BTLOGIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTLOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/login.png"))); // NOI18N
        BTLOGIN.setText("Logar");
        BTLOGIN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLOGINActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("    Controle De Vendas");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsenhaKeyReleased(evt);
            }
        });

        mostra.setText("Mostrar");
        mostra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraActionPerformed(evt);
            }
        });

        btCadastro.setText("Se encontar sem cadastror Cadastre-se!");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        jButton1.setText("Esqueceu a Senha!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(txtUSUARIO)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(mostra)
                        .addGap(139, 139, 139)
                        .addComponent(BTLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mostra)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLOGINActionPerformed
      
       // m??todo para realiza as fun????es ao fazer login
        funcaoDeEntrada();
            
    }//GEN-LAST:event_BTLOGINActionPerformed
     //M??todo para realizar as fun????es de login ao entrar
     public void funcaoDeEntrada(){
          boolean  CampoVazioUsuario, CampoVazioSenha,CampoUsuarioSenhaVazio;
            // condi????o para saber se o campo de usu??rio est?? vazio
         CampoVazioUsuario=(txtUSUARIO.getText().isEmpty());
          // condi????o para saber se o campo de senha est?? vazio
          CampoVazioSenha=(txtsenha.getText().isEmpty());
            // condi????o para saber se o campo de usu??rio e senha est?? vazio
         CampoUsuarioSenhaVazio=( CampoVazioUsuario &&  CampoVazioSenha);
        
         // Inst??nciando a classe DaoLogin para criar um novo objeto
          Daologin lg = new Daologin();
        
          // Passando o objeto do tipo lg com c??digo para vari??vel codigoUsu
        String codigoUsu=lg.setaCodigoDoUsuario(txtUSUARIO.getText(), txtsenha.getText());
                JOptionPane.showMessageDialog(null,"C??digo do usuario "+codigoUsu);

      // Passando a variavel codigoUsu com c??digo  do assinante para o objeto lg seguinte para lista o nome do assinante
           String nomeDoAssinante=lg.setaNomeDoAssisnate(codigoUsu);
        JOptionPane.showMessageDialog(null,"nome do assinante "+nomeDoAssinante);

           /* Passando a vari??vel do tipo nomeDoAssinante com nome do assinante para o objeto lg seguinte 
               para lista o valor de suspender */
       String suspender=lg.setaSuspendeDoAssisnante(nomeDoAssinante);
            JOptionPane.showMessageDialog(null,"numero do suspender "+suspender);

              
            // condi????o para saber o campo de usuario e senha est?? vazio
              if(CampoUsuarioSenhaVazio){
                  txtUSUARIO.setBackground(Color.GREEN);
                   txtsenha.setBackground(Color.GREEN);
                   JOptionPane.showMessageDialog(null, "Preencha os campos!");
             }
            // condi????o para saber o campo de usuario est?? vazio
            else  if( CampoVazioUsuario){
                  JOptionPane.showMessageDialog(null, "Preencha campo de login!","Por favor:",JOptionPane.WARNING_MESSAGE);
                  txtUSUARIO.setBackground(Color.red);
                    txtUSUARIO.requestFocus();
                    // condi????o para saber o campo de senha est?? vazio
             }else if( CampoVazioSenha){
                 JOptionPane.showMessageDialog(null, "Preencha campo de senha!","Por favor:",JOptionPane.WARNING_MESSAGE);
                  txtsenha.setBackground(Color.red);
                    txtsenha.requestFocus();
             }
             else if(lg.logarVisitante(txtUSUARIO.getText(),txtsenha.getText())){
                
                 String codVisitante=lg.setaCodigoDoVisitante(txtUSUARIO.getText(),txtsenha.getText());
                 
                 JOptionPane.showMessageDialog(null,"codigo do visitante "+codVisitante); 
                 //Inst??nciando view  TelaPrincipal;
                TelaInicial tp = new TelaInicial();
              //Passando objeto para abrir TelaPrincipal ao Logar;
              tp.setVisible(true);
                //Fechando a  TelaLgin;
               this.dispose();
             }
              else if(suspender.equals(codigoUsu) && codigoUsu!=null){
           JOptionPane.showMessageDialog(null, "Seu acesso expirou, Por Favor Recarregue sua assinatura para poder ter acesso!","Aviso:",JOptionPane.INFORMATION_MESSAGE);
             } else{
                   // condi????o para verificar se esses dados tem no banco de dados
              if(lg.logar(txtUSUARIO.getText(), txtsenha.getText())){
                // Inst??nciando a classe CodigoGlobal para receber o c??digo do usu??rio
                 CodigoGlobal cdg = new CodigoGlobal();
                 cdg.setCodigo((lg.setaCodigoDoUsuario(txtUSUARIO.getText(), txtsenha.getText())));
             
              //Inst??nciando view  TelaPrincipal;
                TelaInicial tp = new TelaInicial();
              //Passando objeto para abrir TelaPrincipal ao Logar;
              tp.setVisible(true);
                //Fechando a  TelaLgin;
               this.dispose();
            }else{
                 JOptionPane.showMessageDialog(null, "Usu??rio ou Senha Incorreta!");
            } 
             }
             
          
     }
    private void txtUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSUARIOActionPerformed

  
    }//GEN-LAST:event_txtUSUARIOActionPerformed

    
    private void txtsenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyReleased


    }//GEN-LAST:event_txtsenhaKeyReleased

  
    
    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed

    }//GEN-LAST:event_txtsenhaActionPerformed

    private void mostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraActionPerformed
     
        
        
        // condi????o para mostrar a senha do usu??rio digitada
       
         if(mostra.isSelected()){
            
             if(txtsenha.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null,"Tente Novamente: ", "Senha n??o Digitada: ",JOptionPane.ERROR_MESSAGE);
                  txtsenha.requestFocus();
             }else{
             String senha="USUARIO "+this.txtsenha.getPassword();
             senha=txtsenha.getText();
             JOptionPane.showMessageDialog(null, "Senha Digitada:  "+senha);
              txtsenha.requestFocus();
            }
     
         }
    }//GEN-LAST:event_mostraActionPerformed

    private void txtUSUARIOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUSUARIOKeyPressed
       
                txtUSUARIO.setBackground(Color.WHITE);
                      txtUSUARIO.requestFocus();
    }//GEN-LAST:event_txtUSUARIOKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
        
        
          txtsenha.setBackground(Color.WHITE);
                      txtsenha.requestFocus();
        
        
    }//GEN-LAST:event_txtsenhaKeyPressed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
            
        Usuario usu = new Usuario();
        usu.setVisible(true);
    }//GEN-LAST:event_btCadastroActionPerformed
    
      //M??todo para seta usu??rio e senha  dos usu??rios para logar;
    public boolean logarNoSistema() {

         try {
            Connection Conn = Conexao_BD.getConnection();

            
            String sql = "SELECT login,senha FROM usuario where login like '"+txtUSUARIO.getText()+"'";

            PreparedStatement Patm = Conn.prepareStatement(sql);

            //Executar
            ResultSet Rst = Patm.executeQuery();

            if (Rst.next()) {
                //setando nome
               // txtNcli.setText(Rst.getString("codVenda"));
               usuario=  Rst.getString("login");
               senha=  Rst.getString("senha");
              
            } else {
                //SETA CAMPO VAZIO
              //  txtNcli.setText("");

            }

            //Fechando conex??o ResultSet;
            Rst.close();

            //Fechando conex??o PreparedStatement;
            Patm.close();

            //Fechando conex??o Connection;
            Conn.close();

        } catch (SQLException e) {
            //caso de algo errado exiber essa mensagem;
            JOptionPane.showMessageDialog(null, "login n??o encontrado ! ");
        }
        return true;

    }
  
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTLOGIN;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox mostra;
    private javax.swing.JTextField txtUSUARIO;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
