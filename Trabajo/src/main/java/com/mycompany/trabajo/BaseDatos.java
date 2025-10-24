/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;
import java.util.ArrayList;
import java.util.HashMap; 

public class BaseDatos {
    private HashMap<Integer, String[]> productosMap ;// para seleccionar
    private HashMap<Integer, Double > preciosMap;
    private HashMap<Integer, String> generoMap;

    // productos individuales 
    private ArrayList<Producto> productoselec;
    private ArrayList<MANGAS_ANIME> mangasselec;
    private ArrayList<ROPA_ANIME > ropaAmineselec;

    // Paquetes o listas 
    private ArrayList<ListaProducto> listasRopaCompradas;
    private ArrayList<ListaMANGAS_ANIME> listaMangasselec;
    private ArrayList<ListaROPA_ANIME> listaRopaAnimeselec;

    // Definición de listas de productos individuales 
    // ROPA
    private String[] listaRopa1;// para seleccionar
    private String[] listaRopa2;// para seleccionar
    private String[] listaRopa3;// para seleccionar
    //MANGAS 
    private String[] listaMangas1;// para seleccionar
    private String[] listaMangas2;// para seleccionar
    private String[] listaMangas3;// para seleccionar
    //ROPA_ANIME
    private String[] listaRopaAnime1;// para seleccionar
    private String[] listaRopaAnime2;// para seleccionar
    private String[] listaRopaAnime3;
  

public BaseDatos(){
    // Iniciañizar tablas hash 
    productosMap= new HashMap<>();
    preciosMap = new HashMap<>();
    generoMap = new HashMap<>();

    productoselec = new ArrayList<>();
    mangasselec = new ArrayList<>();
    ropaAmineselec = new ArrayList<>();

    listasRopaCompradas = new ArrayList<>();
    listaMangasselec = new ArrayList<>();
    listaRopaAnimeselec = new ArrayList<>();


    // confirmar productos en tabla hash 
    // Inivializar productos 
    inicializarProductos();
    //Inicializar listas 
    inicializarListas();
   
    }

    private void inicializarProductos(){
    //CATEGORÍA: ROPA 
    // MUJERES DIOR 
    productosMap.put( 1001, new String[]{ "POLO"," Dior ", " F "});
    preciosMap.put(1001, 10.0);
    productosMap.put( 1002, new String[]{ "POLO"," Dior ", " F "});
    preciosMap.put(1002, 10.0);
    productosMap.put( 1003, new String[]{ "C"," Dior ", " F "});
    preciosMap.put(1003, 10.0);
    productosMap.put( 1004, new String[]{ "C"," Dior ", " F "});
    preciosMap.put(1004, 10.0);
    productosMap.put( 1005, new String[]{ "CHO"," Dior ", " F "});
    preciosMap.put(1005, 10.0);
    productosMap.put( 1006, new String[]{ "CHO"," Dior ", " F "});
    preciosMap.put(1006, 10.0);
     
    // MUJERES ZARA
    productosMap.put( 1007, new String[]{ "POLO"," Zara ", " F "});
    preciosMap.put(1007, 10.0);
    productosMap.put( 1008, new String[]{ "POLO"," Zara ", " F "});
    preciosMap.put(1008, 10.0);
    productosMap.put( 1009, new String[]{ "C"," Zara ", " F "});
    preciosMap.put(1009, 10.0);
    productosMap.put( 1010, new String[]{ "C"," Zara ", " F "});
    preciosMap.put(1010, 10.0);
    productosMap.put( 1011, new String[]{ "CHO"," Zara ", " F "});
    preciosMap.put(1011, 10.0);
    productosMap.put( 1012, new String[]{ "CHO"," Zara ", " F "});
    preciosMap.put(1012, 10.0);

     // HOMBRES DIOR 
    productosMap.put( 1013, new String[]{ "POLO"," Dior", " M "});
    preciosMap.put(1013, 10.0);
    productosMap.put( 1014, new String[]{ "POLO"," Dior ", " M "});
    preciosMap.put(1014, 10.0);
    productosMap.put( 1015, new String[]{ "C"," Dior ", " M "});
    preciosMap.put(1015, 10.0);
    productosMap.put( 1016, new String[]{ "C"," Dior ", " M "});
    preciosMap.put(1016, 10.0);
    productosMap.put( 1017, new String[]{ "CHO"," Dior ", " M "});
    preciosMap.put(1017, 10.0);
    productosMap.put( 1018, new String[]{ "CHO"," Dior ", " M "});
    preciosMap.put(1018, 10.0);
     
    // HOMBRES ZARA
    productosMap.put( 1019, new String[]{ "POLO"," Zara ", " M "});
    preciosMap.put(1019, 10.0);
    productosMap.put( 1020, new String[]{ "POLO"," Zara ", " M "});
    preciosMap.put(1020, 10.0);
    productosMap.put( 1021, new String[]{ "C"," Zara ", " M "});
    preciosMap.put(1021, 10.0);
    productosMap.put( 1022, new String[]{ "C"," Zara ", " M "});
    preciosMap.put(1022, 10.0);
    productosMap.put( 1023, new String[]{ "CHO"," Zara ", " M "});
    preciosMap.put(1023, 10.0);
    productosMap.put( 1024, new String[]{ "CHO"," Zara ", " M "});
    preciosMap.put(1024, 10.0);
    
    //CATEGORÍA: MANGAS 
    productosMap.put( 2001, new String[]{ " Naruto Tomo 2  "," Panini "," Shonen "});
    preciosMap.put(2001, 10.0);
    productosMap.put( 2002, new String[]{ " One piece Tomo 1"," Panini ", " Shonen "});
    preciosMap.put(2002, 10.0);
    productosMap.put( 2003, new String[]{ " Dragon Ball Tomo 5 "," Panini ", "Shonen"});
    preciosMap.put(2003, 10.0);
    productosMap.put( 2004, new String[]{ " Demon Slayer Tomo 1 "," Ivrea ", " Shonen "});
    preciosMap.put(2004, 10.0);
    productosMap.put( 2005, new String[]{ " Haikuu Tomo 5 "," Ivrea ", " Shonen "});
    preciosMap.put(2005, 10.0);
    productosMap.put( 2006, new String[]{ " Inuyasha Tomo 2  "," Ivrea ", " Shojo  "});
    preciosMap.put(2006, 10.0);
 
    //CATEGORIA : ROPA ANIME 
    
    productosMap.put( 3001, new String[]{ " Sudadera Naruto "," Anime Style ", " M "});
    preciosMap.put(3001, 10.0);
    productosMap.put( 3002, new String[]{ " Camiseta One Piece "," Anime Style ", " F "});
    preciosMap.put(3002, 10.0);
    productosMap.put( 3003, new String[]{ " Gorro Dragon Ball"," Anime Style ", " S "});
    preciosMap.put(3003, 10.0);
    productosMap.put( 3004, new String[]{ " Buzo Attack on Titan "," Anime Collection " , " M "});
    preciosMap.put(3004, 10.0);
    productosMap.put( 3005, new String[]{ " Polera Demon Slayer "," Anime Collection  ", " F "});
    preciosMap.put(3005, 10.0);
    productosMap.put( 3006, new String[]{ " Chaqueta My Hero Academy "," Anime Collection  ", " M "});
    preciosMap.put(3006, 10.0);        
   }
   private void agregarProducto( int codigo , String nombre, String marca, double precio, String género ){ 
   productosMap.put(codigo, new String [] {nombre,marca});
   preciosMap.put( codigo, precio);
   generoMap.put( codigo, género);
   }
   
   private void inicializarListas(){
   // Listas de ropa 
    this.listaRopa1 = new String[]{
            "Cuadernos A4 rayados - 5 unidades",
            "Lapices de grafito HB - 1 caja",
            "Borrador blanco - 2 unidades",
            "Tajador con depósito - 1 unidad",
            "Colores de madera - 1 estuche",
            "Regla de 30 cm - 1 unidad",
            "Boligrafos azul, rojo y negro - 1 de cada",
            "Tijera punta roma - 1 unidad",
            "Goma en barra - 2 unidades",
            "Cartuchera - 1 unidad"
        };
        this.listaRopa2 = new String[]{
            "Cuadernos cuadriculados - 6 unidades",
            "Lapices 2B - 1 caja",
            "Borrador blanco - 1 unidad",
            "Sacapuntas doble - 1 unidad",
            "Marcadores de colores - 1 set",
            "Regla flexible - 1 unidad",
            "Boligrafos azul y rojo - 2 de cada",
            "Tijera escolar - 1 unidad",
            "Goma líquida - 1 frasco",
            "Cartuchera con divisiones - 1 unidad"
        };
        this.listaRopa3 = new String[]{
            "Cuadernos universitarios - 4 unidades",
            "Lapiz y portaminas - 1 cada uno",
            "Borrador de tinta y grafito - 2 en 1",
            "Tajador metálico - 1 unidad",
            "Crayones - 1 caja",
            "Escuadra y transportador - 1 cada uno",
            "Boligrafos tricolor - 2 unidades",
            "Tijera profesional - 1 unidad",
            "Goma en barra grande - 1 unidad",
            "Cartuchera con cierre - 1 unidad"
        };
        // Lista de mangas 
        this.listaMangas1= new String[]{
        " Naruto Tomo 1-3 ",
        " Once piece Tomo 1 y 2",
        " Dragon Ball Tomo 1",
        " Stiker pack anime ",
        " Demon Slayer Tomo 1-3 ",
        };

        this.listaMangas2= new String[]{
        " Naruto Tomo 1-3 ",
        " Inuyasha Tomo 1 y 2",
        " Dragon Ball Tomo 1",
        " Black clover Tomo 5  ",
        " Demon Slayer Tomo 1-3 ",
        };
  
        this.listaMangas3= new String[]{
        " la novia del titan  1-3 ",
        " Dear Door 1-4",
        " Given Tomo 3 ",
        " Tokio Ghoul Tomo 1 ",
        " Bersek Tomo 5 ",
        };
       
        // Lista de ropa anime 
        this.listaRopaAnime1= new String[]{
        " Calcetines de Dragon Boll ",
        " Camiseta se Boku no pico ",
        " Sudadera de koro sensei ",
        " Calcetines de Demon Slayer ",
        " Gorro Satoru Gojo ",
        };

        this.listaRopaAnime2= new String[]{
        " Gorro Dear Door  ",
        " Calcetines One Piece ",
        " Camiseta Given  ",
        " Camiseta Tokio Ghoul  ",
        " Gorro Boku no pico ",
        };
        
        this.listaRopaAnime3= new String[]{
        " Gorro Gashiakuta ",
        " Calcetines One Piece ",
        " Polo Boku no piko  ",
        " Camiseta Tokio Ghoul  ",
        " Gorra de Desmon Salyer ",
        };
    }

    public String[] buscarProducto(int codigo, int cantidad){
      
    if (productosMap.containsKey(codigo) && preciosMap.containsKey(codigo)){
        String[]datosProducto = productosMap.get(codigo);
        String nombre = datosProducto[0];
        String marca = datosProducto[1];
        String genero = datosProducto [2];
        double precio = preciosMap.get(codigo);
        
        return new String[]{ datosProducto[0],datosProducto[1], String.valueOf(precio)};
        }
        return null;
        }
       
    public void mostrarMenuProductos() {
        System.out.println("================ ROPA ================");
        System.out.printf("%-8s %-25s %-20s %-15s %-10s%n", "CODIGO", "NOMBRE", "MARCA"," GÉNERO ", "PRECIO");

        for (HashMap.Entry<Integer, String[]> entry : productosMap.entrySet()){ {
            int codigo= entry.getKey();
            if ( codigo >= 1001 && codigo <= 1024){
            String[]datos = entry.getValue();
            String nombre = datos [0];
            String marca = datos [1];
            String genero = datos[2];
            double precio = preciosMap.get(codigo);
            

           

            System.out.printf("%-8s %-25s %-20s %-15s S/ %.2f%n", codigo, nombre, marca, genero,  precio);
        }

        }
        }
    }
        public void mostrarRopaAnime(){
        System.out.println("================  ROPA ANIME  ================");
        System.out.printf("%-8s %-25s %-20s %-15s %-10s%n", "CODIGO", "NOMBRE", "MARCA"," GÉNERO ", "PRECIO");

        for (HashMap.Entry<Integer, String[]> entry : productosMap.entrySet()){ {
            int codigo= entry.getKey();
            if ( codigo >= 3001 && codigo <= 3006){
            String[]datos = entry.getValue();
            String nombre = datos [0];
            String marca = datos [1];
            String genero = datos[2];
            double precio = preciosMap.get(codigo);
            System.out.printf("%-8s %-25s %-20s %-15s %.2f%n", codigo, nombre , marca,genero,precio);

           
    }
    }
}
        }
     public void mostrarMangas(){
        System.out.println("================ MANGAS  ================ ");
        System.out.printf("%-8s %-25s %-20s %-15s %-10s%n", "CODIGO", "NOMBRE", "MARCA"," GÉNERO ", "PRECIO");

        for (HashMap.Entry<Integer, String[]> entry : productosMap.entrySet()){ {
            int codigo= entry.getKey();
            if ( codigo >= 2001 && codigo <= 2006){
            String[]datos = entry.getValue();
            String nombre = datos [0];
            String marca = datos [1];
            String genero = datos[2];
            double precio = preciosMap.get(codigo);
    
            System.out.printf("%-8s %-25s %-20s %-15s %.2f%n", codigo, nombre , marca,genero,precio);

            }
        }
        }
     }
    // Métodos para agregar productis seleccionados 
    public void agregarproductoselec(Producto producto){
        productoselec.add(producto);
    }  
    public void agregarmangasselec(MANGAS_ANIME manga){
        mangasselec.add(manga);
    }
    public void agregarropaAmineselec(ROPA_ANIME ropaAnime){
        ropaAmineselec.add(ropaAnime);
    }

    // Metodos para agregar listas compradas 
    public void agregarListaRopa(ListaProducto lista){
        listasRopaCompradas.add(lista);
    }  
    public void agregarListaMangas(ListaMANGAS_ANIME lista){
        listaMangasselec.add(lista);
    }
    public void agregarListaRopaAnime(ListaROPA_ANIME lista){
        listaRopaAnimeselec.add(lista);
   }
   public void mostrarListaMangas ( String[] lista){
   for (int i=0; i < lista.length; i++ ){
   System.out.println((i +1 )+ "." + lista[i]);
   }
   }
    public void mostrarListaRopaAnime( String[] lista){
   for (int i=0; i < lista.length; i++ ){
   System.out.println((i +1 )+ "." + lista[i]);
   }
   }
    public void mostrarListaRopa( String[] lista){
   for (int i=0; i < lista.length; i++ ){
   System.out.println((i +1 )+ "." + lista[i]);
   }
   }
    
    
    
    
    // Getters 
    public HashMap<Integer, String[]> getProductosMap(){ return productosMap;}
    public HashMap<Integer,Double> getPreciosMap() { return preciosMap; }
    public HashMap<Integer, String> getgeneroMap(){ return generoMap; }
    
    public ArrayList<Producto> getProductoselec(){ return productoselec;}
    public ArrayList<MANGAS_ANIME> getMangasselec(){ return mangasselec;}
    public ArrayList<ROPA_ANIME> getRopaAmineselec(){ return ropaAmineselec;}

    public ArrayList<ListaProducto> getListaRopaCompradas(){ return listasRopaCompradas;}
    public ArrayList<ListaMANGAS_ANIME> getListaMangasselec(){ return listaMangasselec;}
    public ArrayList<ListaROPA_ANIME> getListaRopaAnimeselec(){ return listaRopaAnimeselec;}

    public String[]getListaRopa1() { return listaRopa1; }
    public String[]getListaRopa2() { return listaRopa2; }
    public String[]getListaRopa3() { return listaRopa3; }

    public String[]getListaMangas1() { return listaMangas1; }
    public String[]getListaMangas2() { return listaMangas2; }
    public String[]getListaMangas3() { return listaMangas3; }
  
    public String[]getListaRopaAnime1() { return listaRopaAnime1; }
    public String[]getListaRopaAnime2() { return listaRopaAnime2; }
    public String[]getListaRopaAnime3() { return listaRopaAnime3; }

    
}





  


   