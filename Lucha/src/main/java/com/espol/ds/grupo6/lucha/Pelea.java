/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.lucha;

import static com.espol.ds.grupo6.lucha.TorneoKingOfTheRing.luchadores;
import java.util.List;
import java.util.Random;
import tipoLuchadores.Luchador;

/**
 *
 * @author sebas
 */
public class Pelea {
    static TorneoKingOfTheRing torneo = new TorneoKingOfTheRing(luchadores);
    private static Luchador luchador1;
    private static Luchador luchador2;
    
   public static void Pelear(){
       seleccionar(torneo);
       luchar();
       
   }
   public static void seleccionar(TorneoKingOfTheRing torneo){
       List<Luchador> luchadores = torneo.getLuchadores();
        Random random = new Random();
        int indiceLuchador1 = random.nextInt(luchadores.size());
        int indiceLuchador2;
        do {
            indiceLuchador2 = random.nextInt(luchadores.size());
        } while (indiceLuchador2 == indiceLuchador1);
        luchador1 = luchadores.get(indiceLuchador1);
        luchador2 = luchadores.get(indiceLuchador2);
        
    }
    public static void determinarGanador() {
        if (luchador1.getPuntosDeVida() <= 0) {
            System.out.println("¡El ganador es: " + luchador2.getNombre() + "!");
        } else {
            System.out.println("¡El ganador es: " + luchador1.getNombre() + "!");
        }
    }
     public static void luchar(){
        System.out.println("A continuacion");
        System.out.println(luchador1.getNombre() + " vs " + luchador2.getNombre());
        
        while (luchador1.getPuntosDeVida() > 0 && luchador2.getPuntosDeVida() > 0) {
            Atacar.realizarAtaques(luchador1, luchador2);
            Puntos.mostrarPuntosDeVida(luchador1, luchador2);
        }
        
        determinarGanador();
    }
        
   
}
