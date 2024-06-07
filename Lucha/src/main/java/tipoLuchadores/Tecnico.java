/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoLuchadores;

/**
 *
 * @author sebas
 */
public class Tecnico extends Luchador{
    
    public Tecnico(String nombre, double puntosAtaque, double puntosVida) {
        super(nombre, puntosAtaque, puntosVida);
    }
    
    public double llaveSubmission(){
        double multiplicador = Math.random();
    
        return this.puntosDeAtaque * multiplicador;
    
    }
    
    public void secuenciaDeLlaves(){
    
        this.puntosDeVida = this.puntosDeVida+ 5.15;
    }
    
    
}
