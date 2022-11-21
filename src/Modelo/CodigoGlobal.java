/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ander
 */
public class CodigoGlobal {
    
    private static String codigo;
    
    public static String codigo(){
        return getCodigo();
    }

    /**
     * @return the codigo
     */
    public static String getCodigo() {
        return codigo;
    }

    /**
     * @param aCodigo the codigo to set
     */
    public static void setCodigo(String aCodigo) {
        codigo = aCodigo;
    }
    
}