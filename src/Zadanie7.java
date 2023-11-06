import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sekundy;
        System.out.println("Podaj ilość sekund:");
        sekundy = scanner.nextInt();
        if(sekundy<60){
            System.out.println(sekundy + " sekund");
        } else if (sekundy>=60 && sekundy<3600) {
            int minuty = sekundy/60;
            System.out.println( sekundy + " sekund to " + minuty + " minut");
        } else if (sekundy>=3600 && sekundy<86400) {
            int godziny = sekundy/3600;
            System.out.println(sekundy + " sekund to " + godziny + " godzin");
        } else if (sekundy>=86400) {
            int dni = sekundy/86400;
            System.out.println(sekundy + " sekund to " + dni + " dni");
        }
    }
}
