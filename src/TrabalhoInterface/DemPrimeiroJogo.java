package TrabalhoInterface;

import java.util.Scanner;

public class DemPrimeiroJogo {
    public static void main(String[] args) {

        double doubleRandomNumber;
        int numeroGerado;
        int numeroDigitado = 0;
        int flag = 0;
        boolean continua = false;

        Scanner sc = new Scanner(System.in);
        PrimeiroJogo randonNumber = new PrimeiroJogo();

        doubleRandomNumber = Math.random() * 11;
        numeroGerado = (int)doubleRandomNumber;

        while (!continua){
            System.out.println("Tente acertar o número de 0 a 10! (Você tem 4 tentativas.)");
            flag = flag + 1;
            numeroDigitado = sc.nextInt();
            if (!randonNumber.verificarTerminou(flag)) {
                if (randonNumber.verificarNumero(numeroGerado,numeroDigitado)) {
                    System.out.println("ACERTOU!!");
                    System. exit(0);
                }
                System.out.println("Jogo encerrado, acabou suas 4 tentativas!");
                System. exit(0);
            }
            continua = randonNumber.verificarValido(numeroDigitado);
            if (!continua) {
                System.out.println("Número inválido, tente novamente!");
            }
        }

        continua = randonNumber.verificarNumero(numeroGerado,numeroDigitado);

        while (!continua) {
            System.out.println("Número incorreto, digite novamente!");
            flag = flag + 1;
            numeroDigitado= sc.nextInt();
            if (!randonNumber.verificarTerminou(flag)) {
                if (randonNumber.verificarNumero(numeroGerado,numeroDigitado)) {
                    System.out.println("ACERTOU!!");
                    System. exit(0);
                }
                System.out.println("Jogo encerrado, acabou suas 4 tentativas!");
                System. exit(0);
            }
            continua = randonNumber.verificarValido(numeroDigitado);
            if (!continua) {
                System.out.println("Número inválido, tente novamente!");
            }
            continua = randonNumber.verificarNumero(numeroGerado,numeroDigitado);
        }
        System.out.println("ACERTOU!!");
    }
}
