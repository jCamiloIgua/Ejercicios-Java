
package com.mycompany.supermercadopoo;

public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String n, double p, int c ) {
        this.nombre = n;
        this.precio = p;
        this.cantidad = c;
    }
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
