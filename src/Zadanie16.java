import java.io.*;


public class Zadanie16 {
    public static void main(String[] args) throws Exception{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Podaj swoje imie i nazwisko");
            String imie = br.readLine();
            System.out.println("Opisz siebie");
            String opis = br.readLine();
            String index = "index.html";
            FileWriter html = new FileWriter(index, true);
            PrintWriter dopis = new PrintWriter(html);
            dopis.println("<center><h1>" + imie + "</h1></center>");
            dopis.print("<hr>" + opis + "<hr>");
            dopis.close();
    }
}
