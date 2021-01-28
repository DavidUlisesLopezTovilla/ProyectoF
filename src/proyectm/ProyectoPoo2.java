/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectm;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author David Ulises
 */
public class ProyectoPoo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> canasta = new ArrayList<String>();
        
        Laptops2 producto1 = new Laptops2("ideapad",1234,12000,"Lenovo","Escolar",8);
        Laptops2 producto2 = new Laptops2("Omen",3346,15000,"Hp","Gaming",16);
        
        Computadoras2 producto3 = new Computadoras2("Master Race",6666,18000,"GTX 1660","Ryzen 5",1000);
        Computadoras2 producto4 = new Computadoras2("Nova3",3000,10000,"Radeon 11","AMD 9",500);
        
        Empleado2 empleado1 = new Empleado2("Carlos",1212,"perrito", 3);
        Empleado2 empleado2 = new Empleado2("Brenda",1245,"tqm56", 2);
        Empleado2 empleado3 = new Empleado2("Sara",3565,"2020", 1);
        Empleado2 empleado4 = new Empleado2("Yone",4001,"aseki", 1);
        
        ArrayList codibarras = new ArrayList();
        codibarras.add(producto1.getCodbarra());
        codibarras.add(producto2.getCodbarra());
        codibarras.add(producto3.getCodbarra());
        codibarras.add(producto4.getCodbarra());
        
        ArrayList <String> nombrep = new ArrayList();
        nombrep.add(producto1.getNombre());
        nombrep.add(producto2.getNombre());
        nombrep.add(producto3.getNombre());
        nombrep.add(producto4.getNombre());
        
        ArrayList <Float> preciop = new ArrayList();
        preciop.add(producto1.getPrecio());
        preciop.add(producto2.getPrecio());
        preciop.add(producto3.getPrecio());
        preciop.add(producto4.getPrecio());
        
        ArrayList <String> tString = new ArrayList();
        tString.add(producto1.toString());
        tString.add(producto2.toString());
        tString.add(producto3.toString());
        tString.add(producto4.toString());
        
        ArrayList <String> nombresE = new ArrayList();
        nombresE.add(empleado1.getNombre());
        nombresE.add(empleado2.getNombre());
        nombresE.add(empleado3.getNombre());
        nombresE.add(empleado4.getNombre());
        
        ArrayList numsE  = new ArrayList();
        numsE.add(empleado1.getNEmpleado());
        numsE.add(empleado2.getNEmpleado());
        numsE.add(empleado3.getNEmpleado());
        numsE.add(empleado4.getNEmpleado());
        
        ArrayList <String> contrasE  = new ArrayList();
        contrasE.add(empleado1.getContraseña());
        contrasE.add(empleado2.getContraseña());
        contrasE.add(empleado3.getContraseña());
        contrasE.add(empleado4.getContraseña());
        
        ArrayList nivelE = new ArrayList();
        nivelE.add(empleado1.getNivel());
        nivelE.add(empleado2.getNivel());
        nivelE.add(empleado3.getNivel());
        nivelE.add(empleado4.getNivel());
        
        ArrayList <String> tStringE = new ArrayList();
        tStringE.add(empleado1.toString());
        tStringE.add(empleado2.toString());
        tStringE.add(empleado3.toString());
        tStringE.add(empleado4.toString());
        
        float totalprecio = 0;
        int j=3;
        int k=3;
        int i=0;
     
        boolean salir = false;
        while(!salir){
        System.out.println("          Bienvenido a la Tienda Electronix" );
        System.out.println("\n");
        System.out.println("          HORA:  " +  LocalTime.now()); 
        System.out.println("\n");
        System.out.println("         FECHA ACTUAL: " + LocalDate.now());
        System.out.println("\n");
        System.out.println("                      Menú");
        System.out.println("Puedes ingresar como: ");
        System.out.println("1.Cliente");
        System.out.println("2.Empleado");
        System.out.println("3.Salir");
        
        System.out.println("Que tipo de usuario eres: ");
        int opc = teclado.nextInt();
        
                switch(opc){
                case 1: 
                    boolean salir1 = false;
                    while(!salir1){
                    System.out.println("\n\n");
                    System.out.println("        Bienvenido Cliente");
                    System.out.println("\n");
                    System.out.println("1.Buscar articulo por codigo de barras");
                    System.out.println("2.Buscar articulo por nombre");
                    System.out.println("3.Agregar articulo");
                    System.out.println("4.Quitar articulo");
                    System.out.println("5.Realizar Pago");
                    System.out.println("6.Salir");
                    System.out.println("\n");
                    System.out.println("¿Que desea hacer:  ");
                    int c = teclado.nextInt();
                    
                    switch(c){
                        case 1:
                            
                            try{
                            System.out.println("Ingresa el codigo de barras del articulo que deseas consultar: ");
                            int buscar = teclado.nextInt();
                            
                            if(codibarras.contains(buscar)){
                                System.out.println(tString.get(codibarras.indexOf(buscar)));                             
                            }else{
                                System.out.println("No se encontro el producto que busca intente otra vez");}
                            }catch(ArrayIndexOutOfBoundsException ere){}
                        
                        case 2: 
                            try{
                            System.out.println("Ingrese el nombre del producto que desea consultar");
                            String buscar2 = teclado.next();
                            
                            if(nombrep.contains(buscar2)){
                                System.out.println(tString.get(nombrep.indexOf(buscar2)));
                            }else{
                                System.out.println("No se encontro el producto que busca intente otra vez");
                            }
                            }catch(ArrayIndexOutOfBoundsException eg){}
                        break;
                        
                        case 3: 
                            
                            try{

                            System.out.println("Ingrese el codigo de barras del articulo que desea comprar ");
                            int comprac = teclado.nextInt();
                            
                            if(codibarras.contains(comprac)){
                                canasta.add(tString.get(codibarras.indexOf(comprac)));
                                
                                System.out.println("Tu canasta contiene " +canasta.size()+ " articulos");
                                totalprecio += preciop.get(codibarras.indexOf(comprac));
                            }else{
                                System.out.println("El codigo de barras es incorrecto, reviselo");
                            }
                            
                            System.out.println("Tu canasta contiene lo siguiente: ");
                            for (String car: canasta){
                                car = canasta.indexOf(car) + ".-" + car+1;
                                System.out.println(car);
                            }
                            
                            }catch(ArrayIndexOutOfBoundsException g){}
                            
                        break;
                            
                        case 4:
                            
                            try{
                                
                            System.out.println("Ingresa por favor el numero del articulo a eliminar: ");
                            int quit = teclado.nextInt();           
                            canasta.remove(quit);                           
                            System.out.println("Ingresa ahora el codigo de barras del articulo a elminar");
                            int quit2 = teclado.nextInt();
                            
                            if(codibarras.contains(quit2)){
                                System.out.println("Tu canasta ahora contiene: " +canasta.size()+ " articulos");
                                totalprecio -= preciop.get(codibarras.indexOf(quit2));
                            }else{
                                System.out.println("El codigo de barras es incorrecto, reviselo");
                            }
                            
                            System.out.println("Tu canasta contiene los siguientes articulos: ");
                            for(String d : canasta){
                                d = canasta.indexOf(d) + "" + d;
                                System.out.println(d);
                            }
                           
                            }catch(IndexOutOfBoundsException ex){        
                            System.out.println("No hay articulos en tu canasta");
                            } 
                            
                        break;
                        
                        case 5:
                            
                            Ticket2 nuevoT = new Ticket2();
                            nuevoT.creaTicket(canasta, totalprecio);
                
                            System.out.println("!Gracias por tu compra¡ Buen dia regrese pronto");
                            
                        break;
                        
                        case 6: 
                            salir1 = true;
                        break;
                        
                        default:
                            System.out.println("Solo se permiten esas opciones ");
                    }
                    }
                    break;
                case 2:
                    boolean salir2 = false;
                    while(!salir2){
                    System.out.println("\n\n");
                    System.out.println("              Bienvenido Empleado");
                    System.out.println("\n\n");
                    System.out.println("                     Menú");
                    System.out.println("1.Vendedor");
                    System.out.println("2.Gerente");
                    System.out.println("3.Empacador o Acomodador");
                    System.out.println("4.Salir");
                    
                    System.out.println("Que tipo de usuario eres: ");
                    int opc2 = teclado.nextInt();
                    
                    switch(opc2){
                        case 1:
                            
                            System.out.println("Los niveles de empleados son: ");
                            System.out.println("\n");
                            System.out.println("3.-Gerente");
                            System.out.println("2.-Vendedor");
                            System.out.println("1.-Acomodador");
                            
                            System.out.println("Ingresa tu numero de empleado");
                            int ep = teclado.nextInt();
                            
                            System.out.println("Ingresa tu contraseña");
                            String b = teclado.next();
                            
                            if((numsE.contains(ep)) && (contrasE.contains(b)) && (numsE.indexOf(ep)) == contrasE.indexOf(b)){ 
                                
                            int g1 =(int) nivelE.get(numsE.indexOf(ep));
                            
                            if(g1 == 2){
                            boolean salir3 = false;
                            while(!salir3){
                            System.out.println("\n\n");
                            System.out.println("                 Vendedor");
                            System.out.println("\n\n");
                            System.out.println("                   Menú");
                            System.out.println("1.Agregar articulo para vender");
                            System.out.println("2.Eliminar articulo de la vendeta");
                            System.out.println("3.Generar Ticket");
                            System.out.println("4.Añadir articulo al inventario");
                            System.out.println("5.Eliminar articulo del inventario");
                            System.out.println("6.Salir");
                            
                            System.out.println("Que deseas hacer: ");
                            int opc3 = teclado.nextInt();
                            
                            switch(opc3){
                                case 1: 
                                    
                                    try{
                                    System.out.println("Ingresa el codigo de barras del articulo que vas a vender: ");
                                    int vend = teclado.nextInt();
                                      
                                    if(codibarras.contains(vend)){
                                            canasta.add(tString.get(codibarras.indexOf(vend)));
                                
                                            System.out.println("Tu canasta contiene " +canasta.size()+ " articulos");
                                            totalprecio += preciop.get(codibarras.indexOf(vend));
                                    }else{
                                    System.out.println("El codigo de barras es incorrecto, reviselo");
                                    }
                            
                                    System.out.println("Tu canasta contiene lo siguiente: ");
                                    for (String car: canasta){
                                    car = canasta.indexOf(car) + ".-" + car+1;
                                    System.out.println(car);
                                    }
                            
                                    }catch(ArrayIndexOutOfBoundsException g){}
                                        
                                break;
                                
                                case 2: 
                                    
                                     try{
                                     System.out.println("Ingresa por favor el numero del articulo a eliminar: ");
                                     int quit = teclado.nextInt();           
                                     canasta.remove(quit);                           
                                     System.out.println("Ingresa ahora el codigo de barras del articulo a elminar");
                                     int quit2 = teclado.nextInt();
                            
                                    if(codibarras.contains(quit2)){
                                        System.out.println("Tu canasta ahora contiene: " +canasta.size()+ " articulos");
                                        totalprecio -= preciop.get(codibarras.indexOf(quit2));
                                    }else{
                                    System.out.println("El codigo de barras es incorrecto, reviselo");
                                    }
                            
                                    System.out.println("Tu canasta contiene los siguientes articulos: ");
                                    for(String d : canasta){
                                        d = canasta.indexOf(d) + "" + d;
                                        System.out.println(d);
                                    }
                           
                                    }catch(IndexOutOfBoundsException ex){        
                                    System.out.println("No hay articulos en tu canasta");
                                    } 
                                     
                                break;
                                
                                case 3:
                                    
                                    System.out.println("Se esta efectuando el cobro al cliente");
                                    Ticket2 nTicket = new Ticket2();
                                    nTicket.creaTicket(canasta, totalprecio);
                                    System.out.println("Gracias por sus servicios, puede presentar el ticket a la caja");
                                    
                                break;
                                
                                case 4:
                                    System.out.println("Ingrese el nombre del producto que añadira");
                                    String nnom = teclado.next();
                                
                                    if(nombrep.contains(nnom)){
                                        System.out.println("Ese nombre ya se encuentra en existencia");
                                    }else{
                                        
                                        System.out.println("Ingrese el codigo de barras del producto nuevo");
                                        int ncod = teclado.nextInt();
                                        if(codibarras.contains(ncod)){
                                            System.out.println("Este codigo ya se encuentra en uso");
                                        }else{
                                            
                                            System.out.println("Ingrese el precio que tendra este producto");
                                            float nprecio = teclado.nextFloat();
                                            
                                            switch(k){
                                                case 3:
                                                    
                                                    Productos2 producto03 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto03.getCodbarra());
                                                    nombrep.add(producto03.getNombre());
                                                    preciop.add(producto03.getPrecio());
                                                    tString.add(producto03.toString());
                                                    k++;
                                                break;
                                                
                                                case 4:
                                                    
                                                    Productos2 producto04 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto04.getCodbarra());
                                                    nombrep.add(producto04.getNombre());
                                                    preciop.add(producto04.getPrecio());
                                                    tString.add(producto04.toString());
                                                    k++;
                                                break;
                                                
                                                case 5:
                                                    
                                                    Productos2 producto5 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto5.getCodbarra());
                                                    nombrep.add(producto5.getNombre());
                                                    preciop.add(producto5.getPrecio());
                                                    tString.add(producto5.toString());
                                                    k++;
                                                break;
                                                
                                                case 6:
                                                    
                                                    Productos2 producto6 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto6.getCodbarra());
                                                    nombrep.add(producto6.getNombre());
                                                    preciop.add(producto6.getPrecio());
                                                    tString.add(producto6.toString());
                                                    k++;
                                                break;
                                                
                                                default:
                                                break;
                                            }
                                            System.out.println("El producto se creo correctamente");
                                            System.out.println(k);
                                            i++;
                                        }
                                    }
                                break;
                                
                                case 5:
                                    System.out.println("Para eliminar un articulo del inventario ingresa su codigo de barras");
                                    float eli = teclado.nextInt();
                                    if(codibarras.contains(eli)){
                                        System.out.println("Se retiro el articulo: "+ tString.get(codibarras.indexOf(eli)));
                                        int pos1 = codibarras.indexOf(eli);
                                        nombrep.remove(pos1);
                                        preciop.remove(pos1);
                                        tString.remove(pos1);
                                        codibarras.remove(pos1);
                                        System.out.println("El producto se elimino correctamente");
                                   
                                    }else{
                                        System.out.println("No se encontro el codigo de barras que ingreso");
                                    }
                                break;
                                
                                case 6:
                                    salir3 = true;
                                break;
                                
                                default:
                                       System.out.println("Ingresa una opcion valida");
                                        }
                                    }
                            }else{
                                    System.out.println("No estas en el nivel correcto de empleado");
                            }
                        }else{
                                System.out.println("Los datos sin incorrectos");
                            }
                            
                        break;
                        
                        case 2:
                            
                            System.out.println("Los niveles de empleados son: ");
                            System.out.println("\n");
                            System.out.println("3.-Gerente");
                            System.out.println("2.-Vendedor");
                            System.out.println("1.-Acomodador");
                            
                            System.out.println("Ingresa tu numero de empleado");
                            int ep2 = teclado.nextInt();
                            
                            System.out.println("Ingresa tu contraseña");
                            String b2 = teclado.next();
                            
                            if((numsE.contains(ep2)) && (contrasE.contains(b2)) && (numsE.indexOf(ep2)) == contrasE.indexOf(b2)){ 
                                
                            int g22 =(int) nivelE.get(numsE.indexOf(ep2));
                            
                            if(g22 == 3){
                                
                            boolean salir4 = false;
                            while(!salir4){
                            System.out.println("\n\n");
                            System.out.println("                      Gerente");
                            System.out.println("\n\n");
                            System.out.println("                       Menú");
                            System.out.println("1.Administrar inventario");
                            System.out.println("2.Agregar articulo para la venta");
                            System.out.println("3.Eliminar articulo de la venta");
                            System.out.println("4.Generar Ticket");
                            System.out.println("5.Eliminar articulo del inventario");
                            System.out.println("6.Añadir articulo al inventario");
                            System.out.println("7.Agregar empleado");
                            System.out.println("8.Eliminar empleado");
                            System.out.println("9.Salir");
                            
                            System.out.println("Que deseas hacer: ");
                            int op= teclado.nextInt();
                            
                            switch(op){
                                case 1: 
                                    
                                    System.out.println("                Zona de inventario");
                                    boolean salirg = false;
                                    
                                    while(!salirg){
                                    
                                    System.out.println("1.Buscar articulo por codigo de barras");
                                    System.out.println("2.Buscar articulo por nombre");
                                    System.out.println("3.Salir");
                                    System.out.println("Que deseas realizar: ");
                                    int opcg = teclado.nextInt();
                                    
                                    switch(opcg){
                                    
                                        case 1:
                                            
                                            try{
                                            System.out.println("Ingresa el codigo de barras del articulo que deseas consultar: ");
                                            int buscar = teclado.nextInt();
                            
                                            if(codibarras.contains(buscar)){
                                                System.out.println(tString.get(codibarras.indexOf(buscar)));                             
                                            }else{
                                            System.out.println("No se encontro el producto que busca intente otra vez");}
                                            }catch(ArrayIndexOutOfBoundsException ere){}
                                        break;
                                        
                                        case 2:
                                            
                                            try{
                                            System.out.println("Ingrese el nombre del producto que desea consultar");
                                            String buscar2 = teclado.next();
                            
                                            if(nombrep.contains(buscar2)){
                                                System.out.println(tString.get(nombrep.indexOf(buscar2)));
                                            }else{
                                            System.out.println("No se encontro el producto que busca intente otra vez");
                                            }
                                            }catch(ArrayIndexOutOfBoundsException eg){}
                                        break;
                                        
                                        case 3:
                                            salirg = true;
                                        break;
                                        
                                        default:
                                            System.out.println("Elige una opcion correcta");
                                    }}
                                    
                                break;
                                
                                case 2:
                                    
                                    try{
                                    System.out.println("Ingresa el codigo de barras del articulo que vas a vender: ");
                                    int vend = teclado.nextInt();
                                      
                                    if(codibarras.contains(vend)){
                                            canasta.add(tString.get(codibarras.indexOf(vend)));
                                
                                            System.out.println("Tu canasta contiene " +canasta.size()+ " articulos");
                                            totalprecio += preciop.get(codibarras.indexOf(vend));
                                    }else{
                                    System.out.println("El codigo de barras es incorrecto, reviselo");
                                    }
                            
                                    System.out.println("Tu canasta contiene lo siguiente: ");
                                    for (String car: canasta){
                                    car = canasta.indexOf(car) + ".-" + car+1;
                                    System.out.println(car);
                                    }
                            
                                    }catch(ArrayIndexOutOfBoundsException g){}
                                break;
                                
                                case 3:
                                    
                                    try{
                                     System.out.println("Ingresa por favor el numero del articulo a eliminar: ");
                                     int quit = teclado.nextInt();           
                                     canasta.remove(quit);                           
                                     System.out.println("Ingresa ahora el codigo de barras del articulo a elminar");
                                     int quit2 = teclado.nextInt();
                            
                                    if(codibarras.contains(quit2)){
                                        System.out.println("Tu canasta ahora contiene: " +canasta.size()+ " articulos");
                                        totalprecio -= preciop.get(codibarras.indexOf(quit2));
                                    }else{
                                    System.out.println("El codigo de barras es incorrecto, reviselo");
                                    }
                            
                                    System.out.println("Tu canasta contiene los siguientes articulos: ");
                                    for(String d : canasta){
                                        d = canasta.indexOf(d) + "" + d;
                                        System.out.println(d);
                                    }
                           
                                    }catch(IndexOutOfBoundsException ex){        
                                    System.out.println("No hay articulos en tu canasta");
                                    } 
                                break;
                                    
                                case 4:
                                    
                                    System.out.println("Se esta efectuando el cobro al cliente");
                                    Ticket2 nTicket = new Ticket2();
                                    nTicket.creaTicket(canasta, totalprecio);
                                    System.out.println("Gracias por sus servicios, puede presentar el ticket a la caja");
                                break;
                                
                                case 5:
                                    
                                    System.out.println("Para eliminar un articulo del inventario ingresa su codigo de barras");
                                    float eli = teclado.nextInt();
                                    if(codibarras.contains(eli)){
                                        System.out.println("Se retiro el articulo: "+ tString.get(codibarras.indexOf(eli)));
                                        int pos1 = codibarras.indexOf(eli);
                                        nombrep.remove(pos1);
                                        preciop.remove(pos1);
                                        tString.remove(pos1);
                                        codibarras.remove(pos1);
                                        System.out.println("El producto se elimino correctamente");
                                   
                                    }else{
                                        System.out.println("No se encontro el codigo de barras que ingreso");
                                    }
                                    
                                break;
                                
                                case 6:
                                    
                                    System.out.println("Ingrese el nombre del producto que añadira");
                                    String nnom = teclado.next();
                                
                                    if(nombrep.contains(nnom)){
                                        System.out.println("Ese nombre ya se encuentra en existencia");
                                    }else{
                                        
                                        System.out.println("Ingrese el codigo de barras del producto nuevo");
                                        int ncod = teclado.nextInt();
                                        if(codibarras.contains(ncod)){
                                            System.out.println("Este codigo ya se encuentra en uso");
                                        }else{
                                            
                                            System.out.println("Ingrese el precio que tendra este producto");
                                            float nprecio = teclado.nextFloat();
                                            
                                            switch(k){
                                                case 3:
                                                    
                                                    Productos2 producto03 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto03.getCodbarra());
                                                    nombrep.add(producto03.getNombre());
                                                    preciop.add(producto03.getPrecio());
                                                    tString.add(producto03.toString());
                                                    k++;
                                                break;
                                                
                                                case 4:
                                                    
                                                    Productos2 producto04 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto04.getCodbarra());
                                                    nombrep.add(producto04.getNombre());
                                                    preciop.add(producto04.getPrecio());
                                                    tString.add(producto04.toString());
                                                    k++;
                                                break;
                                                
                                                case 5:
                                                    
                                                    Productos2 producto5 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto5.getCodbarra());
                                                    nombrep.add(producto5.getNombre());
                                                    preciop.add(producto5.getPrecio());
                                                    tString.add(producto5.toString());
                                                    k++;
                                                break;
                                                
                                                case 6:
                                                    
                                                    Productos2 producto6 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto6.getCodbarra());
                                                    nombrep.add(producto6.getNombre());
                                                    preciop.add(producto6.getPrecio());
                                                    tString.add(producto6.toString());
                                                    k++;
                                                break;
                                                
                                                default:
                                                break;
                                            }
                                            System.out.println("El producto se añadio correctamente");
                                            System.out.println(k);
                                            i++;
                                        }
                                    }
                                break;
                                
                                case 7:
                                    
                                    System.out.println("Bienvenido al apartado para agregar un usuario");
                                    System.out.println("Ingresa los datos correspondientes a continuacion");
                                    
                                    System.out.println("Escriba el nombre del nuevo empleado");
                                    String nnom1 = teclado.next();
                                    System.out.println("Ingrese el numero de empleado que tendra");
                                    int nuevonum = teclado.nextInt();
                                    
                                    if(numsE.contains(nuevonum)){
                                        System.out.println("Ese numero ya se encuentra en uso");
                                    }else{ 
                                        System.out.println("Ingrese la contraseña del nuevo usuario");
                                        String nuecontra = teclado.next();
                                        if(nuecontra.length() <4){
                                            System.out.println("La contraseña debe ser igual o mayor a 4 caracteres"); 
                                        }else{
                                            System.out.println("Ingrese el grado del nuevo empleado");
                                            int nueniv = teclado.nextInt();
                                            if(nueniv >= 0 && nueniv <=3){
                                                switch(j){
                                                    case 3:
                                                        Empleado2 emplead3 = new Empleado2(nnom1,nuevonum,nuecontra,nueniv);
                                                        nombresE.add(emplead3.getNombre());
                                                        contrasE.add(emplead3.getContraseña());
                                                        numsE.add(emplead3.getNEmpleado());
                                                        nivelE.add(emplead3.getNivel());
                                                        tStringE.add(emplead3.toString());
                                                        j++;
                                                    break;
                                                    
                                                    case 4:
                                                        Empleado2 emplead4 = new Empleado2(nnom1,nuevonum,nuecontra,nueniv);
                                                        nombresE.add(emplead4.getNombre());
                                                        contrasE.add(emplead4.getContraseña());
                                                        numsE.add(emplead4.getNEmpleado());
                                                        nivelE.add(emplead4.getNivel());
                                                        tStringE.add(emplead4.toString());
                                                        j++;
                                                    break;
                                                    
                                                    case 5:
                                                        Empleado2 emplead5 = new Empleado2(nnom1,nuevonum,nuecontra,nueniv);
                                                        nombresE.add(emplead5.getNombre());
                                                        contrasE.add(emplead5.getContraseña());
                                                        numsE.add(emplead5.getNEmpleado());
                                                        nivelE.add(emplead5.getNivel());
                                                        tStringE.add(emplead5.toString());
                                                        j++;
                                                    break;
                                                }
                                                System.out.println("Se registro al nuevo usuario");
                                                System.out.println(j);
                                                i++;
                                            }else{
                                                System.out.println("Grando incorrecto solo hay 1, 2 y 3");
                                            }
                                        }
                                    }
                                break;
                                
                                case 8:
                                    
                                    System.out.println("Para eliminar un trabajador ingrese su numero de empleado");
                                    int del = teclado.nextInt();
                                    if(numsE.contains(del)){
                                        int pos = numsE.indexOf(del);
                                        nombresE.remove(del);
                                        numsE.remove(del);
                                        contrasE.remove(del);
                                        nivelE.remove(del);
                                        tStringE.remove(del);
                                        System.out.println("El empleado se ha eliminado correctamente");
                                    }else{
                                        System.out.println("No se encuentra al trbajador que indico");
                                        }
                                break;
                                
                                case 9:
                                    salir4 = true;
                                break;
                                    
                                default:
                                    System.out.println("Ingresa una opcion valida");   
                               }
                            }
                            }
                            }
                        break;
                        
                        case 3:
                            
                            System.out.println("Los niveles de empleados son: ");
                            System.out.println("\n");
                            System.out.println("3.-Gerente");
                            System.out.println("2.-Vendedor");
                            System.out.println("1.-Acomodado");
                            
                            System.out.println("Ingresa tu numero de empleado");
                            int epp = teclado.nextInt();
                            
                            System.out.println("Ingresa tu contraseña");
                            String bl = teclado.next();
                            
                            if((numsE.contains(epp)) && (contrasE.contains(bl)) && (numsE.indexOf(epp)) == contrasE.indexOf(bl)){ 
                                
                            int g12 =(int) nivelE.get(numsE.indexOf(epp));
                            
                            if(g12 == 1){
                            boolean salir7 = false;
                            
                            while(!salir7){
                            System.out.println("\n\n");
                            System.out.println("                 Acomodador");
                            System.out.println("\n\n");
                            System.out.println("                   Menú");
                            System.out.println("1.Añadir articulo al inventario");
                            System.out.println("2.Eliminar articulo del inventario");
                            System.out.println("3.Salir");
                            System.out.println("Que deseas realizar");
                            int ac = teclado.nextInt();
                            
                            switch(ac){
                                case 1:
                                    System.out.println("Ingrese el nombre del producto que añadira");
                                    String nnom = teclado.next();
                                
                                    if(nombrep.contains(nnom)){
                                        System.out.println("Ese nombre ya se encuentra en existencia");
                                    }else{
                                        
                                        System.out.println("Ingrese el codigo de barras del producto nuevo");
                                        int ncod = teclado.nextInt();
                                        if(codibarras.contains(ncod)){
                                            System.out.println("Este codigo ya se encuentra en uso");
                                        }else{
                                            
                                            System.out.println("Ingrese el precio que tendra este producto");
                                            float nprecio = teclado.nextFloat();
                                            
                                            switch(k){
                                                case 3:
                                                    
                                                    Productos2 producto03 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto03.getCodbarra());
                                                    nombrep.add(producto03.getNombre());
                                                    preciop.add(producto03.getPrecio());
                                                    tString.add(producto03.toString());
                                                    k++;
                                                break;
                                                
                                                case 4:
                                                    
                                                    Productos2 producto04 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto04.getCodbarra());
                                                    nombrep.add(producto04.getNombre());
                                                    preciop.add(producto04.getPrecio());
                                                    tString.add(producto04.toString());
                                                    k++;
                                                break;
                                                
                                                case 5:
                                                    
                                                    Productos2 producto5 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto5.getCodbarra());
                                                    nombrep.add(producto5.getNombre());
                                                    preciop.add(producto5.getPrecio());
                                                    tString.add(producto5.toString());
                                                    k++;
                                                break;
                                                
                                                case 6:
                                                    
                                                    Productos2 producto6 = new Productos2(nnom,ncod,nprecio);
                                                    codibarras.add(producto6.getCodbarra());
                                                    nombrep.add(producto6.getNombre());
                                                    preciop.add(producto6.getPrecio());
                                                    tString.add(producto6.toString());
                                                    k++;
                                                break;
                                                
                                                default:
                                                break;
                                            }
                                            System.out.println("El producto se añadio correctamente");
                                            System.out.println(k);
                                            i++;
                                        }
                                    }
                                break;
                                
                                case 2:
                                    System.out.println("Para eliminar un articulo del inventario ingresa su codigo de barras");
                                    float eli = teclado.nextInt();
                                    if(codibarras.contains(eli)){
                                        System.out.println("Se retiro el articulo: "+ tString.get(codibarras.indexOf(eli)));
                                        int pos1 = codibarras.indexOf(eli);
                                        nombrep.remove(pos1);
                                        preciop.remove(pos1);
                                        tString.remove(pos1);
                                        codibarras.remove(pos1);
                                        System.out.println("El producto se elimino correctamente");
                                   
                                    }else{
                                        System.out.println("No se encontro el codigo de barras que ingreso");
                                    }
                                break;
                                
                                case 3:
                                    salir7 = true;
                                break;
                                
                                default:
                                    System.out.println("Ingresa una opcion valida");
                                }
                            }
                            }else{
                                    System.out.println("No estas en el nivel correcto de empleado");
                            }
                        }else{
                                System.out.println("Los datos sin incorrectos");
                       }
                            
                       break;
                        
                        case 4:
                            salir2 = true;
                        break;
                           
                        default:
                            System.out.println("Ingresa una opcion valida");
                    }
                    }
                break;
                            
                case 3:        
                   salir = true;
                break;
                
                default:
                    System.out.println("¡Error! Elige una opcion correcta por favor");
		}
            }
        }
    private static int indexOf(float busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }                
       



        
 
