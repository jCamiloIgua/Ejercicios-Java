
package com.mycompany.supermercadopoo;


public class Lacteos extends Producto{
    
    //Atributo
    private String tipoProducto;
    private int valorFermentacion;
    
    public Lacteos(){
        super();
    }
    
    public Lacteos(String n, double p, int c, String tip, int vfr){
        super(n,p,c);
        this.tipoProducto = tip;
        this.valorFermentacion = vfr;
    }
    
    //Metodos

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getValorFermentacion() {
        return valorFermentacion;
    }

    public void setValorFermentacion(int valorFermentacion) {
        this.valorFermentacion = valorFermentacion;
    }
   
}
