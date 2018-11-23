/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnolandjavaapp;

/**
 *
 * @author alumno
 */
public class Juego {
    
    private String nombrejuego;
    private Jugador[] vJugador;

    //crear juego
    
    public Juego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
        vJugador = new Jugador[10];
    }
    
    //añadir jugadores al vector
    
    public void añadirJugador(Jugador a){
        
        boolean bandera=false;
        
        for (int i = 0; i < vJugador.length; i++) {
                 if (vJugador[i]!=null) {
            if (vJugador[i].getGamertag().equalsIgnoreCase(a.getGamertag())) {
                bandera=true;
                 
            }
             }
 
        }
        
        if (bandera==false) {
          for (int i = 0; i < vJugador.length; i++) {
            if (vJugador[i]==null) {
               
               vJugador[i]=a;
               break;
                
            }
            
        }  
        }
        
        
        
    }
    
    //listar jugadores
    
    public String listaJugadores(){
        
      String datos ="";
     
        
        int n=1;
         
            for (int i = 0; i < vJugador.length; i++) {
              if (vJugador[i]!=null) {    
                datos +="<< " + n + " >> " + vJugador[i].getGamertag() + " " + vJugador[i].getPuntos() + "\n";
               
             n++;
                    }
              
                 
            }
            
           
          return datos;
          
    }
    
    
    
    
    
    //borrar jugador
    
       public void borrarJugador(String nombreborrar){
           for (int i = 0; i < vJugador.length; i++) {
                if (nombreborrar==vJugador[i].getGamertag()) {
                vJugador[i]=null;     
            }
               
           }
          
        
    }
    
    //añadir puntos con el vector
       
      public void añdirPuntosVector(String nombrepuntos, int nuevospuntos){

          for (int i = 0; i < vJugador.length; i++) {
               if (vJugador[i].getGamertag().endsWith(nombrepuntos)) {

                    vJugador[i].añdirPuntos(nuevospuntos);
                    break;
                }
          }
              
       
    }

    public String getNombrejuego() {
        return nombrejuego;
    }
       
       
    
}
