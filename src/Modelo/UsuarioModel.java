
package Modelo;

/**
 *
 * @author anderson
 */
public class UsuarioModel {
    
    //Atributos do usuário;
    
    private int idUsu;
    private String nome;
    private String login;
    private String senha;
    private String CodAssinate;
    private String perfil;

     //Métodos get e set
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public int getIdUsu() {
        return idUsu;
    }
    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }
   
    public String getLogin() {
        return login;
    }

   
    public void setLogin(String login) {
        this.login = login;
    }

   
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getIdUsu());
    }

    /**
     * @return the CodAssinate
     */
    public String getCodAssinate() {
        return CodAssinate;
    }

    /**
     * @param CodAssinate the CodAssinate to set
     */
    public void setCodAssinate(String CodAssinate) {
        this.CodAssinate = CodAssinate;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
     
}
