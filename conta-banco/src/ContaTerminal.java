import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Bem-vindo ao banco!");
        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o número da conta: ");    
        int numeroConta = scan.nextInt();
        scan.nextLine(); // Consome a quebra de linha deixada pelo nextInt
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        scan.nextLine(); // Limpa o buffer do scanner
        System.out.println("Por favor, digite o saldo: ");  
        double saldo = scan.nextDouble();
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        System.out.println("==============================");
        scan.close();
    
    }

   
}
