/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venta;

/**
 *
 * @author jurge
 */
public class java {
    package ventas;

public class Venta {
   
    private int idVenta;
    private String nombreProducto;
    private int cantidad;
    private double total;

  
    public Venta(int idVenta, String nombreProducto, int cantidad, double total) {
        this.idVenta = idVenta;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.total = total;
    }

   
    public int getIdVenta() {
        return idVenta;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }
}
}
