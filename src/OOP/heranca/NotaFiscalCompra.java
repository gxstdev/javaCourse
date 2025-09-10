package OOP.heranca;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class NotaFiscalCompra extends NotaFiscal{
    private String cnpjFornecedor;

    public NotaFiscalCompra(Long numero, LocalDateTime dataEmissao, BigDecimal valorTotal, String cnpjFornecedor) {
        super(numero, dataEmissao, valorTotal);
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    @Override
    public LocalDateTime getDataEntrega() {
        return super.getDataEmissao().plusDays(10);
    }
}
