package com.generation.javarecuperativatecnico.models;

public class Producto {
    
    //ATRIBUTOS
    public String nombreProducto;
    public String precioVenta;
    public String precioCompra;
    public String ganancia;

    
    //CONSTRUCTORES
    public Producto() {
    }


    public Producto(String nombreProducto, String precioVenta, String precioCompra, String ganancia) {
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.ganancia = ganancia;
    }


     //GETTERS AND SETTERS
    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public String getPrecioVenta() {
        return precioVenta;
    }


    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }


    public String getPrecioCompra() {
        return precioCompra;
    }


    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }


    public String getGanancia() {
        return ganancia;
    }


    public void setGanancia(String ganancia) {
        this.ganancia = ganancia;
    }


    //TOSTRING
    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", precioVenta=" + precioVenta + ", precioCompra="
                + precioCompra + ", ganancia=" + ganancia + "]";
    }
}
