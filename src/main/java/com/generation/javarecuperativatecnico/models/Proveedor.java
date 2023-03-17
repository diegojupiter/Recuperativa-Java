package com.generation.javarecuperativatecnico.models;

public class Proveedor {
    
    //ATRIBUTOS
    public String nombreProveedor;
    public String direccionProveedor;
    public int fonoProveedor;


    //CONSTRUCTORES
    public Proveedor() {
    }

    public Proveedor(String nombreProveedor, String direccionProveedor, int fonoProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.fonoProveedor = fonoProveedor;
    }


    //GETTERS AND SETTERS
    public String getNombreProveedor() {
        return nombreProveedor;
    }


    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    public String getDireccionProveedor() {
        return direccionProveedor;
    }


    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }


    public int getFonoProveedor() {
        return fonoProveedor;
    }


    public void setFonoProveedor(int fonoProveedor) {
        this.fonoProveedor = fonoProveedor;
    }


    //TOSTRING
    @Override
    public String toString() {
        return "Proveedor [nombreProveedor=" + nombreProveedor + ", direccionProveedor=" + direccionProveedor
                + ", fonoProveedor=" + fonoProveedor + "]";
    } 
}
