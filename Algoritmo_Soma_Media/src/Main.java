//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("=== Informe 5 números inteiros ===");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = lerInteiro(sc);
        }

        // Parte 1 (Integrante 1): Soma
        int soma = funcaoSoma(numeros);
        System.out.println("Soma dos números = " + soma);

        // Parte 2 (Integrante 2): Média
        double media = funcaoMedia(numeros);
        System.out.println("Média dos números = " + media);

    }

    

}