/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;


import java.util.Scanner;
import com.mycompany.trabajo.Trabajo;
import com.mycompany.trabajo.Producto;
import com.mycompany.trabajo.ListaProducto;
import com.mycompany.trabajo.Factura;
import com.mycompany.trabajo.BaseDatos;
import com.mycompany.trabajo.MANGAS_ANIME ;
import com.mycompany.trabajo.ListaMANGAS_ANIME ;
import com.mycompany.trabajo.ROPA_ANIME ;
import com.mycompany.trabajo.ListaROPA_ANIME ;



/**
 *
 * @author CIELO
 */
public class Trabajo {
    public static Producto IngresaProductos(){//Este metodo permite mostrar la pantalla de productos y elegir
        int codigo=0 , cantidad=0 ;
        Scanner dato = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        bd.mostrarMenuProductos();
        System.out.println("Seleccione el producto ingresando su codigo");
       
        try {
        codigo = dato.nextInt();
        System.out.println("ingrese cantidad:");
       
        cantidad = dato.nextInt();
        dato.nextLine(); // Limpiar buffer 
        
        Producto objcomprado = new Producto(codigo, cantidad, bd);
        return objcomprado;
        }
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
    }
       public static MANGAS_ANIME IngresaMangas(){  
       int codigo=0 , cantidad=0 ;
        Scanner dato = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        bd.mostrarMangas();
        System.out.println("Seleccione el producto ingresando su codigo");
        try {
        codigo = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        dato.nextLine(); // Limpiar buffer 
        
        MANGAS_ANIME objcomprado = new MANGAS_ANIME(codigo, cantidad, bd);
        return objcomprado;
        }
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
    }
        public static ROPA_ANIME IngresaRopaAnime(){  
       int codigo=0 , cantidad=0 ;
        Scanner dato = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        bd.mostrarRopaAnime();
        System.out.println("Seleccione el producto ingresando su codigo");
        try {
        codigo = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        dato.nextLine(); // Limpiar buffer 
        
        ROPA_ANIME objcomprado = new ROPA_ANIME(codigo, cantidad, bd);
        return objcomprado;
        }
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
    }
        public static ListaProducto IngresarListas(){
        BaseDatos bd = new BaseDatos();
        Scanner dato = new Scanner(System.in);
        int lista=0 , cantidad=0 ;
        double precio =0 ;

        System.out.println("Lista de ropa  1:  S/.245.50");
        bd.mostrarLista(bd.getListaRopa1());
        System.out.println("\nLista de ropa 2:  S/.350.20");
        bd.mostrarLista(bd.getListaRopa2());
        System.out.println("\nLista de ropa 3:  S/.180");
        bd.mostrarLista(bd.getListaRopa3());
     
        System.out.println("Seleccione el numero de lista");
        try { 
        lista = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        
        switch (lista) {
            case 1: precio = 245.50;            
                break;
            case 2: precio = 350.20;            
                break;
            case 3: precio = 180;            
                break;
            default:
                System.out.println("Lista no válida debes ingresar 1, 2 0 3 ");
            return null;
        }
        
        ListaProducto objlista = new ListaProducto (lista, cantidad, precio);
        return objlista;
        }  
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
        }
        
        public static ListaMANGAS_ANIME  IngresarListasMangas(){
        BaseDatos bd = new BaseDatos();
        Scanner dato = new Scanner(System.in);
        int lista=0 , cantidad=0 ;
        double precio =0 ;
     
         System.out.println("Lista manga  1:  S/.200.00");
        bd.mostrarLista(bd.getListaRopa1()); // A
        System.out.println("\nLista mangan 2:  S/.350.20");
        bd.mostrarLista(bd.getListaRopa2());
        System.out.println("\nLista manga 3:  S/.180");
        bd.mostrarLista(bd.getListaRopa3());
     
        System.out.println("Seleccione el numero de lista");
        try { 
        lista = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        
        switch (lista) {
            case 1: precio = 200.00;            
                break;
            case 2: precio = 350.20;            
                break;
            case 3: precio = 180;            
                break;
            default:
                System.out.println("Lista no válida debes ingresar 1 - 3 ");
            return null;
        }
        ListaMANGAS_ANIME objlista = new ListaMANGAS_ANIME (lista, cantidad, precio);
        return objlista;
        }
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
        }
        public static ListaROPA_ANIME IngresarListasRopaAnime(){
        BaseDatos bd = new BaseDatos();
        Scanner dato = new Scanner(System.in);
        int lista=0 , cantidad=0 ;
        double precio =0 ;

        System.out.println("Lista de ropa anime  1:  S/.245.50");
        bd.mostrarLista(bd.getListaRopa1());
        System.out.println("\nLista de ropa anime 2:  S/.350.20");
        bd.mostrarLista(bd.getListaRopa2());
        System.out.println("\nLista de ropa anime 3:  S/.180");
        bd.mostrarLista(bd.getListaRopa3());
     
        System.out.println("Seleccione el numero de lista");
        try { 
        lista = dato.nextInt();
        System.out.println("ingrese cantidad:");
        cantidad = dato.nextInt();
        
        switch (lista) {
            case 1: precio = 245.50;            
                break;
            case 2: precio = 350.20;            
                break;
            case 3: precio = 180;            
                break;
            default:
                System.out.println("Lista no válida debes ingresar 1, 2 0 3 ");
            return null;
        }
        
        ListaROPA_ANIME objlista = new ListaROPA_ANIME(lista, cantidad, precio);
        return objlista;
        }  
        catch ( Exception e ){ 
        System.out.println (" Error al ingresar del prodcuto ");
        dato.nextLine();// Limpiar buffer en caso de error 
        return null;
        }
        }    
       
        public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int comando = 0;
        boolean selecValida = true;
                
        do {
             System.out.println("\n ====== MENU PRINCIPAL ======");
            System.out.println("Buenos dias, Porfavor seleccione el tipo de compra");
            System.out.println("(1) Compra de productos especificos");
            System.out.println("(2) Compra de Lista de ropas ");
            System.out.println("(3) Compra Mangas ");
            System.out.println("(4) Lista  Mangas ");
            System.out.println("(5) Compra Ropa Anime ");
            System.out.println("(6) Compra Lista Ropa Anime ");
            System.out.println("(7) Salir ");
            try { 
                comando = Integer.parseInt(dato.nextLine());
            if (comando >=1 && comando <= 7) {
                break;
            }else{
                 
               System.out.println ( " Camando no valido. Intente nuevamente 1-5 ");
                
            }
            }catch ( Exception ex ){
                  System.out.println (" Error: entrada no válida. Por favor, ingresa un numero 1 0 5");  
                  dato.nextLine();
                   continue;     
            }
        } while ( selecValida );
        
        
        if (comando ==7 ) {
           System.out.println(" Gracias por visitarnos ");
           dato.close();
           return;
        }
        String continuar = "";
        BaseDatos bd = new BaseDatos();
        Factura factura = new Factura(bd);
     
        switch (comando){
            case 1: 
            System.out.println(" Ingresaste a sección de ropa  ");
            do {
                Producto objcomprado = IngresaProductos();
                if (objcomprado != null ){
                    bd.getProductoselec().add(objcomprado);
                    System.out.println(objcomprado.toString());
                    System.out.println(" Subtotal: s/ " + objcomprado.totalProducto());
  
                    System.out.println(" Desea continuar? si/no");
                    continuar = dato.next();
                    dato.nextLine();

                }
            
            }while (continuar.equalsIgnoreCase("si"));
            factura.imprimirFactura();
            break;
            
            case 2: 
            System.out.println(" Ingresaste a sección de Lista de ropa  ");
           
            do {                
                ListaProducto objlista = IngresarListas();
                if ( objlista !=null){
                objlista.getPrecio();
                objlista.Calcularsubtotal();
                System.out.println("Lista agragada" + objlista.toString());
                //Agregar lista a la base de datos 
                bd.agregarListaRopa(objlista);
                }
                else{
                System.out.println("No se pudo agregar la lista");

                }
                System.out.println("Desea continaur? si/no");
                continuar = dato.next();
            } while (continuar.equalsIgnoreCase("si"));
            
            factura.imprimirFacturaListas();
            // Esto imprime la factura de listas escolares
            break;
            case 3:
            System.out.println("Ingresaste a la seccion de mangas ");
            do {
                MANGAS_ANIME objmanga = IngresaMangas();
                if (objmanga != null ){
                    bd.getMangasselec().add(objmanga);
                    System.out.println(objmanga.toString());
                    System.out.println(" Subtotal: s/ " + objmanga.totalProducto());
  
                    System.out.println(" Desea continuar? si/no");
                    continuar = dato.next();
                    dato.nextLine();

                }
            
            }while (continuar.equalsIgnoreCase("si"));
            factura.imprimirFacturaMangas();
            break;
            case 4: 
            System.out.println("Ingresaste a la seccion lista mangas  ");
            do {                
                ListaMANGAS_ANIME objlista = IngresarListasMangas();
                if ( objlista !=null){
                objlista.getPrecio();
                objlista.Calcularsubtotal();
                System.out.println("Lista agragada" + objlista.toString());
                //Agregar lista a la base de datos 
                bd.agregarListaMangas(objlista);
                }
                else{
                System.out.println("No se pudo agregar la lista");

                }
                System.out.println("Desea continaur? si/no");
                continuar = dato.next();
            } while (continuar.equalsIgnoreCase("si"));
            
            factura.imprimirFacturaListaMangas();
            break;
            
            
            case 5 :
            System.out.println("Ingresaste a la seccion  ropa anime  ");
            do {
                ROPA_ANIME objropaanime = IngresaRopaAnime();
                if (objropaanime != null ){
                    bd.getRopaAmineselec().add(objropaanime);
                    System.out.println(objropaanime.toString());
                    System.out.println(" Subtotal: s/ " + objropaanime.totalProducto());
  
                    System.out.println(" Desea continuar? si/no");
                    continuar = dato.next();
                    dato.nextLine();

                }
            
            }while (continuar.equalsIgnoreCase("si"));
            factura.imprimirFacturaRopaAnime();
            break;
            
            case 6: 
            System.out.println("Ingresaste a la seccion lista ropa anime   ");
            do {                
                ListaROPA_ANIME objlista = IngresarListasRopaAnime();
                if ( objlista !=null){
                objlista.getPrecio();
                objlista.Calcularsubtotal();
                System.out.println("Lista agragada" + objlista.toString());
                //Agregar lista a la base de datos 
                bd.agregarListaRopaAnime(objlista);
                }
                else{
                System.out.println("No se pudo agregar la lista");

                }
                System.out.println("Desea continaur? si/no");
                continuar = dato.next();
            } while (continuar.equalsIgnoreCase("si"));
            
            factura.imprimirFacturaListasRopaAnime();
            break;
            }
       System.out.println("\n¡Gracias por su compra!");
       dato.close();

}

}   