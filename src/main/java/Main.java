import org.example.elastech.fundamentos.Bebe;
import org.example.elastech.fundamentos.Brinquedo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Brinquedo novoBrinquedo = new Brinquedo();

        System.out.println("Digite o nome do brinquedo que deseja: ");
        novoBrinquedo.nome = scanner.nextLine();

        novoBrinquedo.verBrinquedo(novoBrinquedo);

        novoBrinquedo.soma(23,
        78);

        Bebe aurora = new Bebe("Aurora", "19/10/2026");

    }
}
