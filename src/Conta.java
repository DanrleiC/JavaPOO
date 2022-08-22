public class Conta {
    String titular = "João";
    int numero = 1;
    String agencia = "Braisil";
    double saldo = 153.51;
    boolean ativa = true;

    public double sacar(double valorRetirada){
        double resultado = this.saldo - valorRetirada;
        return resultado;
    }

    public double depositar(double valorDeposito){
        double resultado = this.saldo + valorDeposito;
        this.saldo = resultado;
        return resultado;
    }

    public double calculaRendimento(){
        double resultado = this.saldo + (this.saldo*0.1);
        return resultado;
    }

    public String recuperaDadosParaImpressao(){
        String dados = "Nome: " + this.titular;
        dados += "\nNúmero da conta: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nAtiva: " + this.ativa;
        return dados;
    }
}
