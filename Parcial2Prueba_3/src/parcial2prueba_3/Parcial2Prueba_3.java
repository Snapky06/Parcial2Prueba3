/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2prueba_3;

import java.io.IOException;
import java.util.Scanner;

public class Parcial2Prueba_3 {

    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        EmpleadosManager manager = new EmpleadosManager();

        do {
            System.out.println("\n----- GESTION DE EMPLEADOS -----");
            System.out.println("1- Agregar Empleado");
            System.out.println("2- Listar Empleados Activos");
            System.out.println("3- Agregar Venta a Empleado");
            System.out.println("4- Pagar Empleado");
            System.out.println("5- Despedir Empleado");
            System.out.println("6- Imprimir Informe de Empleado");
            System.out.println("7- Salir");
            System.out.print("Escoja una opcion: ");

            opcion = leer.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del empleado: ");
                        leer.nextLine(); 
                        String nombre = leer.nextLine();
                        System.out.print("Ingrese salario del empleado: Lps. ");
                        double salario = leer.nextDouble();
                        manager.addEmployee(nombre, salario);
                        System.out.println("¡Empleado agregado con exito!");
                        break;
                    case 2:
                        System.out.println("\n--- Lista de Empleados Activos ---");
                        manager.employeelist();
                        break;
                    case 3:
                        System.out.print("Ingrese codigo del empleado: ");
                        int codeVenta = leer.nextInt();
                        System.out.print("Ingrese monto de la venta: Lps. ");
                        double monto = leer.nextDouble();
                        manager.addSaleToEmployee(codeVenta, monto);
                        break;
                    case 4:
                        System.out.print("Ingrese codigo del empleado a pagar: ");
                        int codePago = leer.nextInt();
                        manager.payEmployee(codePago);
                        break;
                    case 5:
                        System.out.print("Ingrese codigo del empleado a despedir: ");
                        int codeDespido = leer.nextInt();
                        manager.fireEmployee(codeDespido);
                        break;
                    case 6:
                        System.out.print("Ingrese codigo del empleado para ver informe: ");
                        int codeInforme = leer.nextInt();
                        manager.printEmployee(codeInforme);
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                        break;
                }
            } catch (IOException e) {
                System.err.println("Ha ocurrido un error de archivo: " + e.getMessage());
            }

        } while (opcion != 7);
    }
}