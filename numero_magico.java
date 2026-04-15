package liista_revisao;
import java.util.Scanner;
public class numero_magico {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número de 4 dígitos: ");
            int num = sc.nextInt();
            if (num < 1000 || num > 9999) {
                System.out.println("Por favor, digite um número de 4 dígitos.");
            }
            else {
                int parte1 = num / 100;
                int parte2 = num % 100;
                int soma = parte1 + parte2;
                int quadrado = soma * soma;
                if (quadrado == num) {
                    System.out.println("O número é mágico!");
                }
                else {
                    System.out.println("O número NÃO é mágico.");
                }
            }
            sc.close();
        }
    }

