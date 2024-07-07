
package com.mycompany.poo_factura;

import java.util.Scanner;


public class POO_FACTURA {

    public static void main(String[] args) {
        
      Producto minisplit12 = new Producto(1, "minisplit 12000 btu", 900000, 0, 0);
      Producto instalacion = new Producto(2, "Instalacion", 200000, 0, 0);
      
      Scanner tecladoText = new Scanner (System.in);
        System.out.println("Desea continuar? Escriba Si para continuar, No para finalizar");
       String respuesta = tecladoText.nextLine();
       
       while (respuesta.equalsIgnoreCase("si")){
           System.out.println("Que producto o servicio desea: \n 1 Minisplit \n 2 Instalacion");
           
           
           Scanner tecladoInt = new Scanner(System.in);
           int eleccion = tecladoInt.nextInt();
           switch(eleccion){
               case 1: minisplit12.facturarProducto();
               break;
               case 2: instalacion.facturarServicio();
               break;
               default: System.out.println("Por favor ingrese una respuesta valida");
               break;
           }
           
           System.out.println("Desea agregar algo mas?");
           respuesta = tecladoText.nextLine();
         
       }
       
       double totalFactura = (minisplit12.getTotal() + instalacion.getTotal());
       System.out.println("El total facturado es " + totalFactura)); 
    }
}
