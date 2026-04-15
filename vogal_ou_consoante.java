package liista_revisao;

import java.util.Scanner;

public class vogal_ou_consoante {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String l = sm.next();
        char vg = 'a' +'e' +'i' + 'o' + 'u';
         String c = (!l.equals(vg)) ? "Sua letra é uma vogal" : "Sua letra é uma consoante";
        System.out.println(c);

    }
}
