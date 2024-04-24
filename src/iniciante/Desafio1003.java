package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1003 {

    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int soma;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o primeiro valor : ");
        a = scan.nextInt();
        System.out.print("Informe o segundo valor : ");
        b = scan.nextInt();

        soma = a+b;

        System.out.println("SOMA = "+ soma);

    }

}
