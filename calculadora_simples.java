package liista_revisao;

import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número");
        int x2 = sc.nextInt();
        System.out.println("Digite um caracter matematico");
        String sim = sc.next();
        int divi = (x/x2);
        sim = (sim.equals("+")) ? "O resultado da soma é: " + (x+x2)
                : (sim.equals("-")) ? "O resultado da sulbtração é: " + (x-x2)
                : (sim.equals("*")) ? "O resultado da multiplicação é: " + (x*x2)
                : (sim.equals("/")) ? "O resultado da divisão é: " + divi : "";
        System.out.println(sim);
        sc.close();




    }
}
