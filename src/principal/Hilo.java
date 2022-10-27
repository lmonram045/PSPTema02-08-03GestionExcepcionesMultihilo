package principal;

import java.util.Random;

public class Hilo extends Thread {
    // Constructor.
    public Hilo(String nombre) {
        super(nombre);
    }

    // Implementa el método run().
    public void run() {
        Random numero = new Random(); // Genera un número aleatorio.
        int division = 100 / numero.nextInt(4); // Divide 100 entre un número pseudoaleatorio entre 0 y 4.
        System.out.println("Dividsion: " + division); // Imprime el resultado de la división.
    }
}
