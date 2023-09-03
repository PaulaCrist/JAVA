# 1) Faça um programa que calcule o salário de um funcionário com
        base no valor da hora trabalhada de R$ 15.00 e na quantidade de
        40 horas trabalhadas e exiba o salário.

public class CalculoSalario {
    public static void main(String[] args) {
        // Defina o valor da hora e a quantidade de horas trabalhadas
        double valorHora = 15.00;
        int horasTrabalhadas = 40;

        // Calcule o salário
        double salario = valorHora * horasTrabalhadas;

        // Exiba o salário
        System.out.println("O salário do funcionário é R$ " + salario);
    }
}
 # 3
          Observação: Aprovado >= 70, Reprovado < 40.
        Desafio: Como saber se está na final?

        import java.util.Scanner;

public class VerificacaoVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da primeira variável: ");
        int variavel1 = scanner.nextInt();

        System.out.print("Informe o valor da segunda variável: ");
        int variavel2 = scanner.nextInt();

        if (variavel1 > variavel2) {
            System.out.println("A primeira variável é maior que a segunda variável.");
        } else if (variavel1 < variavel2) {
            System.out.println("A primeira variável é menor que a segunda variável.");
        } else {
            System.out.println("A primeira variável é igual à segunda variável.");
        }

        scanner.close();
    }
}
 # 4) Faça um programa para o cálculo de uma folha de pagamento.
         Para isso, o sistema deve saber o valor do salário.
         Com base na descrição abaixo, exiba os descontos do IR:

         • Salário até R$900,00 (inclusive) – Isento;
         • Salário de R$901,00 até R$ 1500, 00 (inclusive) – desconto de 5%;
         • Salario de1501,00 até R$ 2500,00 (Inclusive) – desconto de 10%;
         • Salário acima de 2500 – Desconto de 20%.

         import java.util.Scanner;

public class CalculoFolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do salário: ");
        double salario = scanner.nextDouble();

        double descontoIR = 0;

        if (salario <= 900) {
            descontoIR = 0;
        } else if (salario <= 1500) {
            descontoIR = salario * 0.05;
        } else if (salario <= 2500) {
            descontoIR = salario * 0.10;
        } else {
            descontoIR = salario * 0.20;
        }

        double salarioLiquido = salario - descontoIR;

        System.out.println("Salário: R$ " + salario);
        System.out.println("Desconto de IR: R$ " + descontoIR);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}


