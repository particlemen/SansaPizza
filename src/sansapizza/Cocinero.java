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
public class Cocinero implements Empleado {
    private final int sueldo;
    private final int maxAtendidos;
    
    public Cocinero(){
        sueldo = 10000;
        maxAtendidos = 8;
    }
    public void pagarSueldo(Dia dia){
        dia.setSueldo(dia.getSueldo() + sueldo);
    }
    public void realizarEmpleo(Dia dia){
        dia.setCr(dia.getCr() + sueldo);
        
    }
    
}
