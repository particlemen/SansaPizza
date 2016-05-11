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
    protected int costoUpgrade= 25000;
    protected int costo = 1000;
    protected int precio = 2000;
    private int nivel = 1;
    
    public void aumentarNivel(Local local){
        local.Perdidas(this.costoUpgrade);
        this.nivel += 1;
        this.costo += 0.5 * this.costo;
        this.precio = 2 * this.costo;
        this.costoUpgrade += 0.5*this.costoUpgrade;
    }
}