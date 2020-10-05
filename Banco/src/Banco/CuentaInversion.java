package Banco;

public class CuentaInversion extends Cuenta {
    private boolean disponible;

    private CuentaInversion(){ super();}

    private CuentaInversion(boolean disponible){
        this();
        this.disponible = disponible;
    }

    protected String getAtributos(){
        return "ID Cuenta: " + String.valueOf(id_cuenta) +
                "Numero Cuenta " + String.valueOf(numero_cuenta) +
                "Dinero disponible: " + String.valueOf(dinero_disponible) +
                "Monto inicial: " + String.valueOf(monto_inicial) +
                "Valor minimo: " + String.valueOf(valor_minimo) +
                "Disponible: " + String.valueOf(disponible);
    }

    private String validarEstadoCuenta(){
        // TODO
        return "";
    }
}