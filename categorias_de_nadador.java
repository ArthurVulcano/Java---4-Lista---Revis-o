package liista_revisao;

import java.util.Scanner;

public class categorias_de_nadador {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = sm.nextInt();
        String nd = (x >= 5 && x <= 7) ? "Infantil" :
                (x >= 8 && x <= 17) ? "Juvenil" : "Senior";
        System.out.println(nd);
        sm.close();
    }
}
