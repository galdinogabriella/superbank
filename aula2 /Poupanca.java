public class Poupanca extends Conta implements IContas, ICliente{

    @Override
    public double saldo() {
         return this.getSaldo ();
    }
    @Override
    public double depositar(double valor) {
       return valor;
    }

    @Override
    public double sacar(double valor) {
      return valor;

}

@Override
public void abrirConta() {
    Corrente corr = new Corrente();
    corr.setNumbank((101));
    corr.setNumero(getNumero());
    corr.setSaldo(getSaldo());
}

  //Dados Cliente
         System.outprintln ( "Seu banco é : " + corr.getNumbank() +
         "\n Sua contam corrente é: " + corr.getNumero() +
         "\n Nome do cliente:" +  corr.getnomecli() +
         "\n CPF do cliente: " + corr.getcpfcli());

}