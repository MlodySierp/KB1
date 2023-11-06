import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predkosc;
        System.out.println("Podaj prędkość");
        predkosc = scanner.nextInt();
        int czas;
        System.out.println("Podaj czas");
        czas = scanner.nextInt();

        for(int i=1;i<=czas;i++){
            int pokonane = predkosc*i;
            System.out.println(i + "." + pokonane);
        }
    }
}