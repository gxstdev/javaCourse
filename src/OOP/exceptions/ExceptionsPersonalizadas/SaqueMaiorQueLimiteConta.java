package OOP.exceptions.ExceptionsPersonalizadas;

public class SaqueMaiorQueLimiteConta extends RuntimeException {
    public SaqueMaiorQueLimiteConta(String message) {
        super(message);
    }
}
