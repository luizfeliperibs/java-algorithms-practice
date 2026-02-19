package java_algorithms_practice.menu;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Somar números pares até um limite");
            System.out.println("2 - Somar elementos de um vetor double");
            System.out.println("3 - Contar repetições de um número no vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    somarPares();
                    break;

                case 2:
                    somarDouble();
                    break;

                case 3:
                    contarRepeticoes();
                    break;
            }

        } while (opcao != 0 ) ;

        sc.close();

    }

    private static void contarRepeticoes() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero a ser verificado: ");
        int num = sc.nextInt();

        System.out.println("Qual o tamanho do array: ");
        int tamanho = sc.nextInt();

        int repeticoes = 0;

        int[] vet = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor [" + i + "]: ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            if(vet[i] == num){
                repeticoes++;
            }
        }

        System.out.println("O numero " + num + " repetiu-se " + repeticoes + " vezes.");

    }

    private static void somarDouble() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        double[] vet = new double[tamanho];

        double soma = 0;

        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite o valor [" + i + "]: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        System.out.println("A soma total de numeros double e = " + soma);

    }

    private static void somarPares() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Até que numero será o vetor: ");
        int limite = sc.nextInt();

        int soma = 0;

        for (int i=0; i<=limite; i++){

            if(i % 2 == 0){
                soma+=i;
            }

        }

        System.out.println("A soma de todos os numeros pares até o limite é = " + soma);

    }

}
