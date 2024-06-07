/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;
import tipoLuchadores.Luchador;
import tipoLuchadores.Tecnico;
import interfaces.AtaqueNormal;
/**
 *
 * @author sebas
 */
public class TecnicoAdapter implements AtaqueNormal{

    private Tecnico tecnico;

    public TecnicoAdapter(Tecnico tecnico) {
        this.tecnico = tecnico;
        
       
    }

    @Override
    public double cambioDePuntos() {
        return tecnico.llaveSubmission();
    }
    


 
    

    
}
