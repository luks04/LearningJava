import java.util.Scanner;

import static java.lang.Double.parseDouble;

/**
 * 1. Se requiere un programa que analice y resuelva cálculos relacionados con los triángulos, así:
 * • Se solicita al usuario que ingrese las medidas de todos los lados del triángulo y su altura.
 * • Por medio de una instrucción if, if else o if else if, según corresponda, mostrar en pantalla si se trata
 * de un triángulo equilátero, isósceles o escaleno.
 * • Utilizando una instrucción switch calcular las medidas en grados de los ángulos, teniendo en cuenta
 * el tipo de triángulo analizado.
 * • Tener en cuenta que un triángulo es escaleno si sus tres lados son diferentes, equilátero si todos son
 * iguales, e isósceles si únicamente lo son dos de ellos.
 * • Para el cálculo de los ángulos, es importante conocer el teorema del coseno. De acuerdo con esto,
 * en el cálculo del ángulo A, la fórmula sería:
 *
 * 𝐶𝑜𝑠𝐴 = (𝑎2 − 𝑏2)/(−2𝑏𝑐)
 *
 * Finalmente, el programa debe calcular el área del triángulo, sin importar qué tipo de triángulo sea.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite los valores de los lados del triangulo y finalmente su altura:");
        Scanner lado1 = new Scanner(System.in);
        Scanner lado2 = new Scanner(System.in);
        Scanner lado3 = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);

        String tipoTriangulo;

        double a = parseDouble(lado1.nextLine());
        double b = parseDouble(lado2.nextLine());
        double c = parseDouble(lado3.nextLine());
        double h = parseDouble(altura.nextLine());

        double alpha;
        double beta;
        double gama;

        double area;

        if (a == b && a == c) {
            tipoTriangulo = "Equilatero";
        } else if (a != b && a != c && b != c){
            tipoTriangulo = "Escaleno";
        } else {
            tipoTriangulo = "Isoceles";
        }
        
        switch (tipoTriangulo){
            case "Isoceles":
                if (b == c){
                    alpha = 180/Math.PI * (Math.acos(((a*a)-(b*b))/(-2*b*c)));
                    gama = (180.0 - alpha) / 2;
                    beta = gama;
                } else if (a == b){
                    gama = 180/Math.PI * (Math.acos(((c*c)-(b*b))/(-2*b*c)));
                    alpha = (180.0 - gama) / 2;
                    beta = alpha;
                } else {
                    beta = 180/Math.PI * Math.acos(((b*b)-(a*a)-(c*c))/(-2*a*c));
                    alpha = (180.0 - beta) / 2;
                    gama = alpha;
                }
                break;
            case "Escaleno":
                alpha = 180/Math.PI * Math.acos(((a*a)-(b*b)-(c*c))/(-2*b*c));
                beta = 180/Math.PI * Math.acos(((b*b)-(a*a)-(c*c))/(-2*a*c));
                gama = 180.0 - alpha - beta;
                break;
            default: // "Equilatero"
                alpha = 60.0;
                beta = 60.0;
                gama = 60.0;
                break;
        }

        double s = (a + b + c)/2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Tipo triangulo: " + tipoTriangulo);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println("A: " + alpha);
        System.out.println("B: " + beta);
        System.out.println("C: " + gama);

        System.out.println("Altura: " + h);

        System.out.println("Area: " + area);
    }


}
