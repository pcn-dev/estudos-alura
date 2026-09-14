package alura;

public class Conditional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoPlano = false;
        double notaFilme = 8.5;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lancamento que os cliente estão curtindo!");
        } else {
            System.out.println("Filme mais antigo.");
        }

        if (incluidoPlano || tipoPlano.equals("plus")){
            System.out.println("Liberado para assistir o filme!");
        } else{
            System.out.println("Deverá pagar o aluguel do filme!");
        }
    }
}
