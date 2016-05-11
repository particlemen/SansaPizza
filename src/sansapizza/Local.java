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
    protected ArrayList<Empleado> Empleados = new ArrayList();
    protected ArrayList<Mesa> Mesas = new ArrayList(9);
    protected ArrayList<Dia> Dias = new ArrayList();
    protected ArrayList<Decoracion> Decoracion = new ArrayList();
    
    public Local(){
        DineroLocal = 1200000;
        Estrellas = 0;
    }
    public void Ganancias(int ganancias){
        this.DineroLocal += ganancias;
    }
    public void Perdidas(int perdidas){
        this.DineroLocal -= perdidas;
    }
}
