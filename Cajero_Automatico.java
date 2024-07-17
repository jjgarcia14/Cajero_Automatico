package Cajero_Automatico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cajero_Automatico {
    private static List<String> productos = new ArrayList<>();
    private static List<String> clientes = new ArrayList<>();
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("MENÚ DE OPCIONES");
    int opciones;
    // Bucle do-while para mostrar el menú de opciones hasta que el usuario decida salir  
    do{
        System.out.println("OPC:1 INGRESAR PRODUCTOS");
        System.out.println("OPC:2 LISTA DE CLIENTES");
        System.out.println("OPC:3 VER PRODUCTOS");
        System.out.println("OPC:4 PRECIO TOTAL");
        System.out.println("OPC:5 SALIR");
        opciones = sc.nextInt();
    // Estructura switch para manejar las opciones del menú
        switch (opciones) {
            case 1:
                 ingresar_productos ();
                                 
                break;
            case 2:
                clientes ();
               
               break;  
            case 3:
                 ver_productos ();
              
              break;
            case 4:
                 precio_total ();
             
             break;
            case 5:
                System.out.println( "usted ha salido");
                break;
        }
    }while(opciones !=5);      
}
// Método para ingresar productos
private static void ingresar_productos(){
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("INGRESE UN PRODUCTO CON PRECIO O 'SALIR' PARA TERMINAR");
        String producto = sc.nextLine();
        if (producto.equalsIgnoreCase("salir")) {
            break;
        
        }
        productos.add(producto);
    }
}
// Método para manejar la lista de clientes
private static void clientes(){
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("INGRESE UN CLIENTE O 'SALIR' PARA TERMINAR");
        String cliente = sc.nextLine();
        if (cliente.equalsIgnoreCase("salir")) {
            break;     
        }
        clientes.add(cliente);
    }while(true){
  }  
}
// Método para manejar el precio de productos
private static void ver_productos(){
    if (productos.isEmpty()) {
        System.out.println("No hay productos ingresados.");
    } else {
        System.out.println("LOS PRODUCTOS SON:");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}
// Método para manejar el precio total
private static void precio_total(){
    Scanner sc = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    System.out.println("ingrese sus numeros: ");
    n1 = sc.nextInt();    
    System.out.println("INGRESE SU SEGUNDO NUMERO");
    n2 = sc.nextInt();

    System.out.println("la suma de sus nuemros es: " + (n1 + n2));
    
}
   
}
