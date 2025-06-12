
package com.mycompany.supermercadopoo;

public class Carnes extends Producto{
    //Atributos
    private String tipoProducto;
    private int nivelCalorias;
    
    public Carnes(){
        super();
    }
    
    public Carnes(String n, double p, int c, String tip, int niCa){
        super(n,p,c);
        this.tipoProducto = tip;
        this.nivelCalorias = niCa;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getNivelCalorias() {
        return nivelCalorias;
    }

    public void setNivelCalorias(int nivelCalorias) {
        this.nivelCalorias = nivelCalorias;
    }
       
}
