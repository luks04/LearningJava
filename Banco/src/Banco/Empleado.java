package Banco;

public class Empleado extends Persona {
    private long sueldo;
    private byte anos_trabajando;
    private String puesto;

    private Empleado(){ super();}

    private Empleado(long sueldo, byte anos_trabajando, String puesto){
        this();
        this.sueldo = sueldo;
        this.anos_trabajando = anos_trabajando;
        this.puesto = puesto;
    }

    private String getAtributos(){
        return "Nombre: " + nombre +
                "Numero Idntificacion: " + String.valueOf(numero_identificacion) +
                "Sueldo: " + String.valueOf(sueldo) +
                "Años trabajando: " + String.valueOf(anos_trabajando) +
                "Puesto: " + puesto;
    }

    private void cobrarSueldo(){
        // TODO
    }
}
