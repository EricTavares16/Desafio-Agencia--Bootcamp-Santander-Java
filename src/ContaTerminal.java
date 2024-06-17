import  java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = ler.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = ler.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = ler.next();

        System.out.println("Digite o saldo da sua conta: ");
        Double saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente+ " obrigado por criar uma conta em nosso " +
                "banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está " +
                "disponível para saque");
    }

}
