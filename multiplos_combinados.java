package liista_revisao;

import java.util.Scanner;

public class multiplos_combinados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = sc.nextInt();
       if ((x%7 == 0 )){
           System.out.println("é multiplo de 7");
       } else if ((x%11 == 0)) {
           System.out.println("é multiplo de 11");

       }
       else System.out.println("Não é multiplo");
       sc.close();
    }
}
