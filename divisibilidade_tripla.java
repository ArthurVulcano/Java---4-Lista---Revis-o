package liista_revisao;

import java.util.Scanner;

public class divisibilidade_tripla {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero");
        int x = sm.nextInt();
        String o = (x%30 == 0 ) ? "é divisivel por 2, 3 e 5" : "Não é divisivel";
        System.out.println(o);
    }
     sm.close();
}
