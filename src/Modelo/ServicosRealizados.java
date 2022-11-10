/*
 Essa classe vai modela os tipos de serviços realizados
 */
package Modelo;

/**
 *
 * @author ander
 */
public class ServicosRealizados {
    // os atributos
    private String codServioRealizado;
    private String codTipodServio;
    private String codCliente;
    private String data;
    
    // construtor sem parâmentros
    public ServicosRealizados(){   
    
    }
     // construtor com parâmetros
    public ServicosRealizados(String codServioRealizado, String codTipodServio, String codCliente, String data) {
        this.codServioRealizado = codServioRealizado;
        this.codTipodServio = codTipodServio;
        this.codCliente = codCliente;
        this.data = data;
    }
    
    // os métodos getters e setters

    /**
     * @return the codServioRealizado
     */
    public String getCodServioRealizado() {
        return codServioRealizado;
    }

    /**
     * @param codServioRealizado the codServioRealizado to set
     */
    public void setCodServioRealizado(String codServioRealizado) {
        this.codServioRealizado = codServioRealizado;
    }

    /**
     * @return the codTipodServio
     */
    public String getCodTipodServio() {
        return codTipodServio;
    }

    /**
     * @param codTipodServio the codTipodServio to set
     */
    public void setCodTipodServio(String codTipodServio) {
        this.codTipodServio = codTipodServio;
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

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
