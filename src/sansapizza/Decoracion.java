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
public abstract class Decoracion {
    protected int precio;
    protected double popularidad;
    protected int venta;
    
    public double getPopularidad(){
        return this.popularidad;
    }
    
    public int getVenta(){
        return this.venta;
    }
    
    public int getPrecio(){
        return this.precio;
    }
}
