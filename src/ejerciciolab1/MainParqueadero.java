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
public class MainParqueadero {
    public static void main(String[] args) {
        Parqueadero p= new Parqueadero("parking", 85);
        Zona[] z = new Zona[3];
        z[0]= new Zona("Zona 1");
        z[1]= new Zona("Zona 2");
        z[2]= new Zona("Zona 3");
        Estacionamiento [] e= new Estacionamiento[5];
        for (int i=0; i<5; i++){
            e[i]= new Estacionamiento(i);
        }
        z[0].setEspacio(e);
        System.out.println(p.getNombreP());
        p.setZonas(z);
        System.out.println(z[0].getNombreZ());
        System.out.println(e[0].getNumero());
        System.out.println(p.getZonas().length);
        for (int i=0; i<3; i++){
           System.out.println(z[i].getNombreZ()); 
        }
        Carro c= new Carro("ford", "HJM917", 1030);
        e[0].setCarros(c);
        System.out.println(c.informacion());
        
       
    }
}
