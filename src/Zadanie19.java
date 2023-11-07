import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj początkową populację: ");
        int poczatkowa = scanner.nextInt();
        System.out.println("Podaj procentowy przyrost: ");
        double przyrost = scanner.nextInt();
        System.out.println("Podaj ilośc dni: ");
        int dni = scanner.nextInt();
        int i=1;
        double zamieniony = przyrost/100+1;

        if(poczatkowa>=2 && dni>=1){
            do{
                double ostatnia;
                ostatnia = zamieniony * poczatkowa;
                poczatkowa += ostatnia;
                double koniec = Math.round(ostatnia);
                System.out.println("Dzień " + i + " populacja " + koniec);
                i++;
            }while(i<=dni);
        }else{
            System.out.println("Błędne założenia");
        }
    }
}
