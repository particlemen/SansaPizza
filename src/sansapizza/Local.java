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
    protected ArrayList<Decoracion> Decoraciones = new ArrayList();
    
    public Local(){
        DineroLocal = 1200000;
        Estrellas = 0;
    }
    public void setGanancias(int ganancias){
        this.DineroLocal += ganancias;
    }
    public void setPerdidas(int perdidas){
        this.DineroLocal -= perdidas;
    }
    public void Popularidad(){
        double popularidad = 0;
        for (int puntero = 0; puntero < this.Decoraciones.size(); puntero++){
            popularidad += this.Decoraciones.get(puntero).popularidad;
        }
        if ((0 <= popularidad) && (popularidad < 2)) this.Estrellas = 1;
        else if ((2 <= popularidad) && (popularidad < 4)) this.Estrellas = 2;
        
      }   
}