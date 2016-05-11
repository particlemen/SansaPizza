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
       Cp = n;
   }
   
   public void setCs(int n){
       Cs = n;
   }
   public void setCa(int n){
       Ca = n;
   }
   public void setCr(int n){
       Cr = n;
   } 
   public void setCf(int n){
       Cf = n;
   }
   public void setSueldo(int n){
       sueldo = n;
   }
   public void setIngreso(int n){
       ingreso = n;
   } 
   public void setCosto(int n){
       costo = n;
   }
   public void setResultado(int n){
       resultado = n;
   } 
   public int getCp(){
       return Cp;
   }
   
   public int getCs(){
       return Cs;
   }
   
   public int getCa(){
       return Ca;
   }
   
   public int getCr(){
       return Cr;
   }
   public int getCf(){
       return Cf;
   }
   public int getSueldo(){
       return Cp;
   }
   public int getIngreso(){
       return ingreso;
   }
   public int getCosto(){
       return costo;
   }
   
   public int getResultado(){
       return resultado;
   }
   
   
}
