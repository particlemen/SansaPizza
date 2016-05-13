package sansapizza;

public class Cocinero implements Empleado {
    private final int sueldo;
    private final int maxAtendidos;
    
    public Cocinero(){
        sueldo = 10000;
        maxAtendidos = 8;
    }
    
    /******** Metodo: pagarSueldo ********************
    Descripcion: suma el sueldo del cocinero al sueldo total en dia
    Parametros:
    dia [dia actual]
    Retorno: no hay retorno
    ************************************************/
    public void pagarSueldo(Dia dia){
        dia.setSueldo(dia.getSueldo() + this.sueldo);
    }
    
    /******** Metodo: realizarEmpleo ********************
    Descripcion: suma los clientes que pueden ser atendidos a Cr en dia
    Parametros:
    dia [dia actual]
    Retorno: no hay retorno
    ************************************************/
    public void realizarEmpleo(Dia dia){
        dia.setCa(dia.getCa() + this.maxAtendidos);
    }
    
    /******** Metodo: getSueldo ********************
    Descripcion: Retorna el sueldo del cocinero
    Parametros:
    Retorno: Sueldo del cocinero
    ************************************************/
    public int getSueldo(){
        return this.sueldo;
    }
    
}
