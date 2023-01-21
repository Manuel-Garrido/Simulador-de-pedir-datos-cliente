/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasecliente;

import java.util.*;

/**
 *
 * @author Manuel
 */
public class Clientes {

    public void menu() {
        //Variables locales del menu e iniciación de las clases Imprimir y Pedir Datos.
        Scanner sc = new Scanner(System.in);
        PedirDatos pedir = new PedirDatos();
        ImprimirClientes imprimir = new ImprimirClientes();
        boolean flag = false;

        int opcion = 0, cont = 1;
        //Bucle que inicia el bucle hasta que la variable opcion sea == 3.
        do {
            //Pedimos datos para el menu con la variable opción mediante el Scanner.
            System.out.println("MENÚ");
            System.out.println("---------------");
            System.out.println("1.Pedir Datos");
            System.out.println("2.Mostrar Datos");
            System.out.println("3.Salir");
            System.out.println("---------------");
            opcion = sc.nextInt();
            //Condicción que especifica que si opción no esta entre 1 y 3 muestre un error.
            if (opcion < 1 || opcion > 3) {
                System.err.println("La opción que has introducido no es valida, por favor, introduzca otra.");
            } else {
                //Condicción que comprueba que si opción es distinto de 1 y la bandera es falsa muestre un error.
                if (opcion != 1 && flag == false) {
                    System.err.println("Por favor, introduzca primeros los datos.");
                    //Si es una de las opciones valida pasa la bandera a true y pide los datos.
                } else if (opcion == 1 && flag == false) {
                    flag = true;
                    System.out.println("Datos del cliente " + (cont) + ":");
                    pedir.PedirDatosCli();
                    //Sino se cumple ninguna pone bandera en falso y muestra los datos del cliente.
                } else {
                    flag = false;
                    System.out.println("Datos del Cliente " + (cont) + ":");
                    imprimir.imprimirCli(pedir.clientes);
                    cont++;
                }
            }
        } while (opcion != 3);
    }
    
    //Método main que inicia el objeto de la clase para iniciar el método menu.
    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        cliente.menu();
    }
}
