package principal;

/**
 * Manejador de excepciones para toda la aplicación.
 * */
public class ManejadorExcepciones implements Thread.UncaughtExceptionHandler{
    // Implementa el método uncaughtException().
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("Thread que lanzó la excepción: %s \n", t.getName());
        e.printStackTrace();
    }

}
