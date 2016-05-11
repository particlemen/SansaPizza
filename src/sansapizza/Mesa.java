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
    int precio;
    int cap;
    
    public void Contabilizar(Local local){
        local.DineroLocal += this.cap;                
    }
}
