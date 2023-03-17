package com.generation.javarecuperativatecnico.models;

public class Cliente {
    
    //ATRIBUTOS
    public String nombreCliente;
    public String direccionCliente;
    public String medioPago;

    
    //CONSTRUCTORES
    public Cliente() {
    }

    public Cliente(String nombreCliente, String direccionCliente, String medioPago) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.medioPago = medioPago;
    }


    //GETTERS AND SETTERS
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }


    //TOSTRING
    @Override
    public String toString() {
        return "Cliente [nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", medioPago="
                + medioPago + "]";
    }
}
