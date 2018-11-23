/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnolandjavaapp;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TecnolandJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean bandera = true;
      
        
        //inicializar el juego
        
        Juego j1 = new Juego("CSGO");
        
       do{
        Scanner leerprincipio = new Scanner(System.in);    
        int nmenu;  
        Menu.mostarMenu();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
        
        
        switch(nmenu){
            
            case 1:
                System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                System.out.println("1 >> Añadir jugador");
                
                System.out.println("________________________"); 
                
                String addgametag="";
                int addpuntos=0;
                
                System.out.println("Dime tu gamertag");
                                
                Scanner addleer1 = new Scanner(System.in);
                
                
                addgametag = addleer1.nextLine();
                
               
                
                Jugador newj = new Jugador(addgametag, addpuntos);
                
                j1.añadirJugador(newj);
                
                System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>"); 
                
                
                break;
            
            case 2:
                System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                System.out.println("2 >> Borrar jugador");
                
                System.out.println("________________________"); 
                
                System.out.println("Dime el gamtag que quieres borrar");
                Scanner leerborrar = new Scanner(System.in);
                String personaborrar;
                personaborrar= leerborrar.nextLine();
                j1.borrarJugador(personaborrar);
                
                System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>"); 
                
                
                break;
            
            case 3:
                
                
                break;
            
            case 4:
                
                
                break;
                
            case 5:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                System.out.println("Saliendo...");  
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                bandera=false;
                
                break;
            
            
        }
           
       }while(bandera!=false);
    }
    
}
