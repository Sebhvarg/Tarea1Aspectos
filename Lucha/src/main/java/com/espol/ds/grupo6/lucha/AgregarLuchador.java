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
public class AgregarLuchador {
    
    static TorneoKingOfTheRing torneo = TorneoKingOfTheRing.getInstance();
    
    public static void agregarLuchador(Luchador L){
        torneo.agregarLuchador(L);
    }
    
}
