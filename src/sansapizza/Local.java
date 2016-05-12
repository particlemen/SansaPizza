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
    private Comida Comida;
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
    
    public ArrayList<Empleado> getEmpleados(){
        return this.Empleados;
    }
    
    public ArrayList<Mesa> getMesas(){
        return this.Mesas;
    }
    
    public Comida getComida(){
        return this.Comida;
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
        for (Decoracion Decoracion : Decoraciones){
            popularidad += Decoracion.getPopularidad();
        }
        this.Popularidad = popularidad;
    }
    public void anadirMesero(int tipo){
        switch (tipo){
            case 1:
                this.Empleados.add(new Mesero());
                break;
            case 2:
                this.Empleados.add(new Cocinero());
                break;
            default:
                break;
        }
    }
    public void anadirDecoracion(int tipo){
        switch (tipo) {
            case 1: 
                this.Decoraciones.add(new DecoracionRegular());
                this.Perdida(10000);
                break;
            case 2:
                this.Decoraciones.add(new DecoracionBonita());
                this.Perdida(25000);
                break;
            case 3:
                this.Decoraciones.add(new DecoracionEspectacular());
                this.Perdida(45000);
                break;
            default:
                break;
        }
    }
    public void anadirMesa(int tipo){
        switch (tipo) {
            case 1: 
                this.Mesas.add(new MesaChica());
                this.Perdida(65000);
                break;
            case 2:
                this.Mesas.add(new MesaMediana());
                this.Perdida(100000);
                break;
            case 3:
                this.Mesas.add(new MesaGrande());
                this.Perdida(150000);
                break;
            default:
                break;
        }
    }
    public void despedirEmpleado(int tipo){
        int puntero = 0;
        switch (tipo){
            case 1:
                while (puntero < this.Empleados.size()){
                    if (this.Empleados.get(puntero).getSueldo() == 8000){
                        this.Empleados.remove(puntero);
                        return;
                    }
                    puntero++;
                }
            case 2:
                while (puntero < this.Empleados.size()){
                    if (this.Empleados.get(puntero).getSueldo() == 10000) {
                        this.Empleados.remove(puntero);
                        return;
                    }
                    puntero++;
                }
                break;
        }   
    }
    
    public void venderMesas(int tipo){
        int puntero = 0;
        while (puntero < this.Mesas.size()){
            if ((tipo == 1) && (this.Mesas.get(puntero).getVenta() == 50000)){
                this.Ganancia(50000);
                this.Mesas.remove(puntero);
                return;
            }
            else if ((tipo == 2) && (this.Mesas.get(puntero).getVenta() == 75000)){
                this.Ganancia(75000);
                this.Mesas.remove(puntero);
                return;
            }
            else if ((tipo == 3) && (this.Mesas.get(puntero).getVenta() == 100000)){
                this.Ganancia(100000);
                this.Mesas.remove(puntero);
                return;
            }
            puntero++;
        }
    }
    
    public void venderDecoracion(int tipo){
        int puntero = 0;
        while (puntero < this.Decoraciones.size()){
            if ((tipo == 1) && (this.Decoraciones.get(puntero).getVenta() == 50000)){
                this.Ganancia(6500);
                this.Decoraciones.remove(puntero);
                return;
            }
            else if ((tipo == 2) && (this.Decoraciones.get(puntero).getVenta() == 75000)){
                this.Ganancia(16000);
                this.Decoraciones.remove(puntero);
                return;
            }
            else if ((tipo == 3) && (this.Decoraciones.get(puntero).getVenta() == 100000)){
                this.Ganancia(30000);
                this.Decoraciones.remove(puntero);
                return;
            }
            puntero++;
        }
    }
    
    public void subirEstrellas(){
        this.Estrellas++;
    }
    
    public void subirComida(){
        Comida.aumentarNivel(this);
    }
}