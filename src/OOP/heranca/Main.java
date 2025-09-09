package OOP.heranca;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nf1 = new NotaFiscalCompra(1L, LocalDateTime.now(), BigDecimal.valueOf(1500L),
                "345345000");
        System.out.println(nf1);
        System.out.println(nf1.getDataEntrega());

        NotaFiscalTransferencia nf2 = new NotaFiscalTransferencia(2L, LocalDateTime.now().minusDays(5L), BigDecimal.valueOf(1500L),
                500L, 600L);
        nf2 = (NotaFiscalTransferencia) nf1;
    }
}
