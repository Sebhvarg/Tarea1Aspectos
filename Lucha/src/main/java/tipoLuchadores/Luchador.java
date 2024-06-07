/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoLuchadores;

import interfaces.AtaqueNormal;

/**
 *
 * @author sebas
 */
public abstract class Luchador {
    String nombre;
    double puntosDeAtaque;
    double puntosDeVida;
    
    public Luchador(String nombre, double puntosAtaque, double puntosVida){
        this.nombre = nombre;
        this.puntosDeAtaque = puntosAtaque;
        this.puntosDeVida = puntosVida;
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntosDeAtaque() {
        
        return puntosDeAtaque;
    }

    public double getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosDeAtaque(double puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public void setPuntosDeVida(double puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }
   
    
}
