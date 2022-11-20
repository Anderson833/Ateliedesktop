/*
  Essa classe vai se responsável para fazer a manipulação dos dados no banco de dados
 */
package Dao;

import Conexao.Conexao_BD;
import Modelo.ClienteModel;
import Modelo.TiposDeServicosModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson
 */
public class TiposDeServicosDao {
    
     //Método para adicionar os tipos de serviços ao banco de dados;
    public void adicionaTiposDeServico(TiposDeServicosModel servico){
        
        //Criando uma Connection com Classe Conexao_BD; 
        Connection conn=Conexao_BD.getConnection();
        
       
        try {
            //Comando para inserindo os dados dos tipos de serviços no banco de dados;
            String sql="insert into tiposDeServicos(codCli,descricao,qtd,valorUnit,valorTotal,data)values(?,?,?,?,?,?)";
             
            PreparedStatement patm = conn.prepareStatement(sql);
           
            //Passando como paramentros os atributos do tipos de serviços da classe TiposDeServicosModel;
            patm.setString(1, servico.getCodCliente());
            patm.setString(2, servico.getDescricao());
            patm.setInt(3, servico.getQtd());
            patm.setDouble(4, servico.getValorUnit());
            patm.setDouble(5, servico.getValorTotal());
            patm.setString(6, servico.getData());
      
            
            //Executar;
            int upd=patm.executeUpdate();
            
            if(upd>0){
                //Caso de tudo certo exibir essa mensagem;
                JOptionPane.showMessageDialog(null, "Tipo de serviço Adicionado Com Sucesso");
            }else{
                //Caso de error  exibir essa mensagem;
                JOptionPane.showMessageDialog(null, "Tipo de serviço não Adicionado !","Error ",JOptionPane.ERROR_MESSAGE);
            }
            
             //Fechando conexão PreparedStatement;
            patm.close();
            
            //Fechando conexão Connection;
            conn.close();
            
        } catch (SQLException ex) {
            //Caso aconteça algum error mostrar essa mensagem;
           JOptionPane.showMessageDialog(null, "Error ao Adicionar um tipo de serviço!");
           ex.printStackTrace();
        }
        
    }
    
       
     //Método para visualizar todos tipos de serviços
     public List<TiposDeServicosModel> visualizarTiposDeServicos(){
        //Criando uma Connection com Classe Conexao_BD; 
        Connection conn=Conexao_BD.getConnection();
     
        //ArrayList de tiposDeServicos;
         ArrayList<TiposDeServicosModel> listaTiposServicos = new ArrayList<>();
        
         try {
             
             //Selecionando toda tabela tiposdeservicos;
             String sql="SELECT * FROM tiposdeservicos";
             
             PreparedStatement patm = conn.prepareStatement(sql);
             
             ResultSet rst=patm.executeQuery();
             
             while (rst.next()) {
               
                 //Instânciando  classe TiposDeServicosModel para criar um objeto
                 TiposDeServicosModel tds = new TiposDeServicosModel();
                 //Setando os Valores;
                 tds.setCodTipoServicos(rst.getString("codTipoSv"));
                 tds.setCodCliente(rst.getString("codCli"));
                 tds.setDescricao(rst.getString("descricao"));
                 tds.setQtd(rst.getInt("qtd"));
                 tds.setValorUnit(rst.getDouble("valorUnit"));
                 tds.setValorTotal(rst.getDouble("valorTotal"));
                 tds.setData(rst.getString("data"));
                 //Adicionado no objeto do arrayList ;
                 listaTiposServicos.add(tds);
          
             }
             
             //Fechando conexão ResultSet;
             rst.close();
    
             //Fechando conexão PreparedStatement;
            patm.close();
            
            //Fechando conexão Connection;
            conn.close();
             
         } catch (Exception e) {
             //Algo de error mostrar essa mensagem;
             JOptionPane.showMessageDialog(null, "Error ao Visualizar Todos tipos de serviços!");
         }
         //Retornando uma Lista de Clientec;
        return listaTiposServicos;
         
     }
      //Método para deletar um tipo de servico;
      public void deletaTipoDeServico(TiposDeServicosModel servic){
          
           //Criando uma Connection com Classe Conexao_BD; 
        Connection conn=Conexao_BD.getConnection();
             
        try {

          // Comando para deletar um tipo de servico pelo código;
            String sql = "DELETE FROM tiposdeservicos WHERE codTipoSv=?";

            PreparedStatement patm = conn.prepareStatement(sql);
             
            //Passando em parâmetro o atributo já informado
            patm.setString(1, servic.getCodTipoServicos());
            
            //Executar;
            int res = patm.executeUpdate();

            if (res > 0) {
                //Caso de tudo certo será exibido essa mensagem para usuário;
                JOptionPane.showMessageDialog(null, "Tipo de serviço Deletado com Sucesso !", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                 //Caso de errado será exibido essa mensagem para usuário;
                JOptionPane.showMessageDialog(null, "Tipo de serviço não Deletado !", "Error", JOptionPane.ERROR_MESSAGE);
            }

            //Fechando conexão PreparedStatement;
            patm.close();
            
            //Fechando conexão Connection;
            conn.close();
            

        } catch (Exception e) {
            //Caso de error ao deletar mostrar essa mensagem;
             JOptionPane.showMessageDialog(null, "Error ao Deletar um tipo de serviço !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
      }
      
        //Método para alterar os dados do tipo de serviço
       public void atualizarTipoDeServico(TiposDeServicosModel servico){  
           //Criando uma Connection com Classe Conexao_BD; 
        Connection conn=Conexao_BD.getConnection();
               try {
           
          //Comando para alterar os dados do tipo de serviço;
            String sql="UPDATE tiposdeservicos SET codCli=?,descricao=?,qtd=?,valorUnit=?,valorTotal=?,data=? WHERE codTipoSv=?";
            
            
            
            PreparedStatement patm = conn.prepareStatement(sql);
            //Passandos valores nos paramentros;
            patm.setString(1,servico.getCodCliente());
            patm.setString(2,servico.getDescricao());
            patm.setInt(3,servico.getQtd());
            patm.setDouble(4,servico.getValorUnit());
            patm.setDouble(5,servico.getValorTotal());
            patm.setString(6,servico.getData());
            patm.setString(7,servico.getCodTipoServicos());
             
            //Executar;
             int res= patm.executeUpdate();
            
            if(res>0){
                //Mensagem para mostrar para usuário caso esteja tudo correto!;
                JOptionPane.showMessageDialog(null,"Tipo de serviço Atualizador com Sucesso !","Sucesso!",JOptionPane.INFORMATION_MESSAGE);
            }else{
                //Mensagem oara exibir para usuário caso tenha informações incorretas;
                JOptionPane.showMessageDialog(null,"Tipo de serviço não Atualizador !","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            //Fechando conexão PreparedStatement;
            patm.close();
            
            //Fechando conexão Connection;
            conn.close();
            
        } catch (Exception e) {
            //Mensagem caso de error;
              JOptionPane.showMessageDialog(null,"Error ao Atualizar tipo de serviço !","Error",JOptionPane.ERROR_MESSAGE);
        }
     
       }
}
