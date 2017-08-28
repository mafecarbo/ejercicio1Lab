/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolab1;

/**
 *
 * @author myd.abogados
 */
public class Zona {
    private  String NombreZ;
    private Estacionamiento[] espacio;

    public Zona(String NombreZ) {
        this.NombreZ = NombreZ;
        this.espacio= new Estacionamiento[5];
    }

    public String getNombreZ() {
        return NombreZ;
    }
    public void setNombreZ(String NombreZ) {
        this.NombreZ = NombreZ;
    }

    public Estacionamiento[] getEspacio() {
        return espacio;
    }

    public void setEspacio(Estacionamiento[] espacio) {
        this.espacio = espacio;
    }
    
    
    
}
