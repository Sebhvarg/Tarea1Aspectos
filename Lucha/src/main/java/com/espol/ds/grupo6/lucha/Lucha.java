/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.ds.grupo6.lucha;

import java.util.ArrayList;
import tipoLuchadores.Luchador;
import tipoLuchadores.PesoPesado;



/**
 *
 * @author sebas
 */
public class Lucha {   
    
    

    public static void main(String[] args) {
        // Se agrega otro luchador
      PesoPesado luchadorA = new PesoPesado("Randy Orton", 75.09, 120.70);
      AgregarLuchador.agregarLuchador(luchadorA);
      TorneoKingOfTheRing.cargarLista();
      Pelea.Pelear();
    }
   
}
