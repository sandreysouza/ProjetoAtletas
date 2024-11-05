
public class RelatorioAtletas {
    public static void gerarRelatorio(CadastroAtletas cadastro) {
        System.out.println("### RELATÓRIO ###");
        System.out.printf("Peso médio dos atletas: %.2f%n", cadastro.calcularPesoMedio());
        System.out.println("Atleta mais alto: " + cadastro.getAtletaMaisAlto().getNome());
        System.out.printf("Porcentagem de homens: %.1f %% %n", cadastro.calcularPorcentagemHomens());

        double alturaMediaMulheres = cadastro.calcularAlturaMediaMulheres();
        if (alturaMediaMulheres == -1) {
            System.out.println("Altura média das mulheres: Não há mulheres cadastradas");
        } else {
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        }
    }
}