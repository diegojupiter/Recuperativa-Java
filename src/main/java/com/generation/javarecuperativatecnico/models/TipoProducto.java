package com.generation.javarecuperativatecnico.models;

public class TipoProducto extends Producto{
    
    //ATRIBUTOS 
    public String categoria;
    public String proveedor;


    //CONSTRUCTORES
    public TipoProducto() {
        super();
    }

    public TipoProducto(String categoria, String proveedor) {
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public TipoProducto(String nombreProducto, String precioVenta, String precioCompra, String ganancia,
            String categoria, String proveedor) {
        super(nombreProducto, precioVenta, precioCompra, ganancia);
        this.categoria = categoria;
        this.proveedor = proveedor;
    }


    //GETTERS AND SETTERS
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }


    //TOSTRING
    @Override
    public String toString() {
        return super.toString() + "TipoProducto [categoria=" + categoria + ", proveedor=" + proveedor + "]";
    }

    
    

}
