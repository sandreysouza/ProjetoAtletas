
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        CadastroAtletas cadastro = new CadastroAtletas();

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Digite os dados do atleta número %d:%n", i);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            String sexo;
            do {
                System.out.print("Sexo (F/M): ");
                sexo = scanner.nextLine().toUpperCase();
                if (!sexo.equals("F") && !sexo.equals("M")) {
                    System.out.println("Valor invalido! Digite F ou M:");
                }
            } while (!sexo.equals("F") && !sexo.equals("M"));

            double altura;
            do {
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                if (altura <= 0) {
                    System.out.println("Valor invalido! Digite um valor positivo:");
                }
            } while (altura <= 0);

            double peso;
            do {
                System.out.print("Peso: ");
                peso = scanner.nextDouble();
                if (peso <= 0) {
                    System.out.println("Valor invalido! Digite um valor positivo:");
                }
            } while (peso <= 0);
            scanner.nextLine(); // Consome a nova linha

            Atleta atleta = new Atleta(nome, sexo, altura, peso);
            cadastro.adicionarAtleta(atleta);
        }

        RelatorioAtletas.gerarRelatorio(cadastro);

        scanner.close();
    }
}