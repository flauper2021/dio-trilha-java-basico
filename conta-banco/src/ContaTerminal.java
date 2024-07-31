import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite seu nome: ");

        //Recebe os valores digitados no terminal usando Scanner
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta-corrente: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();
        
        //Exibir a mensagem  para o nosso usuário da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado or criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo e de R$" + saldo + " já esta disponivel");
        
        scanner.close();
    }
}
