package generics;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class NotaFiscal implements Comparable<NotaFiscal> {
    private Long id;
    private LocalDateTime dataEmissao;
    private BigDecimal valorTotal;

    public NotaFiscal(Long id, LocalDateTime dataEmissao, BigDecimal valorTotal) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "NotaFiscal [id=" + id + ", dataEmissao=" + dataEmissao + ", valorTotal=" + valorTotal + "]";
    }

    @Override
    public int compareTo(NotaFiscal nota) {
        return valorTotal.compareTo(nota.getValorTotal());
    }
}
