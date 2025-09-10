package OOP.heranca;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class NotaFiscal {
    private Long numero;
    private LocalDateTime dataEmissao;
    private BigDecimal valorTotal;

    public NotaFiscal(Long numero, LocalDateTime dataEmissao, BigDecimal valorTotal) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    protected LocalDateTime getDataEntrega(){
        return dataEmissao;
    };

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numero=" + numero +
                ", dataEmissao=" + dataEmissao +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
