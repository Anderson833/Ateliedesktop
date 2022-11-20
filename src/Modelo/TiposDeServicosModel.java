/*
    Essa classe vai ter os dados para modela os tipos de serviços
 */
package Modelo;

/**
 *
 * @author anderson
 */
public class TiposDeServicosModel {
   
    // Os atributos
    private String codTipoServicos;
    private String codCliente;
    private String Descricao;
    private int Qtd;
    private double valorUnit;
    private double valorTotal;
    private String Data;
   
    // construtor vazio
    public TiposDeServicosModel(){
        
    }
    // construtor com parametros
    public TiposDeServicosModel(String codTipoServicos, String codCli, String Descricao,int qtd, double valorUnit, double valorTotal, String Data) {
        this.codTipoServicos = codTipoServicos;
        this.codCliente = codCli;
        this.Descricao = Descricao;
        this.Qtd=qtd;
        this.valorUnit = valorUnit;
        this.valorTotal = valorTotal;
        this.Data = Data;
    }

    
    // Os métodos getters e setters 
    
    /**
     * @return the codTipoServicos
     */
    public String getCodTipoServicos() {
        return codTipoServicos;
    }

    /**
     * @param codTipoServicos the codTipoServicos to set
     */
    public void setCodTipoServicos(String codTipoServicos) {
        this.codTipoServicos = codTipoServicos;
    }

    
    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the valorUnit
     */
    public double getValorUnit() {
        return valorUnit;
    }

    /**
     * @param valorUnit the valorUnit to set
     */
    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the Qtd
     */
    public int getQtd() {
        return Qtd;
    }

    /**
     * @param Qtd the Qtd to set
     */
    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    /**
     * @return the codCliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    
    
    
}
