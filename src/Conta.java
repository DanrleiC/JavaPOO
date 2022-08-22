public class Conta {
    String nome = "Jão";
    int numero = 1;
    String agencia = "Braisil";
    double saldo = 153.51;
    boolean ativa = true;

    public double sacar(double valorRetirada){
        double resultado = saldo - valorRetirada;
        return resultado;
    }

    public double depositar(double valorDeposito){
        double resultado = saldo + valorDeposito;
        saldo = resultado;
        return resultado;
    }

    public double calculaRendimento(){
        double resultado = saldo + (saldo*0.1);
        return resultado;
    }
}
