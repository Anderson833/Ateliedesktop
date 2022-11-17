/*
 Essa classe vai realizar a conexão com banco de dados
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Conexao_BD {
 
    
    //Método de Conexão com Banco De Dados ;
    public static Connection getConnection() {

        //Criando uma Connection;
       Connection conexao = null;

        try {

            //Carregando os Driver ;
            Class.forName("com.mysql.jdbc.Driver");

            //Criando uma Conexão com Banco De Dados;
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/atelieDesk", "root", "");

        } catch (Exception e) {
            // Caso ocorrer algum error exibir essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Conectar Com Banco De Dados !");
        }

        //Retornando a Conexão com Banco de Dados;
        return conexao;

    }

   
 
  
   
}

 
  
