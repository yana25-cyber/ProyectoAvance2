/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2.Clases;

/**
 *
 * @author valer
 */
import javax.swing.JOptionPane;
        

public class Ventas_Diarias {
    
    
    public double ventasTotalesDia;
    public int totalProductosVendidos;
    public int ventasPorCliente;
    public int ventasPorProducto; 
    
    public Ventas_Diarias(){
        ventasTotalesDia = 0;
        totalProductosVendidos = 0;
        ventasPorCliente = 0;
        ventasPorProducto = 0;    
    }
    
    public void registroVenta(double monto, int cantidad, int cliente, int producto) {
        ventasTotalesDia += monto;
        totalProductosVendidos += cantidad;
        ventasPorCliente += cliente;
        ventasPorProducto += producto;
    }
    
    public void mostrarVentasDia(){
        JOptionPane.showMessageDialog(null, "Ventas del día: " + ventasTotalesDia + "\n Total productos vendidos: " + totalProductosVendidos);
    }
    
    public void mostrarVentasPorProducto () {
        JOptionPane.showMessageDialog(null, "Ventas registradas por producto: " + ventasPorProducto);
    }
    
    public void mostrarVentasPorCliente(){
        JOptionPane.showMessageDialog(null, "Ventas registradas por cliente: " + ventasPorCliente);
    }
    
    public void menuVentas(){
            String [] opciones = {
                "1. Ventas del día",
                "2. Ventas por producto",
                "3. Ventas por cliente",
                "4. Volver al menú"
            };
            
            int opcion = 0;
            
            while (opcion !=3) {
                
                opcion = JOptionPane.showOptionDialog(null, "Seleccione el reporte que desea ver", "Ventas Diarias", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                
                if (opcion == 0){
                    mostrarVentasDia();
                }
                
                if (opcion == 1) {
                    mostrarVentasPorProducto();
                }
                
                if(opcion == 2){
                    mostrarVentasPorCliente();
                }
                
                if(opcion == 3) {
                    return;
                }
            }
    }
    
}
