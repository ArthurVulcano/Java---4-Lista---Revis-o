package liista_revisao;

import java.util.Scanner;

public class faixas_de_Imposto {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite seu salario");
        int x = sm.nextInt();
        String s = ( x <= 2000) ? "Sem imposto" : ( x<=5000) ? "Imposto de 10%: " +
                (x*0.1) : "Imposto de 20%: " + (x * 0.2);
        System.out.println(s);
        sm.close();
    }

}
