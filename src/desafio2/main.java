package desafio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int numero = 0;
        int fatoriais = 0;
        int k = 0;
        int vetFatorial[] = new int[10];

        vetFatorial[0] = 1;
        for (i = 1; i <= 9; i++) {
            vetFatorial[i] = i * vetFatorial[i - 1];
        }

        System.out.println("Insira o valor a ser calculado: ");
        numero = sc.nextInt();

        for (i = 1; i <= 9; i++) {
            if (vetFatorial[i] > numero) {
                k = i - 1;
                break;
            }
        }
        for (i = k; i >= 0; i--) {
            fatoriais += (numero / vetFatorial[i]);
            numero = numero % vetFatorial[i];
        }
        System.out.println("Este valor pode ser somado com " + fatoriais + "! fatoriais");

    }
}