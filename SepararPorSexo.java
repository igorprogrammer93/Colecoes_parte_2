import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        String nome;
        String sexo;
        String continuar;

        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
                System.out.println("Adicionado ao grupo Masculino: " + nome);  // Debug
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
                System.out.println("Adicionado ao grupo Feminino: " + nome);   // Debug
            } else {
                System.out.println("Sexo inválido! Use M para Masculino ou F para Feminino.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();

        } while (continuar.equals("S"));

        scanner.close();

        System.out.println("\nGrupo Masculino:");
        if (grupoMasculino.isEmpty()) {
            System.out.println("Nenhum integrante.");
        } else {
            for (String pessoa : grupoMasculino) {
                System.out.println("- " + pessoa);
            }
        }

        System.out.println("\nGrupo Feminino:");
        if (grupoFeminino.isEmpty()) {
            System.out.println("Nenhum integrante.");
        } else {
            for (String pessoa : grupoFeminino) {
                System.out.println("- " + pessoa);
            }
        }
    }
}

