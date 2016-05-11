/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sansapizza;
import java.util.ArrayList;
/**
 *
 * @author maligno
 */
public class Local {
    private int DineroLocal;
    private int Estrellas;
    ArrayList Empleados = new ArrayList();
    ArrayList Muebles = new ArrayList();
    ArrayList Dias = new ArrayList();
    ArrayList Decoracion = new ArrayList();
    
    public void Ganancias(int ganancias){
        this.DineroLocal += ganancias;
    }
    public void Perdidas(int perdidas){
        this.DineroLocal -= perdidas;
    }
}
