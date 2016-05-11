/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sansapizza;

/**
 *
 * @author maligno
 */
public class Comida {
    private int costoUpgrade= 25000;
    private int costo = 1000;
    private int precio = 2000;
    private int nivel = 1;
    
    public void aumentarNivel(Local local){
        local.Perdidas(this.costoUpgrade);
        this.nivel += 1;
        this.costo += 0.5 * this.costo;
        this.precio = 2 * this.costo;
        this.costoUpgrade += 0.5*this.costoUpgrade;
    }
    
    public int getCosto(){
        return this.costo;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public int getCostoUpgrade(){
        return this.costoUpgrade;
    }
}