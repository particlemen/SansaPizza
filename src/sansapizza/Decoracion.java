package sansapizza;

public abstract class Decoracion {
    protected int precio;
    protected double popularidad;
    protected int venta;
    
    /******** Metodo: getPopularidad ********************
    Descripcion: Retorna la popularidad de la decoracion
    Parametros:
    Retorno: Retorna popularidad
    ************************************************/
    public double getPopularidad(){
        return this.popularidad;
    }
    
    /******** Metodo: getventa ********************
    Descripcion: Retorna el precio de venta de la decoracion
    Parametros:
    Retorno: Retorna venta
    ************************************************/
    public int getVenta(){
        return this.venta;
    }
    
    /******** Metodo: getCosto ********************
    Descripcion: Retorna el precio de compra de la decoracion
    Parametros:
    Retorno: Retorna precio
    ************************************************/
    public int getPrecio(){
        return this.precio;
    }
}
