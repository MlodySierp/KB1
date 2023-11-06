import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poczatkowa populacje");
        double populacja = scanner.nextInt();
        System.out.println("Podaj ilosc dni");
        double dni = scanner.nextInt();
        System.out.println("Podaj ilosc procent");
        double procent = scanner.nextDouble();
        double przeliczony = procent/100+1;

        if(populacja>=2 && dni>=1 && przeliczony>=0){
            for(int i=1;i<=dni;i++){
                double populacjakoniec = populacja*przeliczony;

                System.out.println("Dzień " + i + " populacja " + populacjakoniec);
            }
        } else{
            System.out.println("Błędne dane");
        }
    }
}