/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sansapizza;

/**
 *
 * @author felip
 */
public abstract class Mesa {
    protected int precio;
    protected int cap;
    protected int venta;
    
    public void Contabilizar(Dia dia){
        dia.setCs(dia.getCs() + this.cap);                
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public int getCapacidad(){
        return this.cap;
    }
    
    public int getVenta(){
        return this.venta;
    }
}
