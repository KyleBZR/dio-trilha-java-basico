import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o número de sua agência: ");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scan.nextInt();
        System.out.println("Por favor digite o seu saldo: ");
        double saldo = scan.nextDouble();
        scan.close();
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + " conta: " + numero + " e seu saldo de R$ " + saldo + " já está disponível para o saque");

    }
}
