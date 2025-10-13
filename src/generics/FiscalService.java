package generics;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiscalService {
    public static <T> T getFirstDoc(List<T> docs) {
        return docs.get(0);
    }

    public static <T extends Comparable<T>> T getDocComMaiorValor(List<T> docs) {
        T maior = docs.get(0);
        for (T doc : docs) {
            if (doc.compareTo(maior) > 0) {
                maior = doc;
            }
        }
        return maior;
    }

    public static <T extends Comparable<? super T>> T getDocComMaiorValorEx(List<T> docs) {
        T maior = docs.get(0);
        for (T doc : docs) {
            if (doc.compareTo(maior) > 0) {
                maior = doc;
            }
        }
        return maior;
    }

    public static <T extends NotaFiscal> List<T> getDocsEmitidosHoje(List<T> docs) {
        return docs.stream().filter(doc -> doc.getDataEmissao().toLocalDate().equals(LocalDate.now())).collect(Collectors.toList());
    }
}
