
package com.mycompany.poo_factura;

import java.util.Scanner;




public class Producto {
    int id;
    String nombre;
    double precio;
    int cantidad;
    double total;
    Scanner tecladoInt = new Scanner(System.in);
    public Producto(){
        
    }
    
    public Producto(int id, String nombre, double precio, int cantidad, double total){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
    }


    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public void facturarProducto(){
        System.out.println("Qué cantidad desea llevar");
        cantidad = tecladoInt.nextInt();
        total = cantidad * precio;
        System.out.println("precio total: " + total);
    }
    
    public void facturarServicio(){
        System.out.println("Para cuantos equipos?");
        cantidad = tecladoInt.nextInt();
        total = cantidad * precio;
        System.out.println("precio total: " + total);
    }
}
