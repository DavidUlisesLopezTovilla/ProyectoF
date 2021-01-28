/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectm;

import java.util.ArrayList;

/**
 *
 * @author David Ulises
 */
public class Ticket2 {
    String producto;
    double precio;
    double total;
    
    
   

    public float creaTicket(ArrayList<String> canasta, float totalprecio) {
        System.out.println("Acontinuacion se mostrara tu ticket: ");
        for(String can : canasta){
            can = canasta.indexOf(can) + "" + can+1;
            System.out.println(can);
        }
        
        if(canasta.size() == 0){
            totalprecio = 0;
            System.out.println("El precio total de tu compra es: " + totalprecio);
        }else{
        System.out.println("El precio total de tu compra es: " + totalprecio);
        }
        
        return totalprecio;
    }
}
