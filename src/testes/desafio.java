package testes;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome para iniciarmos o programa :");

        String nome = sc.nextLine();
        System.out.println("Bem vnido " + nome + " vamos inciar o programa :");

        int b = 0;


        while(b != 4) {

            System.out.println("=====Menu=====");
            System.out.println("Escolha uma opcao");
            System.out.println("1 Calcular o dobro");
            System.out.println("2 Verificar se o numero é impar ou par");
            System.out.println("3 Calcular o fatorial de um numero");
            System.out.println("4 encerrar o programa");
            b=sc.nextInt();
            sc.nextLine();

            switch(b) {
                case 1:
                    System.out.println("Digite um numero inteiro :");
                    int b1 = sc.nextInt();
                   int res = b1 * 2;
                    System.out.println("O dobro do numero informado é : " + res);
                    break;

                case 2:
                    System.out.println("Digite um numero inteiro :");
                    int b2 = sc.nextInt();
                    if (b2 % 2 == 0){
                    System.out.println("O numero digitado é par");
                }
                else {
                        System.out.println("O numero digitado é impar");

                }
                break;

                case 3:
                    System.out.println("Digite um numero inteiro :");
                    int b3 = sc.nextInt();
                    long fatorial = 1;
                    for (int i = 1; i <= b3; i++) {
                        fatorial = fatorial * i;
                        System.out.println("Fatorial de "+ b3 +" é: "+ fatorial);
                    }
                    break;
                    case 4:
                        System.out.println("Obrigado por usar o programa, "+ nome +" Encerrando...");
                        break;

                default:
                    System.out.println("Escolha uma opcao valida");
                    break;

            }
        }


























        sc.close();
    }
}
