package OOP.enumsComposicao.entities;

import OOP.enumsComposicao.entities.enums.OperacaoFiscal;

import java.time.LocalDateTime;

public class NotaFiscal {
    private Long id;
    private LocalDateTime dataEmissao;
    private OperacaoFiscal operacaoFiscal;

    public NotaFiscal() {
    }

    public NotaFiscal(Long id, LocalDateTime dataEmissao, OperacaoFiscal operacaoFiscal) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.operacaoFiscal = operacaoFiscal;
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

    public OperacaoFiscal getOperacaoFiscal() {
        return operacaoFiscal;
    }

    public void setOperacaoFiscal(OperacaoFiscal operacaoFiscal) {
        this.operacaoFiscal = operacaoFiscal;
    }

    @Override
    public String toString() {
        return String.format("Id Nf: %d - Data Emissão: %s - Operação: %s", getId(), getDataEmissao(), getOperacaoFiscal());
    }
}
