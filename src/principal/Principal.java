package principal;

public class Principal {
    public static void main(String[] args) {

        // Creo 5 hilos, y los inicio con su manejador
        for (int i = 1; i <= 5; i++) {
            // Create a new thread.
            Hilo hilo = new Hilo("Hilo " + i);
            // Set the uncaught exception handler.
            hilo.setUncaughtExceptionHandler(new ManejadorExcepciones());
            // Start the thread.
            hilo.start();
        }
    }
}
