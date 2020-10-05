import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    private static double promedio = 0.0;

    public static void main(String[] args) {
        System.out.println("Primero digite la cantidad de estudiantes: ");
        int cantEstudiantes = parseInt(new Scanner(System.in).nextLine());

        int op = menu();

        switch (op){
            case 1:
                promedioMatematicas(cantEstudiantes);
                break;
            case 2:
                promedioEspanol(cantEstudiantes);
                break;
            case 3:
                promedioIngles(cantEstudiantes);
                break;
            default:
                menu();
                break;
        }

        System.out.println("Promedio: " + promedio);
    }

    private static int menu() {
        System.out.println("Menú\n1. Matemáticas\n2. Español\n3. Inglés\nDigite el número correspondiente: ");
        Scanner menu = new Scanner(System.in);
        int opMenu = parseInt(menu.nextLine());
        return opMenu;
    }

    private static void promedioMatematicas(int cantEstudiantes) {
        int sumaNotas = 0;
        for (int i = 0; cantEstudiantes > i; i++){
            System.out.println("Digite la nota: ");
            sumaNotas = sumaNotas + parseInt(new Scanner(System.in).nextLine());
        }
        promedio = sumaNotas / cantEstudiantes;
    }

    private static void promedioEspanol(int cantEstudiantes) {
        int sumaNotas = 0;
        int cantNotas = cantEstudiantes;
        while (cantEstudiantes > 0){
            System.out.println("Digite la nota: ");
            sumaNotas = sumaNotas + parseInt(new Scanner(System.in).nextLine());
            cantEstudiantes--;
        }
        promedio = sumaNotas / cantNotas;
    }

    private static void promedioIngles(int cantEstudiantes) {
        int sumaNotas = 0;
        int cantNotas = cantEstudiantes;
        do{
            System.out.println("Digite la nota: ");
            sumaNotas = sumaNotas + parseInt(new Scanner(System.in).nextLine());
            cantEstudiantes--;
        }  while (cantEstudiantes > 0);
        promedio = sumaNotas / cantNotas;
    }
}
