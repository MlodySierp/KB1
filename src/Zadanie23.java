import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sprzedaż pierwszego sklepu");
        int sklep1 = scanner.nextInt();
        System.out.println("Podaj sprzedaż drugiego sklepu");
        int sklep2 = scanner.nextInt();
        System.out.println("Podaj sprzedaż trzeciego sklepu");
        int sklep3 = scanner.nextInt();
        System.out.println("Podaj sprzedaż czwartego sklepu");
        int sklep4 = scanner.nextInt();
        System.out.println("Podaj sprzedaż piątego sklepu");
        int sklep5 = scanner.nextInt();
        System.out.print("Sprzedaż w pierwszym sklepie wyniosła: ");
        for(int i =100;i<=sklep1;){

            System.out.print("*");
            i +=100;
        }
        System.out.println("\n");
        System.out.print("Sprzedaż w drugim sklepie wyniosła: ");
        for(int i =100;i<=sklep2;){

            System.out.print("*");
            i +=100;
        }
        System.out.println("\n");
        System.out.print("Sprzedaż w trzecim sklepie wyniosła: ");
        for(int i =100;i<=sklep3;){

            System.out.print("*");
            i +=100;
        }
        System.out.println("\n");
        System.out.print("Sprzedaż w czwartym sklepie wyniosła: ");
        for(int i =100;i<=sklep4;){

            System.out.print("*");
            i +=100;
        }
        System.out.println("\n");
        System.out.print("Sprzedaż w piątym sklepie wyniosła: ");
        for(int i =100;i<=sklep5;){

            System.out.print("*");
            i +=100;
        }

    }
}
