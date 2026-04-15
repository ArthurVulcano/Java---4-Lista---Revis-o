package liista_revisao;

import java.util.Scanner;

public class validacao_de_triangulo {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero");
        int x = sm.nextInt();
        System.out.println("Digite seu numero");
        int x2 = sm.nextInt();
        System.out.println("Digite seu numero");
        int x3 = sm.nextInt();
        String tri = (x+x2 > x3) ? "Pode-se formar um triangulo"
                : "Não pode-se formar um triangulo";
        System.out.println(tri);
        sm.close();

    }
}
