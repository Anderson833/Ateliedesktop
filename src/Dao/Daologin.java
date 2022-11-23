/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Conexao.Conexao_BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */

  // HERDANDO DA CLASS Conexao_BD; 
public class Daologin  extends Conexao_BD {
    
     //MÉTODO PARA REALIZAR LOGIN DO USUÁRIO;
    public boolean logar(String usuario,String senha){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
    
         boolean clicar=false;
       
          try{
             //Comando para selecionar usuário e senha no banco de dados;
             String sql="select * from usuario where login=? and senha=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,usuario);
             patm.setString(2,senha);
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
                 clicar=true;
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Logar");
        }

    
            return clicar;
    }
    
      //MÉTODO PARA REALIZAR LOGIN DO VISITANTE
    public boolean logarVisitante(String login,String senha){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
    
         boolean clicar=false;
       
          try{
             //Comando para selecionar usuário e senha no banco de dados;
             String sql="select * from visitante where email=? and senha=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,login);
             patm.setString(2,senha);
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
                 clicar=true;
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Logar visitante");
        }

    
            return clicar;
    }
     //MÉTODO PARA LISTA CÓDIGO DO USUÁRIO PELO USUARIO E SENHA
    public String setaCodigoDoUsuario(String usuario,String senha){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
    String codigoUsuario = null;
         
          try{
             //Comando para selecionar usuário e senha no banco de dados;
             String sql="select codUsuario from usuario where login=? and senha=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,usuario);
             patm.setString(2,senha);
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
              codigoUsuario=rst.getString("codUsuario");
                
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Logar");
        }

    
            return codigoUsuario;
    }
     //MÉTODO PARA LISTA CÓDIGO DO VISITANTE PELO login E SENHA
    public String setaCodigoDoVisitante(String Login,String senha){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
         String codigoVisitante = null;
         
          try{
             //Comando para busca email e senha do visitante no banco de dados;
             String sql="select codVisitant from visitante where email=? and senha=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,Login);
             patm.setString(2,senha);
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
              codigoVisitante=rst.getString("codVisitant");
                
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao lista código do visitante");
        }

    
            return codigoVisitante;
    }
     //MÉTODO PARA LISTA OS NOMES DOS ASSINANTE
    public String setaNomeDoAssisnate(String usuario){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
   
          String nome=null;
         
          try{
             //Comando para selecionar o nome de todos assinante no banco de dados;
             String sql="select nome from assinante where codLogin=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,usuario);
          
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
                 nome=rst.getString("nome");
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao seta nome do assinante");
        }

    
            return nome;
    }
     //MÉTODO PARA SETA PERFIL DOS ASSINANTES
    public String setaPerfilDoAssinante(String perfil){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
    
          String perf=null;
         
          try{
             //Comando para selecionar o nome de todos assinante no banco de dados;
             String sql="select perfil from assinante where codLogin=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,perfil);
          
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
                 perf=rst.getString("perfil");
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao seta perfil do assinante");
        }

    
            return perfil;
    }
     //MÉTODO PARA LISTA OS NOMES DOS ASSINANTE
    public String setaSuspendeDoAssisnante(String suspense){
        
        //Instânciando conexão com classe Conexso_BD;
        Connection conn=Conexao_BD.getConnection();
    
 
          String suspende=null;
         
          try{
             //Comando para selecionar o nome de todos assinante no banco de dados;
             String sql="select suspender from assinante where nome=? ";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             patm.setString(1,suspense);
          
             
             ResultSet rst =patm.executeQuery();
             
             if(rst.next()){
                 suspende=rst.getString("suspender");
             } else {
            }
   
           //Fechando conexão PreparedStatement;
           patm.close();
          
           //Fechando conexão Connection;
           conn.close();
          
        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao seta o código de suspense do assinante");
        }

    
            return suspende;
    }
    
     //Método para lista último código do assinante salvo da tabela assinante;
    public String listaCodigoDoAssinante() {
        
         //variável para armazenar o último código do assinante
           String codigoAssinante=null;
        
        try {
            Connection Conn = Conexao_BD.getConnection();

            //Comando para selecionar  o ultimo código da tabela assinante
            String sql = "SELECT max(codLogin) FROM assinante";

            PreparedStatement Patm = Conn.prepareStatement(sql);

            //Executar
            ResultSet Rst = Patm.executeQuery();

            if (Rst.next()) {
                //setando os dados
                codigoAssinante=Rst.getString("max(codLogin)");
                
            } 

            //Fechando conexão ResultSet;
            Rst.close();

            //Fechando conexão PreparedStatement;
            Patm.close();

            //Fechando conexão Connection;
            Conn.close();

        } catch (SQLException e) {
            //caso de algo errado exiber essa mensagem;
            JOptionPane.showMessageDialog(null, "Código do assinante não encontrado ! ");
        }
        return codigoAssinante;
        
       
    }
  
    
     //Método para adicionar visitante
    public void adicionaVisitante(String nome,String email,String senha,String perfil) {
        
       
        
        try {
            Connection Conn = Conexao_BD.getConnection();

            //Comando para salva os dados no banco de dados na tabela visitante
            String sql = "insert into visitante (nome,email,senha,perfil) values('"+nome+"','"+email+"','"+senha+"','"+perfil+"')";

            PreparedStatement Patm = Conn.prepareStatement(sql);
            
            //Executar
            int update=Patm.executeUpdate();

            if (update>0) {
               JOptionPane.showMessageDialog(null, "Visitante adicionado com sucesso!");
            } else{
          JOptionPane.showMessageDialog(null, "Visitante não  encontrado!");

            }

        
            //Fechando conexão PreparedStatement;
            Patm.close();

            //Fechando conexão Connection;
            Conn.close();

        } catch (SQLException e) {
            //caso de algo errado exiber essa mensagem;
            JOptionPane.showMessageDialog(null, "Visitante não foi adicionado ! ");
        }
     
        
    }
    
    
    
}
