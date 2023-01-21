/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasecliente;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class PedirDatos {
    //Vector que tendrá los datos del cliente y el escaner en forma global.
    String [] clientes = new String [12];
    Scanner sc = new Scanner(System.in);
    //Método que pide los datos de los clientes.
    public void PedirDatosCli(){
        //Bucle que comprueba que el nombre se introduzca y no sea 0 su longitud.
        do{
            System.out.println("Introduzca tu nombre:");
            clientes[0]=sc.nextLine();
        }while(clientes[0].length()==0);
        
        String apellido1="", apellido2="";
        //Bucle que comprueba que los apellidos no sean de longitud 0.
        do{
            System.out.println("Introduzca el apellido 1:");
            apellido1=sc.nextLine();
            if(apellido1.length()==0){
                System.err.println("No has introducido el primer apellido.");
            }else{
                System.out.println("Introduzca el apellido 2:");
                apellido2=sc.nextLine();
                if(apellido2.length()==0){
                    System.err.println("No has introducido el segundo apellido.");
                }
            }
            
            clientes[1] = apellido1+" "+apellido2;
            
        }while(apellido1.length()==0 || apellido2.length()==0);
        //Bucle que comprueba que el número del DNI sea de longitud 8 y la letra una solamente.
        do{
            String numeros="", letra="";
            //Bucle que comprueba que el DNI tenga una 8 números.
            do{
                System.out.println("Introduce los 8 números del DNI");
                numeros = sc.nextLine();
                if(numeros.length()<8 || numeros.length()>8){
                    System.err.println("No has introducido los 8 números o lo has excedido.");
                }
            }while(numeros.length()!=8);
            //Bucle que comprueba que el DNI tenga una letra.
            do{
                System.out.println("Introduce la letra del DNI");
                letra = sc.nextLine();
            }while(letra.length()!=1);
            
            clientes[2]=numeros+letra;
        }while(clientes[2].length()==0);
        //Bucle que comprueba que la edad sea solo 3 valores.
        do{
            System.out.println("Introduzca tu edad:");
            clientes[3]=sc.nextLine();
        }while(clientes[3].length()==0 || clientes[3].length()>3);
        //Bucle que comprueba que el teléfono sea solo 9 valores.
        do{
            System.out.println("Introduzca tu telefono:");
            clientes[4]=sc.nextLine();
        }while(clientes[4].length()<9);
        //Bucle que comprueba que se introduzca la cuenta bancaria.
        do{
            System.out.println("Introduzca tu cuenta bancaria:");
            clientes[5]=sc.nextLine();
        }while(clientes[5].length()==0);
        //Bucle que comprueba que el estado civil sea introducido.
        do{
            System.out.println("Introduzca tu estado civil:");
            clientes[6]=sc.nextLine();
        }while(clientes[6].length()==0);
        ///Bucle que comprueba que los hijos sean introducidos.
        do{
            System.out.println("Introduzca tus hijos:");
            clientes[8]=sc.nextLine();
        }while(clientes[8].length()==0);
        //Bucle que comprueba que el Email sea introducido.
        do{
            System.out.println("Introduzca tu Email:");
            clientes[7]=sc.nextLine();
        }while(clientes[7].length()==0);
        //Bucle que comprueba que la dirección sea introducida.
        do{
            System.out.println("Introduzca tu dirección:");
            clientes[9]=sc.nextLine();
        }while(clientes[9].length()==0);
        //Bucle que comprueba que el equipo de futbol sea introducido.
        do{
            System.out.println("Introduzca tu equipo de futbol:");
            clientes[10]=sc.nextLine();
        }while(clientes[10].length()==0);
        //Bucle que comprueba que la etnia sea introducida.
        do{
            System.out.println("Introduzca tu etnia:");
            clientes[11]=sc.nextLine();
        }while(clientes[11].length()==0);
        
    }
}
