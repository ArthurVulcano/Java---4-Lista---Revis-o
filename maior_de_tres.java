package liista_revisao;

import java.util.Scanner;

public class maior_de_tres {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero");
        int x = sm.nextInt();
        System.out.println("Digite seu numero");
        int x2 = sm.nextInt();
        System.out.println("Digite seu numero");
        int x3 = sm.nextInt();
        String num = (x>x2 && x > x3) ? "O primeior numero é maior" :
                (x2 >x && x2 > x3) ? "O segundo numero é maior"
                : "O terceiro numero é maior";
        System.out.println(num);
        sm.close();

    }
}
