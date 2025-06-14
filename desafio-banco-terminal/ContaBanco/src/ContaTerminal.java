import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.println("Por favor, digite o número da Agência:");
        Scanner scanner = new Scanner(System.in);
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextBigDecimal();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
