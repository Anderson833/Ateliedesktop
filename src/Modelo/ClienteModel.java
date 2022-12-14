
/* Essa classe vai modela para tipo de cliente*/
package Modelo;

/**
 *
 * @author ander
 */
public class ClienteModel {
    
    
    //Atributos
    private  int codCli;
    private String nome;
    private String endereco;
    private String telefone;
    private int codUsuario;  // atributo para pegar o código do usuário
    //Os Métodos gettres e settres  
    public int getCodCli() {
        return codCli;
    }

  
    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }
  
 

   
    public String toString() {
        return String.valueOf(getNome());
    }
    
     //Métodos get e set
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the codUsuario
     */
    public int getCodUsuario() {
        return codUsuario;
    }

    /**
     * @param codUsuario the codUsuario to set
     */
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    
    
}
