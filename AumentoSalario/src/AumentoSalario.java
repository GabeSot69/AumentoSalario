/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que leia o valor do salário bruto de um funcionário. Se o salário for menor ou igual a
    R$ 500,00, o programa deve aplicar um aumento de 0.10 (10%). O programa deverá aplicar também um aumento de 0.05(5%)
    , se o salário for maior do que R$ 500,00.
 */
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario bruto");
        double salBruto = scanner.nextDouble();
        if (salBruto <= 500.00){
            System.out.println("Aumento de 10%\nSalario atual: R$" + salBruto*1.1);
        }
        else {
            System.out.println("Aumento de 5%\nSalario atual: R$" + salBruto*1.05);
        }
    }
}
