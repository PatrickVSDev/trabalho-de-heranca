package TrabalhoInterface;

import java.util.Objects;
import java.util.Scanner;

public class DemSegundoJogo {
    public static void main(String[] args) {

        double doubleRandomNumber;
        int numeroGerado;
        int numeroDigitado;
        int flag = 0;
        String parOuImpar;
        boolean continua = false;

        Scanner sc = new Scanner(System.in);
        SegundoJogo randonNumber = new SegundoJogo();

        System.out.println("Tente ganhar da máquina no par ou impar!");
        System.out.println("Para jogar, escolha PAR ou IMPAR)");
        parOuImpar = sc.nextLine();


        while (!continua) {
            System.out.println("Você pode jogar 4 vezes!");
            while (randonNumber.verificarTerminou(flag)) {
                doubleRandomNumber = Math.random() * 11;
                numeroGerado = (int)doubleRandomNumber;

                if (Objects.equals(parOuImpar, "PAR")) {
                    System.out.println("Escolha um número de 0 a 10!)");
                    numeroDigitado = sc.nextInt();
                    continua = randonNumber.verificarValido(numeroDigitado);
                    if (!continua) {
                        System.out.println("Número inválido, tente novamente!");
                    }
                    if (continua) {
                        if (randonNumber.verificarNumero(numeroGerado, numeroDigitado)) {
                            System.out.println("A máquina escolheu " + numeroGerado);
                            System.out.println("VOCÊ GANHOU!");
                            System.out.println();
                            flag = flag + 1;
                            randonNumber.verificarTerminou(flag);
                            System.out.println("Já jogou: " + flag + " vezes!");
                            continua = false;
                        } else {
                            System.out.println("A máquina escolheu " + numeroGerado);
                            System.out.println("VOCÊ PERDEU!");
                            System.out.println();
                            flag = flag + 1;
                            randonNumber.verificarTerminou(flag);
                            System.out.println("Já jogou: " + flag + " vezes!");
                            continua = false;
                        }
                    }
                } else {
                    System.out.println("Escolha um número de 0 a 10!)");
                    numeroDigitado = sc.nextInt();
                    continua = randonNumber.verificarValido(numeroDigitado);
                    if (!continua) {
                        System.out.println("Número inválido, tente novamente!");
                    }
                    if (continua) {
                        if (!randonNumber.verificarNumero(numeroGerado, numeroDigitado)) {
                            System.out.println("A máquina escolheu " + numeroGerado);
                            System.out.println("VOCÊ GANHOU!");
                            System.out.println();
                            flag = flag + 1;
                            randonNumber.verificarTerminou(flag);
                            System.out.println("Já jogou: " + flag + " vezes!");
                        } else {
                            System.out.println("A máquina escolheu " + numeroGerado);
                            System.out.println("VOCÊ PERDEU!");
                            System.out.println();
                            flag = flag + 1;
                            randonNumber.verificarTerminou(flag);
                            System.out.println("Já jogou: " + flag + " vezes!");
                        }
                    }
                }
            }
            System.out.println("Acabou suas jogagas!");
            System.exit(0);
        }
    }
}
