import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equalsIgnoreCase("s")) {
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextLong());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextLong());
            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%n A soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), res.getValor());
            System.out.printf("%n Deseja somar outro valor?");
            opc = scan.next();
            System.out.printf("%n%n%n%n");
        }
    }
}
