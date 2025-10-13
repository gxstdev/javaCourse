package generics;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PrinterService<String> printerService = new PrinterService<>();
        // printerService.add("Hello");
        // printerService.print();

        // PrinterService<Integer> printerServiceInteger = new PrinterService<>();
        // printerServiceInteger.add(1);
        // printerServiceInteger.print();

        // PrinterService<NotaFiscal> printerServiceNotaFiscal = new PrinterService<>();
        // printerServiceNotaFiscal.add(new NotaFiscal(1L, LocalDateTime.now(), BigDecimal.valueOf(1000L)));
        // printerServiceNotaFiscal.print();

        List<NotaFiscal> notasFiscais = List.of(
            new NotaFiscal(1L, LocalDateTime.now().minusDays(1), BigDecimal.valueOf(10000L)),
            new NotaFiscal(2L, LocalDateTime.now().plusDays(1), BigDecimal.valueOf(2000L)),
            new NotaFiscal(3L, LocalDateTime.now(), BigDecimal.valueOf(3000L))
        );

        //FiscalService.getDocsEmitidosHoje(notasFiscais).forEach(System.out::println);
        
        System.out.println(FiscalService.getDocComMaiorValor(notasFiscais));

        List<MDFe> mdfe = List.of(
            new MDFe(1L, LocalDateTime.now().minusDays(1), BigDecimal.valueOf(2000L)),
            new MDFe(2L, LocalDateTime.now().plusDays(1), BigDecimal.valueOf(6000L)),
            new MDFe(3L, LocalDateTime.now(), BigDecimal.valueOf(9000L))
        );

        //O compilador reclama, pois o método getDocComMaior valor não tem a anotação <? super T>
        //System.out.println(FiscalService.getDocComMaiorValor(mdfe));

        System.out.println(FiscalService.getDocComMaiorValorEx(mdfe));
    }
}
