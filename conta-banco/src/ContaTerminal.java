import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
  public static void main(String[] args) {
        // Criação do scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
       

        // Leitura do número da conta
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        // Limpar o buffer de entrada
        scanner.nextLine(); // Limpar a quebra de linha pendente

        // Leitura do número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String numeroDaAgencia = scanner.nextLine();
        
        // Leitura do nome do cliente
        System.out.print("Digite o nome do usuario: ");
        String nomeCliente = scanner.nextLine();
        
        
        
        // Fechar o scanner
        scanner.close();
        
        // Exibição das informações
        System.out.println("O número da conta é: " + numeroConta);
        System.out.println("O número da Agência é: " + numeroDaAgencia);
        System.out.println("Usuario: " + nomeCliente);
        

        // Leitura do saldo
        System.out.println("Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.");

      }
}