/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra2s7;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Progra2s7 {

    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        
        do{
            
            System.out.println("1-Agregar Empleado");
            System.out.println("2-listar Empleados No Despedidos");
            System.out.println("3-Agregar Venta a Empleado");
            System.out.println("4-Pagar Empleado");
            System.out.println("5-Despedir Empleado");
            System.out.println("6-Salir");
            System.out.println("Escoger Una Opcion");
            
            opcion = leer.nextInt();
        
        }while(opcion!=6);
    }
    
}
