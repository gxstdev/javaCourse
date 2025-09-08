package OOP.enumsComposicao.entities.enums;

public enum OperacaoFiscal {
    TRANSFERENCIA(282L),
    LOGISTICA_REVERSA(74L),
    COMPRA(3L);

    final Long codigo;

    OperacaoFiscal(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }
}
