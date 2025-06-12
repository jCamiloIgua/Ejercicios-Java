
package com.mycompany.supermercadopoo;


public class Bebidas extends Producto{
    //Atributos
    private String tipoProducto;
    private int nivelAzucaresAñadidos;
    
    public Bebidas(){
        super();
    }
    
    public Bebidas(String n, double p, int c, String tip, int niAz){
        super(n,p,c);
        this.tipoProducto = tip;
        this.nivelAzucaresAñadidos = niAz;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getNivelAzucaresAñadidos() {
        return nivelAzucaresAñadidos;
    }

    public void setNivelAzucaresAñadidos(int nivelAzucaresAñadidos) {
        this.nivelAzucaresAñadidos = nivelAzucaresAñadidos;
    }
    
}
