import java.util.Scanner;

public class TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual numero deseja ver a tabuada");
        int Tabuada;
        int numero = 1;
        int escolha;
        int conta;

        Tabuada = scanner.nextInt();

        String FraseDigitada;
        System.out.println("TABUADA DO " + Tabuada);

        while(numero < 11) {
            conta = Tabuada * numero;
            System.out.println(Tabuada + "*" + numero + "=" + conta);
            numero++;
        }

        do {
            System.out.println("Opção 1: Continuar.");
            System.out.println("Opção 2: Sair.");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                scanner.nextLine();
                System.out.println("Digite uma frase");
                FraseDigitada = scanner.nextLine();
                System.out.println(FraseDigitada);
            }

        } while(escolha != 2);

        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
    }

}