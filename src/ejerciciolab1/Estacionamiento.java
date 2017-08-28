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
public class Estacionamiento {
    private int numero;
    private Carro carros;

    public Carro getCarros() {
        return carros;
    }
    public Estacionamiento(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCarros(Carro carros) {
        this.carros = carros;
    }
    

    
    
}
