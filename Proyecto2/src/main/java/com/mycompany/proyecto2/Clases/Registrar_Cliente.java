/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2.Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author yana1
 */
public class Registrar_Cliente {
    //Atributos
    public int codigo;
    public String cliente;
    public int cedula;
    public int totalproductos;
    public double facturacion;
    
    //constructor

    public Registrar_Cliente(String cliente, int cedula, int totalproductos, double facturacion, int codigo) {
        this.cliente = cliente;
        this.cedula = cedula;
        this.totalproductos = totalproductos;
        this.facturacion = facturacion;
        this.codigo= codigo;
}
   //Setters y getters
    public String getCliente() {return cliente;}
    public int getCedula() {return cedula;}
    public int getTotalproductos() {return totalproductos;}
    public double getFacturacion() {return facturacion;}
    public int getCodigo() {return codigo;}
    

    public void setCliente(String cliente) {this.cliente = cliente;}
    public void setCedula(int cedula) {this.cedula = cedula;}
    public void setTotalproductos(int totalproductos) {this.totalproductos = totalproductos;}
    public void setFacturacion(double facturacion) {this.facturacion = facturacion;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    
    //Metodo para mostrar informacion
    @Override
    public String toString(){
        return "Cliente" + cliente +
                "\nCedula" + cedula +
                "\nCodigo" + codigo+
                "\nTotal de productos" + totalproductos+
                "\nFactura" + facturacion;
    }
    
}
