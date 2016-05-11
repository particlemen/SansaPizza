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
    private ArrayList<Empleado> Empleados = new ArrayList();
    private ArrayList<Mesa> Mesas = new ArrayList(9);
    private ArrayList<Dia> Dias = new ArrayList();
    private ArrayList<Decoracion> Decoraciones = new ArrayList();
    
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
            popularidad += this.Decoraciones.get(puntero).getPopularidad();
        }
        if ((0 <= popularidad) && (popularidad < 2)) this.Estrellas = 1;
        else if ((2 <= popularidad) && (popularidad < 4)) this.Estrellas = 2;
        else if ((4 <= popularidad) && (popularidad < 8)) this.Estrellas = 3;
        else if ((8 <= popularidad) && (popularidad < 16)) this.Estrellas = 4;
        else this.Estrellas = 5;
    }   
}