/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasecliente;

/**
 *
 * @author Manuel
 */
public class ImprimirClientes {

    public void imprimirCli(String[] clientes) {
        /*Bucle for que recorre un vector y en base a la instancia de i,
        devolverá un valor dado del vector con su texto correspondiente.
         */
        for (int i = 0; i < clientes.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Nombre: " + clientes[i]);
                    break;
                case 1:
                    System.out.println("Apellidos: " + clientes[i]);
                    break;
                case 2:
                    System.out.println("DNI: " + clientes[i]);
                    break;
                case 3:
                    System.out.println("Edad: " + clientes[i]);
                    break;
                case 4:
                    System.out.println("Telefono: " + clientes[i]);
                    break;
                case 5:
                    System.out.println("Cuenta Bancaria: " + clientes[i]);
                    break;
                case 6:
                    System.out.println("Estado Civil: " + clientes[i]);
                    break;
                case 7:
                    System.out.println("Número de hijos: " + clientes[i]);
                    break;
                case 8:
                    System.out.println("Email: " + clientes[i]);
                    break;
                case 9:
                    System.out.println("Dirección: " + clientes[i]);
                    break;
                case 10:
                    System.out.println("Equipo de Futbol: " + clientes[i]);
                    break;
                case 11:
                    System.out.println("Etnia: " + clientes[i]);
                    break;
            }
        }
    }
}
