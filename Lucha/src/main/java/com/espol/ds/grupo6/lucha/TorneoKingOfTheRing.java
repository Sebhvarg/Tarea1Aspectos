/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.lucha;
import java.util.ArrayList;
import java.util.List;
import tipoLuchadores.Acrobatico;
import tipoLuchadores.Luchador;
import tipoLuchadores.PesoPesado;
import tipoLuchadores.Tecnico;
import adapter.TecnicoAdapter;
/**
 *
 * @author sebas
 */
public class TorneoKingOfTheRing {
    public static List<Luchador> luchadores = new ArrayList<>();
        
    static TorneoKingOfTheRing instance = null;
    
    private TorneoKingOfTheRing(List<Luchador> luchadores) {
        this.luchadores = luchadores;
    }

    public  void agregarLuchador(Luchador luchador) {
        luchadores.add(luchador);
    }

    public static List<Luchador> getLuchadores() {
        return luchadores;
    }
    public static void cargarLista(){
    PesoPesado luchador1 = new PesoPesado("Otis", 30.05, 100.50);
    Tecnico luchador2 = new Tecnico("Cody Rhodes", 50.95, 150.90);
    Acrobatico luchador3 = new Acrobatico("Ricochet", 40.23, 110.55);
    Tecnico luchador4 = new Tecnico("Cm Punk", 60.85, 125.59);
    PesoPesado luchador5 = new PesoPesado("Drew McIntyre", 60.05, 115.90);
    
    luchador1.setPuntosDeAtaque(luchador1.cambioDePuntos());
    luchador2.setPuntosDeAtaque(new TecnicoAdapter(luchador2).cambioDePuntos());
    luchador3.setPuntosDeAtaque(luchador3.cambioDePuntos());
    luchador4.setPuntosDeAtaque(new TecnicoAdapter(luchador4).cambioDePuntos());
    luchador5.setPuntosDeAtaque(luchador5.cambioDePuntos());
    
    luchadores.add(luchador1);
    luchadores.add(luchador2);
    luchadores.add(luchador3);
    luchadores.add(luchador4);
    luchadores.add(luchador5);
    }
    
    public static TorneoKingOfTheRing getInstance(){
        if(instance == null){
            instance = new TorneoKingOfTheRing(luchadores){}; 
        
        }
        return instance;
    
    }
}
