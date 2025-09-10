package OOP.heranca;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class NotaFiscalTransferencia extends NotaFiscal{
    private Long codigoCdOrigem;
    private Long codigoCdDestino;

    public NotaFiscalTransferencia(Long numero, LocalDateTime dataEmissao, BigDecimal valorTotal, Long codigoCdOrigem, Long codigoCdDestino) {
        super(numero, dataEmissao, valorTotal);
        this.codigoCdOrigem = codigoCdOrigem;
        this.codigoCdDestino = codigoCdDestino;
    }

    public Long getCodigoCdOrigem() {
        return codigoCdOrigem;
    }

    public void setCodigoCdOrigem(Long codigoCdOrigem) {
        this.codigoCdOrigem = codigoCdOrigem;
    }

    public Long getCodigoCdDestino() {
        return codigoCdDestino;
    }

    public void setCodigoCdDestino(Long codigoCdDestino) {
        this.codigoCdDestino = codigoCdDestino;
    }
    @Override
    public LocalDateTime getDataEntrega(){
        return super.getDataEmissao().plusDays(5);
    }
}
