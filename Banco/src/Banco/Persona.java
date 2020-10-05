package Banco;

public class Persona {
    protected String nombre;
    protected int numero_identificacion;

    protected Persona(){ }

    private Persona(String nombre, int numero_identificacion){
        this();
        this.nombre = nombre;
        this.numero_identificacion = numero_identificacion;
    }

    private void crearCuenta(){
        // TODO
    }
}
