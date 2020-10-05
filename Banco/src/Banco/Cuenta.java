package Banco;

public abstract class Cuenta {
    protected long id_cuenta;
    protected long numero_cuenta;
    protected long dinero_disponible;
    protected long monto_inicial;
    protected int valor_minimo;

    protected Cuenta(){ }

    private Cuenta(long id_cuenta, long numero_cuenta, long dinero_disponible, long monto_inicial, int valor_minimo){
        this();
        this.id_cuenta = id_cuenta;
        this.numero_cuenta = numero_cuenta;
        this.dinero_disponible = dinero_disponible;
        this.monto_inicial = monto_inicial;
        this.valor_minimo = valor_minimo;
    }

    protected abstract String getAtributos();

    public boolean validarPertenencia(int id_cuenta_cliente){
        // TODO
        return false;
    }

    private void cancelar(){
        // TODO
    }
}
