/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sansapizza;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author maligno
 */
public class Local {
    private double Popularidad;
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
    
    
    public int getDineroLocal(){
        return this.DineroLocal;
    }
    public int getEstrellas(){
        return this.Estrellas;
    }
    public double getPopularidad(){
        return this.Popularidad;
    }
    public void setDineroLocal(int Dinero){
        this.DineroLocal = Dinero;
    }
    public void setEstrellas(int Stars){
        this.Estrellas = Stars;
    }
    public void setPopularidad(double vougue){
        this.Popularidad = vougue;
    }
    
    public void Ganancia(int ganancias){
        this.DineroLocal += ganancias;
    }
    public void Perdida(int perdidas){
        this.DineroLocal -= perdidas;
    }
    public void PopularidadDecoracion(){
        double popularidad = Math.pow(2 , this.Estrellas);
        for (int puntero = 0; puntero < this.Decoraciones.size(); puntero++){
            popularidad += this.Decoraciones.get(puntero).getPopularidad();
        }
        this.Popularidad = popularidad;
    }
    public void anadirMesero(){
        this.Empleados.add(new Mesero());
    }
    public void anadirDecoracion(int tipo){
        switch (tipo) {
            case 1: 
                this.Decoraciones.add(new DecoracionRegular());
                this.DineroLocal -= 5000;
                break;
            case 2:
                this.Decoraciones.add(new DecoracionBonita());
                this.DineroLocal -= 10000;
                break;
            case 3:
                this.Decoraciones.add(new DecoracionEspectacular());
                this.DineroLocal -= 20000;
                break;
            default:
                break;
        }
    }
    public void anadirMesas(int tipo){
        switch (tipo) {
            case 1: 
                this.Mesas.add(new MesaChica());
                this.DineroLocal -= 400;
                break;
            case 2:
                this.Mesas.add(new MesaMediana());
                this.DineroLocal -= 2000;
                break;
            case 3:
                this.Mesas.add(new MesaGrande());
                this.DineroLocal -= 3000;
                break;
            default:
                break;
        }
        
    }
}