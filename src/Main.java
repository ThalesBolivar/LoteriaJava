import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        Random sorteador = new Random();
        int menu;

        do {
            System.out.println("************************** \n");
            System.out.println("Menu LOTOFÁCIL: \n");
            System.out.println("1) Apostar de 0 a 100 \n");
            System.out.println("2) Apostar de A à Z \n");
            System.out.println("3) Apostar em par ou ímpar \n");
            System.out.println("0) Sair \n");
            System.out.println("************************** \n");

            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Apostando de 0 a 100");
                    int num;
                    int num2;
                    System.out.println("Digite um numero entre 0-100: \n");
                    num = ler.nextInt();
                    num2 = sorteador.nextInt(101);
                    if (num >= 0 && num <= 100) {
                        if (num == num2) {
                            System.out.println("Você ganhou R$ 1.000,00 reais. \n");
                        } else {
                            System.out.println("Que pena! O número sorteado foi:" + num2);
                        }
                    } else {
                        System.out.println("Número inválido!!");
                    }
                    break;
                case 2:
                    System.out.println("Apostando de A à Z");
                    System.out.println("Digite uma letra: \n");
                    char gravarLetra = (char) System.in.read();
                    char letraMaiuscula = Character.toUpperCase(gravarLetra);
                    char letraPremiada = 'T';
                    if (Character.isLetter(letraMaiuscula)) {
                        if (letraPremiada == letraMaiuscula) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Apostando em par ou ímpar \n");
                    System.out.println("Digite um numero Inteiro: \n");
                    int numeroInt = ler.nextInt();
                    int resul;
                    resul = numeroInt % 2;
                    if(resul == 0){
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    }else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menu != 0);

        ler.close();
    }
}