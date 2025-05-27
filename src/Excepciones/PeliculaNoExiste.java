package Excepciones;

public class PeliculaNoExiste extends RuntimeException {
    public PeliculaNoExiste(String message) {
        super(message);
    }
}
