import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Conta contaTeste = new Conta();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a opção desejada:\n" +
                "1 - Sacar\n" +
                "2 - Depositar\n" +
                "3 - Rendimento" );
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção de saque.");
                System.out.println("Por favor, digite o valor da saque: ");
                double valoRetirada = ler.nextDouble();

                System.out.println("Valor total da Conta: " + contaTeste.saldo);
                System.out.println("Valor do saque: " + valoRetirada);
                System.out.println("Valor total da conta após o saque: " + contaTeste.sacar(valoRetirada));
                break;
            case 2:
                System.out.println("Você escolheu a opção de depósito.");
                System.out.println("Por favor, digite o valor que será depositado: ");
                double valorDeposito = ler.nextDouble();

                System.out.println("Valor total da Conta antes do depósito: " + contaTeste.saldo);
                System.out.println("Valor do depósito: " + valorDeposito);
                System.out.println("Valor total da Conta após o depósito: " + contaTeste.depositar(valorDeposito));
                break;
            case 3:
                System.out.println("Você escolheu a opção de Rendimento.");
                System.out.println("O valor que sua conta rendeu até o momento é de: " + contaTeste.calculaRendimento());
        }
    }
}