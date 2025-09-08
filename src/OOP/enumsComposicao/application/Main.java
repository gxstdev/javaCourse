package OOP.enumsComposicao.application;

import OOP.enumsComposicao.entities.NotaFiscal;
import OOP.enumsComposicao.entities.enums.OperacaoFiscal;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NotaFiscal nf1 = new NotaFiscal(1L, LocalDateTime.now(), OperacaoFiscal.TRANSFERENCIA);

        System.out.println("NF -> " + nf1);

        System.out.println("Valor do código da operação fiscal: " + nf1.getOperacaoFiscal().getCodigo());

        OperacaoFiscal strTransferencia = OperacaoFiscal.valueOf("TRANSFERENCIA");

        System.out.println("Operação fiscal obtida a partir da string: " + strTransferencia);
    }
}
