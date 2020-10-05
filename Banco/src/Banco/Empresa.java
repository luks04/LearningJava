package Banco;

public class Empresa {
    private String nombre;
    private String clave_casa_inversionista;
    private String historial;
    private float retorno_inversion;
    private long monto;
    private String plazo;

    private Empresa(){ }

    private Empresa(String nombre, String clave_casa_inversionista, String historial, float retorno_inversion, long monto, String plazo){
        this();
        this.nombre = nombre;
        this.clave_casa_inversionista = clave_casa_inversionista;
        this.historial = historial;
        this.retorno_inversion = retorno_inversion;
        this.monto = monto;
        this.plazo = plazo;
    }

    private String getAtributos(){
        return "Nombre: " + nombre +
                "Clave Casa Inversionista: " + clave_casa_inversionista +
                "Historial: " + historial +
                "Retorno Inversion: " + String.valueOf(retorno_inversion) +
                "Monto: " + String.valueOf(monto) +
                "Plazo: " + plazo;
    }
}
