/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoLuchadores;
import interfaces.AtaqueAereo;
import interfaces.AtaqueNormal;
/**
 *
 * @author sebas
 */
public class Acrobatico extends Luchador implements AtaqueAereo, AtaqueNormal  {
    public Acrobatico(String nombre, double puntosAtaque, double puntosVida) {
        super(nombre, puntosAtaque, puntosVida);
    }

    @Override
    public double ataqueaereo() {
        double multiplicador = Math.random();
        return this.puntosDeAtaque *= multiplicador;
       
    }

    @Override
    public double cambioDePuntos() {
       double multiplicador = Math.random();
        return this.puntosDeAtaque *= multiplicador;
       
    }
    
    
    
}
