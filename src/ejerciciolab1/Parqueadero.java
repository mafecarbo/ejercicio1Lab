/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolab1;

import java.util.logging.Logger;

/**
 *
 * @author myd.abogados
 */
public class Parqueadero {
    private final   String NombreP;
    private  int Tarifa;
    private  Zona [] zonas;
    private Zona zonatemporal;

    public Parqueadero(String NombreP, int Tarifa) {
        this.NombreP = NombreP;
        this.Tarifa = Tarifa;
        this.zonas= new Zona[3];
    }

    public String getNombreP() {
        return NombreP;
    }

    public int getTarifa() {
        return Tarifa;
    }
 
    public Zona[] getZonas() {
        return zonas;
    }
    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

    public void setTarifa(int Tarifa) {
        this.Tarifa = Tarifa;
    }
    
}
