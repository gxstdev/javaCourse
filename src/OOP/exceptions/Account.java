package OOP.exceptions;


import OOP.exceptions.ExceptionsPersonalizadas.ContaSemSaldoException;
import OOP.exceptions.ExceptionsPersonalizadas.SaqueMaiorQueLimiteConta;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void deposit(Double amount) {
         this.balance += amount;
    }
    public void withdraw(Double amount) throws ContaSemSaldoException,SaqueMaiorQueLimiteConta  {
        if(this.balance <= 0){
            throw new ContaSemSaldoException("Saldo insuficiente");
        }
        if(amount > this.withdrawLimit){
            throw new SaqueMaiorQueLimiteConta("Valor a sacar maior que o limite de conta.");
        }
        this.balance -= amount;
    }
    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
