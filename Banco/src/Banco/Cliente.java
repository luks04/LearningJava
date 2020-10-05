package Banco;

public class Cliente extends Persona{
    private int numero_usuario;
    private long id_cuenta;

    private Cliente(){ super();}

    private Cliente(int numero_usuario, long id_cuenta){
        this();
        this.numero_usuario = numero_usuario;
        this.id_cuenta = id_cuenta;
    }

    private String getAtributos(){
        return "Nombre: " + nombre +
                "Numero identificacion: " + String.valueOf(numero_identificacion) +
                "Numero usuario: " + String.valueOf(numero_usuario) +
                "Id Cuenta: " + String.valueOf(id_cuenta);
    }

    private void depositar(){
        // TODO
    }

    private void retirar(){
        // TODO
    }
}
