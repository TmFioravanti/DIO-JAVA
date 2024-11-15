import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {

    public static void main(String[] args) throws Exception {
        /**Criando o objeto scanner, que é basicamente o que permite a interação do usuário*/
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
    }
    
}
