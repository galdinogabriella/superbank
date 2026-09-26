import java.util.Scanner;

public class PrinC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculos ca = new Calculos();

        System.out.println("Escolha a opção entre 1-4");
        int escolha = scanner.nextInt();

        if (escolha >0 && escolha <5) {


        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        ca.setNum1(n1);

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        ca.setNum2(n2);

        }

        // Laço case- escolha então

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Somar:" + ca.soma(ca.getNum1(), ca.getNum2()));
                break;
            case 2:
                System.out.println("Você escolheu Substrair:" + ca.subtracao(ca.getNum1(), ca.getNum2()));
                break;
            case 3:
                System.out.println("Você escolheu Dividir:" + ca.divisao(ca.getNum1(), ca.getNum2()));
                break;
            case 4:
                System.out.println("Você escolheu Multiplicar:" + ca.multiplicacao(ca.getNum1(), ca.getNum2()));
                break;

            default:
                System.out.println("Nenhuma das opções!!");
                break;
        }
    }
}
