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
public class Dia {
   private int Cp;
   private int Cs;
   private int Ca;
   private int Cr;
   private int Cf;
   private int sueldo;
   private int ingreso;
   private int costo;
   private int resultado;
    
   public Dia(){
       Cp = 0;
       Cs = 0;
       Ca = 0;
       Cr = 0;
       Cf = 0;
       sueldo = 0;
       ingreso = 0;
       costo = 0;
       resultado = 0;
   }
     
   public void setCp(int n){
       this.Cp = n;
   }
   
   public void setCs(int n){
       this.Cs = n;
   }
   public void setCa(int n){
       this.Ca = n;
   }
   public void setCr(int n){
       this.Cr = n;
   } 
   public void setCf(int n){
       this.Cf = n;
   }
   public void setSueldo(int n){
       this.sueldo = n;
   }
   public void setIngreso(int n){
       this.ingreso = n;
   } 
   public void setCosto(int n){
       this.costo = n;
   }
   public void setResultado(int n){
       this.resultado = n;
   } 
   public int getCp(){
       return this.Cp;
   }
   
   public int getCs(){
       return this.Cs;
   }
   
   public int getCa(){
       return this.Ca;
   }
   
   public int getCr(){
       return this.Cr;
   }
   public int getCf(){
       return this.Cf;
   }
   public int getSueldo(){
       return this.Cp;
   }
   public int getIngreso(){
       return this.ingreso;
   }
   public int getCosto(){
       return this.costo;
   }
   
   public int getResultado(){
       return this.resultado;
   }
      
}
