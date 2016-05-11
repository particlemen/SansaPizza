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
public class Mesero implements Empleado {
    
    private final int sueldo;
    private final int maxAtendidos;
    
    public Mesero(){
        sueldo = 8000;
        maxAtendidos = 15;
    }
    public void pagarSueldo(Dia dia){
        dia.setSueldo(dia.getSueldo() + sueldo);
        
    }
    public void realizarEmpleo(Dia dia){
        dia.setCr(dia.getCr() + sueldo);
    }
    
    public int getSueldo(){
        return this.sueldo;
    }
    
}