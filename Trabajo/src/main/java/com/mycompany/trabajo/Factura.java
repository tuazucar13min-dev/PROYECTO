/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 *
 * @author CIELO
 */
public class Factura {
    private BaseDatos bd;

    public Factura(BaseDatos bd) {
        this.bd = bd;
    }
    

    public void imprimirFactura() {
        System.out.println("\n========= FACTURA DE COMPRA =========");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s %-10s %-10s\n",
                "Cant", "Producto", "Marca"," Genero",  "Precio", "Total", "Codigo");

        double totalGeneral = 0;

        for (Producto producto : bd.getProductoselec()) {
            int cantidad = producto.getCantidad();
            String nombre = producto.getNombreProducto();
            String marca = producto.getMarca();
            double precio = producto.getPrecio();
            double total = producto.totalProducto();
            int codigo = producto.getCodigo();
            String genero = producto.getGenero();

            System.out.printf("%-5d %-25s %-15s %-10s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, nombre, marca,genero ,  precio, total, codigo);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL: S/ %.2f\n", totalGeneral);

        
    }
    
    public void imprimirFacturaListas() {
        System.out.println("\n========= FACTURA DE COMPRA - LISTAS ROPAS =========");
        System.out.printf("%-5s %-20s %-10s %-10s %-10s\n",
                "Cant", "Lista Ropa ", "Precio", "Total", "# Lista");

        double totalGeneral = 0;

        for (ListaProducto lista : bd.getListaRopaCompradas()) {
            int cantidad = lista.getCantidad();
            double precio = lista.getPrecio();
            double total = lista.Calcularsubtotal();
            int nroLista = lista.getLista();

            String descripcion = "Lista Ropa " + nroLista;
            System.out.printf("%-5d %-20s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, descripcion, precio, total, nroLista);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL LISTAS: S/ %.2f\n", totalGeneral);
        }


        public void imprimirFacturaMangas(){
        System.out.println("\n========= FACTURA DE COMPRA  =========");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s %-10s %-10s\n",
                "Cant", "Producto", "Marca"," Genero",  "Precio", "Total", "Codigo");

        double totalGeneral = 0;

        for (MANGAS_ANIME producto : bd.getMangasselec()) {
            int cantidad = producto.getCantidad();
            String nombre = producto.getNombreProducto();
            String marca = producto.getMarca();
            double precio = producto.getPrecio();
            double total = producto.totalProducto();
            int codigo = producto.getCodigo();
            String genero = producto.getGenero();

            System.out.printf("%-5d %-25s %-15s %-10s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, nombre, marca,genero ,  precio, total, codigo);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL: S/ %.2f\n", totalGeneral);

        
    }
    
    public void imprimirFacturaListaMangas() {
        System.out.println("\n========= FACTURA DE COMPRA - LISTAS MANGAS =========");
        System.out.printf("%-5s %-20s %-10s %-10s %-10s\n",
                "Cant", "Lista Ropa ", "Precio", "Total", "# Lista");

        double totalGeneral = 0;

        for (ListaMANGAS_ANIME lista : bd.getListaMangasselec()) {
            int cantidad = lista.getCantidad();
            double precio = lista.getPrecio();
            double total = lista.Calcularsubtotal();
            int nroLista = lista.getLista();

            String descripcion = "Lista Ropa " + nroLista;
            System.out.printf("%-5d %-20s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, descripcion, precio, total, nroLista);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL LISTAS: S/ %.2f\n", totalGeneral);


        }

       public void imprimirFacturaRopaAnime(){
        System.out.println("\n========= FACTURA DE COMPRA  =========");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s %-10s %-10s\n",
                "Cant", "Producto", "Marca"," Genero",  "Precio", "Total", "Codigo");

        double totalGeneral = 0;

        for (ROPA_ANIME producto : bd.getRopaAmineselec()) {
            int cantidad = producto.getCantidad();
            String nombre = producto.getNombreProducto();
            String marca = producto.getMarca();
            double precio = producto.getPrecio();
            double total = producto.totalProducto();
            int codigo = producto.getCodigo();
            String genero = producto.getGenero();

            System.out.printf("%-5d %-25s %-15s %-10s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, nombre, marca,genero ,  precio, total, codigo);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL: S/ %.2f\n", totalGeneral);

        
    }
    
    public void imprimirFacturaListasRopaAnime() {
       System.out.println("\n========= FACTURA DE COMPRA - LISTAS MANGAS =========");
        System.out.printf("%-5s %-20s %-10s %-10s %-10s\n",
                "Cant", "Lista Ropa ", "Precio", "Total", "# Lista");

        double totalGeneral = 0;

        for (ListaROPA_ANIME lista : bd.getListaRopaAnimeselec()) {
            int cantidad = lista.getCantidad();
            double precio = lista.getPrecio();
            double total = lista.Calcularsubtotal();
            int nroLista = lista.getLista();

            String descripcion = "Lista Ropa " + nroLista;
            System.out.printf("%-5d %-20s S/ %-8.2f S/ %-8.2f %-10d\n",
                    cantidad, descripcion, precio, total, nroLista);

            totalGeneral += total;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL GENERAL LISTAS: S/ %.2f\n", totalGeneral);


        }
}