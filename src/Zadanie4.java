import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        double cena;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę: ");
        cena = scanner.nextDouble();
        double procent = 0.40;
        double zysk = cena * procent;
        System.out.println(zysk);

    }
}
