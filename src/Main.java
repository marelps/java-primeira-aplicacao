public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada por 3 notas, tipo de comentário por linha
        
        /* Tipo de comentário
        para diversas linhas
         */

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                TOP GUN: MAVERICK
                Filme de aventura
                Ano de Lançamento 2022.
                """;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}