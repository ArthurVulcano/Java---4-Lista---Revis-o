package liista_revisao;
import java.util.Scanner;
public class signo_zodiacal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o dia de nascimento: ");
            int dia = sc.nextInt();
            System.out.print("Digite o mês de nascimento: ");
            int mes = sc.nextInt();
            boolean aries = false;
            if ((mes == 3 && dia >= 21 && dia <= 31) || (mes == 4 && dia >= 1 && dia <= 19)) {
                aries = true;
            }
            if (aries) {
                System.out.println("A pessoa é do signo de Áries.");
            } else {
                System.out.println("A pessoa NÃO é do signo de Áries.");
            }

            sc.close();
        }
    }

