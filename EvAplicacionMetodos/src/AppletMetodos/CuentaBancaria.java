package AppletMetodos;

public class CuentaBancaria {
    private int numero;
    private String nombre;
    private double saldo;

    CuentaBancaria(){
        numero = 0;
        nombre = "";
        saldo = 0.0;
    }

    CuentaBancaria(int numero, String nombre, double saldo){
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }
    public double getSaldo() { return saldo; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setSaldo(double saldo) { this.saldo = saldo; }


}
