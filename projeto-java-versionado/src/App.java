import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");

        String nome = input.nextLine();

        System.out.println("Boa noite, " + nome);

        input.close();
        
    }
}
