import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wegatarianska;
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        wegatarianska = scanner.next();
        String weganska;
        System.out.println("Czy któraś z osOb jest na diecie wegańskiej?");
        weganska = scanner.next();
        String bezglutenowa;
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        bezglutenowa = scanner.next();

        if (wegatarianska.equals("tak") && weganska.equals("tak") && bezglutenowa.equals("tak")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("tak") && weganska.equals("nie") && bezglutenowa.equals("nie")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Pizzeria przy Dworcowej" + "\n" + "Kawiarnia na Rogu" + "\n" + "Włoskie specjały" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("tak") && weganska.equals("nie") && bezglutenowa.equals("tak")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Pizzeria przy Dworcowej" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("tak") && weganska.equals("tak") && bezglutenowa.equals("nie")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("nie") && weganska.equals("tak") && bezglutenowa.equals("tak")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("nie") && weganska.equals("nie") && bezglutenowa.equals("tak")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Pizzeria przy Dworcowej" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("nie") && weganska.equals("tak") && bezglutenowa.equals("nie")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Kawiarnia na Rogu" + "\n" + "Kuchnia u Szefa");
        } else if (wegatarianska.equals("nie") && weganska.equals("nie") && bezglutenowa.equals("nie")) {
            System.out.println("Możecie wybrac się do:" + "\n" + "Luksusowe Burgery u Jacka" + "\n" + "Pizzeria przy Dworcowej" + "\n" + "Kawiarnia na Rogu" + "\n" + "Włoskie Specjały" + "\n" + "Kuchnia u Szefa");
        } else {
            System.out.println("Nie możecie iśc do żadnej");
        }
        }
}