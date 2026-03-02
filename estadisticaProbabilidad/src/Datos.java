import java.util.Random;
import java.util.Scanner;

public class Datos {
    private int numestudiantes;
    private Scanner entrada = new Scanner(System.in);
    private double[] datos;

    public void defArreglo() {

        System.out.println("\nHoras a la semana que pasa un estudiante promedio usando dispositivos electronicos (Celular, Computadora, Tablet, etc...)\n");
        System.out.println("Cantidad de estudiantes entrevistados: \n");
        numestudiantes = entrada.nextInt();
        if (numestudiantes < 0) {
        try {
            throw new Exception("Debe ser mayor que cero el número de estudiantes");

        } catch (Exception e) {
            throw new RuntimeException(e);
            }
        }
        datos = new double[numestudiantes];
    }

    public void generarDatos() {
        Random rand = new Random();
        int min = 30;
        int max = 100;
        for (int i = 0; i < numestudiantes; i++) {
            datos[i] = rand.nextDouble(max - min) + min;
            datos[i] = Math.round(datos[i] * 100.0) / 100.0;
        }
    }

    public void mostrarDatos() {
        for (int i = 0; i < numestudiantes; i++) {
            System.out.println(datos[i]);
        }
    }






}




