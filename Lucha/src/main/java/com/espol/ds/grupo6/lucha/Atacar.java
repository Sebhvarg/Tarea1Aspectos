/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.lucha;


import tipoLuchadores.Luchador;

/**
 *
 * @author sebas
 */
public class Atacar {
    public static void realizarAtaques(Luchador luchador1, Luchador luchador2) {
        double ataqueLuchador1 = luchador1.getPuntosDeAtaque();
        double ataqueLuchador2 = luchador2.getPuntosDeAtaque();
        
        luchador1.setPuntosDeVida(luchador1.getPuntosDeVida() - ataqueLuchador2);
        luchador2.setPuntosDeVida(luchador2.getPuntosDeVida() - ataqueLuchador1);
        
        System.out.println(luchador1.getNombre() + " realiza un ataque de " + ataqueLuchador1 + " puntos.");
        System.out.println(luchador2.getNombre() + " realiza un ataque de " + ataqueLuchador2 + " puntos.");
    }
    
}
