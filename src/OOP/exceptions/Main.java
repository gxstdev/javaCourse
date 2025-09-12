package OOP.exceptions;

import OOP.exceptions.ExceptionsPersonalizadas.ContaSemSaldoException;
import OOP.exceptions.ExceptionsPersonalizadas.SaqueMaiorQueLimiteConta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Account ac1 = new Account(1, "Gabriela", 4000.0, 1000.0);

            System.out.println("Digite o valor de deposito: ");
            Double valor = input.nextDouble();
            ac1.deposit(valor);

            System.out.println("Digite a quantia para saque");
            Double quantia = input.nextDouble();

            ac1.withdraw(quantia);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (SaqueMaiorQueLimiteConta e) {
            e.printStackTrace();
        }catch (ContaSemSaldoException e) {
            e.printStackTrace();
        }
    }
}
