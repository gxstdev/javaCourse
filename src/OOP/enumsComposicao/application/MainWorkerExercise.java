package OOP.enumsComposicao.application;

import OOP.enumsComposicao.entities.Department;
import OOP.enumsComposicao.entities.HourContract;
import OOP.enumsComposicao.entities.Worker;
import OOP.enumsComposicao.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainWorkerExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Worker w1 = new Worker("Gabriel", WorkerLevel.JUNIOR, 1200.0, new Department("Suporte"));

        System.out.printf("\nDigite o número de contratos, %s: \n", w1.getName());
        int n = input.nextInt();
        input.nextLine();

        System.out.println("\nDigite os dados dos contratos: ");

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nContrato -> %d", i);

            System.out.println("Data (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(input.nextLine(), formatter);

            System.out.println("\nValor por hora: ");
            Double valuePerHour = input.nextDouble();

            System.out.println("\nDuração (horas): ");
            Integer hours = input.nextInt();
            w1.addContract(new HourContract(date, valuePerHour, hours));
            input.nextLine();
        }

        System.out.println("\nInforme o mês e ano para ver o valor total recebido (MM/YY): ");
        String dateStr = input.nextLine();

        String[] date = dateStr.split("/");
        System.out.println("\nValor Total: " + w1.income(Integer.valueOf(date[0]), Integer.valueOf(date[1])));
    }
}
