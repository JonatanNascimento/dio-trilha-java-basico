import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int conta;
        String agencia, nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Conta !");
        conta = sc.nextInt();

        System.out.println("Agora digite a sua Agência !");
        agencia = sc.next();

        System.out.println("Qual seu Nome Completo?");
        sc.nextLine();
        nomeCliente = sc.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, conta, saldo);

        sc.close();
    }
}
