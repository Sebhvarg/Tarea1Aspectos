/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoLuchadores;
import interfaces.AtaqueNormal;
public class PesoPesado extends Luchador implements AtaqueNormal{
    
    
    public PesoPesado(String nombre, double puntosAtaque, double puntosVida) {
        super(nombre, puntosAtaque, puntosVida);
    }

    @Override
    public double cambioDePuntos() {
        double multiplicador = Math.random();
        return this.puntosDeAtaque *= multiplicador;
    }
    
}
