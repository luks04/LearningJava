package Banco;

public class Banco {
    private String nombre;

    private Banco(){ }

    private Banco(String nombre){
        this();
        this.nombre = nombre;
    }

    private String getAtributos(){
        return "Nombre: " + nombre;
    }
}