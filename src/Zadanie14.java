import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbapieter;
        System.out.println("Podaj liczbę pięter");
        liczbapieter = scanner.nextInt();
        if (liczbapieter >= 1) {
            for (int i = 1; i <= liczbapieter; i++) {
                double liczbapokoi;
                System.out.println("Podaj liczbe pokoi");
                liczbapokoi = scanner.nextDouble();
                double zajete;
                System.out.println("Podaj ilosc zajetych pokoi");
                zajete = scanner.nextDouble();
                if (liczbapokoi >= 10) {
                    double oblozenie = zajete / liczbapokoi;
                    System.out.println(oblozenie);
                } else {
                    System.out.println("Błędne dane");
                    break;
                }
            }
            } else {
            System.out.println("Błędne dane");

        }
        }
    }

