package Banco;

public class CuentaAhorros extends Cuenta {
    private float porcentaje_ahorro_anual;
    private float intereses;

    private CuentaAhorros(){ super();}

    private CuentaAhorros(float porcentaje_ahorro_anual, float intereses){
        this();
        this.porcentaje_ahorro_anual = porcentaje_ahorro_anual;
        this.intereses = intereses;
    }

    protected String getAtributos(){
        return "ID Cuenta: " + String.valueOf(id_cuenta) +
                "Numero Cuenta: " + String.valueOf(numero_cuenta) +
                "Dinero disponible: " + String.valueOf(dinero_disponible) +
                "Monto Inicial: " + String.valueOf(monto_inicial) +
                "Valor minimo: " + String.valueOf(valor_minimo) +
                "Porcentaje ahorro anual: " + String.valueOf(porcentaje_ahorro_anual) +
                "Intereses: " + String.valueOf(intereses);
    }

    private float calcularIntereses(){
        // TODO
        return 0;
    }
}
