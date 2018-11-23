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
      
        
        
        
       do{
        Scanner leerprincipio = new Scanner(System.in);    
        int nmenu;  
        Menu.mostarMenu();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
        
        
        switch(nmenu){
            
            case 1:
                
                
                break;
            
            case 2:
                
                
                break;
            
            case 3:
                
                
                break;
            
            case 4:
                
                
                break;
                
            case 5:
                
                break;
            
            
        }
           
       }while(bandera!=false);
    }
    
}
