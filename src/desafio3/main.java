package desafio3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var notaDaProva = 0;
        var media = 0;

        System.out.print("Digite o valor de uma das provas: ");
        notaDaProva = sc.nextInt();
        verificaProva(notaDaProva, sc);

        System.out.print("Digite a média: ");
        media = sc.nextInt();
        verificaMedia(media, sc, notaDaProva);

        var valorDaPrimeiraProva = apuraMedia(media, notaDaProva);
        System.out.println("Valor da segunda prova é: " + valorDaPrimeiraProva);
    }

    private static Integer verificaProva(Integer prova, Scanner sc) {
        while (prova < 0 || prova > 100) {
            if (prova < 0 || prova > 100) {
                System.out.print("Digite um valor válido para a prova: ");
                prova = sc.nextInt();
            }
        }
        return prova;
    }

    private static Integer verificaMedia(Integer media, Scanner sc, Integer notaProva) {
        while (media < 0 || media > 100 || notaProva > 100) {
            if (media < 0 || media > 100 || notaProva > 100) {
                System.out.print("Digite um valor válido para a média: ");
                media = sc.nextInt();
            }
        }
        apuraMedia(media, notaProva);
        return media;
    }

    private static Integer apuraMedia(Integer media, Integer valorProva) {
        var notaPrimeiraProva = (media * 2) - valorProva;
        return notaPrimeiraProva;
    }
}