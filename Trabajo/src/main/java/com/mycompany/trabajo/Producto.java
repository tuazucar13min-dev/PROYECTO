/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author CIELO
 */
    public class Producto {
    private int codigo;
    private int cantidad;
    public String nombreProducto;
    private String marca;
    private double precio;
    private String genero;
    
    
   
    public Producto(int codigo, int cantidad, BaseDatos bd ){
        this.codigo = codigo;
        this.cantidad = cantidad;
         String[] datos = bd.buscarProducto(codigo, cantidad);
        if (datos != null) {
            this.nombreProducto = datos[0];
            this.marca = datos[1];
            this.precio = Double.parseDouble(datos[2]);
    }
        else {
            this.nombreProducto = " Producto no encontrado";
            this.marca =" N/A";
            this.precio = 0.0;
        }
    }
    // Getters necearios para Factura 
   public int getCodigo(){ return codigo; }
   public int getCantidad(){ return cantidad; }
   public String getNombreProducto() { return nombreProducto;}
   public String getMarca(){ return marca;}
   public double getPrecio(){ return precio;}
   public String getGenero() { return genero;}
  
    
    public double totalProducto(){
        return cantidad*precio;

    }
    @Override
    public  String toString(){
    
    return "\nDETALLE DE COMPRA" +
               "\nProducto seleccionado : " + nombreProducto +
               "\nCantidad : " + cantidad +
               "\nPrecio unitario : S/" + String.format("%.2f", precio) +
               "\nSubtotal: S/" + String.format("%.2f", totalProducto());
    }
    }
    
    




