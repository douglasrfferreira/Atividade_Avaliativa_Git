//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("=== Informe 5 números inteiros ===");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = lerInteiro(sc);
        }

        
        int soma = funcaoSoma(numeros);
        System.out.println("Soma dos números = " + soma);

        
        double media = funcaoMedia(numeros);
        System.out.println("Média dos números = " + media);

    }

    
    public static int funcaoSoma(int[] valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma;
    }

    public static double funcaoMedia(int[] valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma / 5.0;
    }

}