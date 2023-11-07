import java.util.Random;
import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random liczba = new Random();
        int i=1;
        int punktykomputer=0;
        int punktyczlowiek=0;
        int wygrana=1;
        int j=1;
        String poczatek;
        do {
            System.out.println("Kliknij, aby rozpocząć(tak).");
            poczatek = scanner.next();


        if(poczatek.equals("tak")) {
                System.out.println("Rzut komputera: ");
                int wylosowana = liczba.nextInt(6) + 1;
                System.out.println(wylosowana);
                System.out.println("Rzut użytkownika: ");
                int losludz = liczba.nextInt(6) + 1;
                System.out.println(losludz);
                if (wylosowana > losludz) {
                    System.out.println("Wygrana komputera");
                    punktykomputer += wygrana;
                } else if (wylosowana == losludz) {
                    System.out.println("Remis");
                } else {
                    System.out.println("Wygrana gracza");
                    punktyczlowiek += wygrana;
                }


        }
        j++;
        }while(j<=10);

        System.out.println("Punkty człowieka: " + punktyczlowiek + "\n" + "Punkty komputera: " + punktykomputer );
    }
}
