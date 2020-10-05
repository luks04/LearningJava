package PruebaLaptop;

import javafx.application.Application;
import javafx.stage.Stage;

public class PruebaLaptop extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Lenovo", "S340", 512, 259900.5); // Precio Double
        Laptop laptop3 = new Laptop("Asus", "X509", 256, 3999000.9); // Precio Integer

        System.out.println("Laptop 1 - " + laptop1.__str__());
        System.out.println("Laptop 2 - " + laptop2.__str__());
        System.out.println("Laptop 3 - " + laptop3.__str__());
        System.out.println("Laptop Cuenta: " + Laptop.getCuenta());

        System.out.println("---------------------------------------------------------");

        System.out.println("Laptop 2 - Marca: " + laptop2.getMarca());
        System.out.println("Laptop 2 - Modelo: " + laptop2.getModelo());

        System.out.println("---------------------------------------------------------");

        System.out.println("Laptop 3 - Tamaño Memoria: " + laptop3.getTamano_memoria());
        System.out.println("Laptop 3 - Precio: " + laptop3.getPrecio());

        System.out.println("---------------------------------------------------------");

        laptop1.setMarca("Apple");
        laptop1.setModelo("MacBook Air");
        laptop1.setTamano_memoria(128);
        laptop1.setPrecio(4789000.55);

        System.out.println("Laptop 1 - " + laptop1.__str__());
        System.out.println("Laptop 2 - " + laptop2.__str__());
        System.out.println("Laptop 3 - " + laptop3.__str__());
        System.out.println("Laptop Cuenta: " + Laptop.getCuenta());

        System.out.println("---------------------------------------------------------");

        System.out.println("Laptop 1 - " + laptop1.__str__());
        System.out.println("Laptop 2 - " + laptop2.__str__());
        System.out.println("Laptop 3 - " + laptop3.__str__());
        System.out.println("Laptop Cuenta: " + Laptop.getCuenta());
    }
}