package generics;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MDFe extends NotaFiscal {
    public MDFe(Long id, LocalDateTime dataEmissao, BigDecimal valorTotal) {
        super(id, dataEmissao, valorTotal);
    }
    
    @Override
    public String toString() {
        return "MDFe [getId()=" + getId() + ", getDataEmissao()=" + getDataEmissao() + ", getValorTotal()=" + getValorTotal() + "]";
    }
}
