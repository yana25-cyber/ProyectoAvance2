/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;

import com.mycompany.proyecto2.Clases.Ventas_Diarias;
import com.mycompany.proyecto2.Clases.Registrar_Cliente;
import javax.swing.JOptionPane;



/**
 *
 * @author yana1
 */
public class Proyecto2 {

    public static void main(String[] args) {
        //Arreglo 
        Registrar_Cliente clientes[] = new Registrar_Cliente[100];
        int contador = 0;
        int opcion= 0;
        
        Ventas_Diarias ventas = new Ventas_Diarias();
        
        //menu
        do{
            String [] opciones = {"Datos del cliente","Total de productos","Inventario","Mostrar facturacion","Registrar Empleado","Reporte","Salir"};
            opcion = JOptionPane.showOptionDialog(null, 
                    "Seleccione la informacion que necesita en el menú de gestión", "Supermercado Sol Naciente", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones [0]);
            
            switch (opcion){
                case 0:
                    if (contador < 100){
                        int codigo = contador + 1;
                        String cliente = JOptionPane.showInputDialog("Nombre del cliente");
                        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Numero de cedula"));
                        
                        JOptionPane.showMessageDialog(null, codigo, cliente, cedula);
                    }
            
                    break;
                    
                case 5:
                    ventas.menuVentas();
                    break;
            }
            
         }while(opcion!=6);
    }
}
       
    
