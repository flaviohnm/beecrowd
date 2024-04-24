package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1002 {

    public static void main(String[] args) throws IOException {

        double pi = 3.14159;
        double raio;
        double area;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        raio = ler.nextDouble();
        area = pi * (raio * raio);
        System.out.println("A=" + String.format("%.4f", area));


    }

}
