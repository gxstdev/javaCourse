package OOP.exceptions.ExceptionsPersonalizadas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Main {
    public static void main(String[] args) {
        try {
            if (LocalDateTime.now().isAfter(LocalDateTime.now().minusDays(1))) {
                throw new InvalidDateInput("A data maior que o permitido.");
            }
        } catch (InvalidDateInput e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
