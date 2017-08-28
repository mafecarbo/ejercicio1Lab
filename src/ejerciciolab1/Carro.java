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
public class Carro {
    private String Marca;
    private String Placa;
    private int Horallegada;
    private int Horasalida;

    public Carro(String Marca, String Placa, int Horallegada) {
        this.Marca = Marca;
        this.Placa = Placa;
        this.Horallegada = Horallegada;
    }

    public String getMarca() {
        return Marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public int getHorallegada() {
        return Horallegada;
    }

    public int getHorasalida() {
        return Horasalida;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setHorallegada(int Horallegada) {
        this.Horallegada = Horallegada;
    }

    public void setHorasalida(int Horasalida) {
        this.Horasalida = Horasalida;
    }
    public String informacion (){
        String info;
        info= this.Placa+" "+this.Marca+" "+this.Horallegada;
        return info;
    }
    
    
}
