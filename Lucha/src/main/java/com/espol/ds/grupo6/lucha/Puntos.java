/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.lucha;

import java.util.List;
import tipoLuchadores.Acrobatico;
import tipoLuchadores.Luchador;

/**
 *
 * @author sebas
 */
public class Puntos {
    
     public static void mostrarPuntosDeVida(Luchador luchador1, Luchador luchador2) {
        System.out.println("Puntos de vida restantes:");
        System.out.println(luchador1.getNombre() + ": " + Math.round(luchador1.getPuntosDeVida()));
        System.out.println(luchador2.getNombre() + ": " + Math.round(luchador2.getPuntosDeVida()));
    }
     
    
}
