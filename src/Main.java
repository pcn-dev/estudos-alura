public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Os Farofeiros");

        int ano = 2022;
        System.out.println("Ano do lançamento do file é: " + ano);
        boolean incluidoPlano = true;
        double notaFilme = 8.5;
        // Média feita de acordo com notas de amigos
        double media = (9.8 + 6.3 + 10) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Os farofeiros
                Filme de comédia brasileira
                Nota média: %.2f
                Ano lançamento: %d
                """. formatted(media, ano);

        System.out.println(sinopse);

        int nota = (int) (media/2);
        System.out.println(nota);
    }
}