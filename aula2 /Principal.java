
import java.util.Scanner;

public class Principal {
public static void main(String[] args){

Scanner teclado = new Scanner (System.in);

    //Inicando o objeto da classe Corrente

    Corrente corrente = new Corrente();

    System.out.println("Digite o seu nome: ");

    String nome = teclado.nextLine();

  System.out.println("Digite o seu CPF: ");

    String cpfcli = teclado.nextLine(); 


    corrente.setnomecli (nome);
    corrente.setcpfcli ( "625.356.899-18");

    corrente.abrirConta();
    

} 
    
}
