package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0.0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                \n=== Simulador de Caixa Eletrônico ===
                1 - Consultar Saldo
                2 - Realizar Depósito
                3 - Realizar Saque
                4 - Sair
                """);
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor do depósito:");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                    } else if (deposito <= 0){
                        System.out.println("Valor inválido");
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor do saque:");
                    double saque = entrada.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                    } else {
                        System.out.println("Saldo Insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

    }
}
