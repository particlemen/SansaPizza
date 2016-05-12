package sansapizza;

public class Comida {
    private int costoUpgrade= 25000;
    private int costo = 1000;
    private int precio = 2000;
    private int nivel = 1;
    
    /******** Metodo: aumentarNivel ********************
    Descripcion: Sube el nivel de la comida, a un costo, y por lo tanto todos los parametros de esta
    Parametros:
    Local local, el local actual
    Retorno:
    ************************************************/
    public void aumentarNivel(Local local){
        local.Perdida(this.costoUpgrade);
        this.nivel += 1;
        this.costo += 0.5 * this.costo;
        this.precio = 2 * this.costo;
        this.costoUpgrade += 0.5*this.costoUpgrade;
    }
    
    /******** Metodo: getCosto ********************
    Descripcion: Retorna el costo de la comida
    Parametros:
    Retorno: Retorna el costo actual de la comida
    ************************************************/
    public int getCosto(){
        return this.costo;
    }
    
     /******** Metodo: getNivel ********************
    Descripcion: Retorna el nivel de la comida
    Parametros:
    Retorno: Retorna el nivel actual de la comida
    ************************************************/
    public int getNivel(){
        return this.nivel;
    }
    
     /******** Metodo: getPrecio ********************
    Descripcion: Retorna el precio de venta de la comida
    Parametros:
    Retorno: Retorna el precio actual de la comida
    ************************************************/
    public int getPrecio(){
        return this.precio;
    }
    
     /******** Metodo: getCostoUpgrade ********************
    Descripcion: Retorna el costo para subir de nivel a la comida
    Parametros:
    Retorno: Retorna costoUpgrade
    ************************************************/
    public int getCostoUpgrade(){
        return this.costoUpgrade;
    }
}