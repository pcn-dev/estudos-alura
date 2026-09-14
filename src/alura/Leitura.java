package alura;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento deste filme?");
        int ano = leitura.nextInt();
        System.out.println("Qual sua nota para o filme?");
        double nota = leitura.nextDouble();

        System.out.println(ano);
        System.out.println(filme);
        System.out.println(nota);
    }
}
