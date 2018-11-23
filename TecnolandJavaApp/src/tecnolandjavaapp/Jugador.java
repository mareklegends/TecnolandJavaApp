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
public class Jugador {
    
    private String gamertag;
    private int puntos;

    public Jugador(String gamertag, int puntos) {
        this.gamertag = gamertag;
        this.puntos = puntos;
    }
    
    

    public String getGamertag() {
        return gamertag;
    }

    public int getPuntos() {
        return puntos;
    }
    
    public void añdirPuntos(int nuevospuntos){
       
            puntos = puntos + nuevospuntos;            
      
    }

    
    
    
}
