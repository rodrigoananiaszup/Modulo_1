package desafio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int limiteDePassageiros = 0;
        int quantidadeDeAlunos = 0;
        int numeroDeViagens = 0;
        int alunosComMonitor = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o limite de passageiros");
        while (limiteDePassageiros < 2 || limiteDePassageiros > 100) {
            limiteDePassageiros = input.nextInt();
            if (limiteDePassageiros < 2 || limiteDePassageiros > 100) {
                System.out.println("Insira um limite entre 2 e 100");
            }
        }
        System.out.println("Insira a quantidade de alunos");
        while (quantidadeDeAlunos < 1 || quantidadeDeAlunos > 1000) {
            quantidadeDeAlunos = input.nextInt();
            if (quantidadeDeAlunos < 1 || quantidadeDeAlunos > 1000) {
                System.out.println("Insira um limite 1 e 1000");
            }
        }
        alunosComMonitor = limiteDePassageiros - 1;

        while (quantidadeDeAlunos > 0) {
            quantidadeDeAlunos = quantidadeDeAlunos - alunosComMonitor;
            numeroDeViagens++;
        }

        System.out.println("A quantidade de viagens é: " + numeroDeViagens);


    }


}
