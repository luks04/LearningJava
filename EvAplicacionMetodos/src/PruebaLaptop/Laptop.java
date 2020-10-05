package PruebaLaptop;

public class Laptop {
    private String marca;
    private String modelo;
    private int tamano_memoria;
    private double precio;

    private static int cuenta = 0;

    Laptop(){
        marca = "";
        modelo = "";
        tamano_memoria = 0;
        precio = 0.0;
        cuenta++;
    }

    Laptop(String marca, String modelo, int tamano_memoria, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.tamano_memoria = tamano_memoria;
        this.precio = precio;
        cuenta++;
    }

    String getMarca() { return marca; }
    String getModelo() { return modelo; }
    int getTamano_memoria() { return tamano_memoria; }
    double getPrecio() { return precio; }
    static int getCuenta() { return cuenta; }

    void setMarca(String marca) { this.marca = marca; }
    void setModelo(String modelo) { this.modelo = modelo; }
    void setTamano_memoria(int tamano_memoria) { this.tamano_memoria = tamano_memoria; }
    void setPrecio(double precio) { this.precio = precio; }
    public static void setCuenta(int cuenta) { Laptop.cuenta = cuenta; }

    String __str__(){
        return "Marca: " + marca + "\tModelo: " + modelo + "\tTamaño memoria: " + tamano_memoria + "GB\tPrecio: " + precio;
    }

}