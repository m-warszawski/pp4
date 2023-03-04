import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tekst {
    public static void dopiszDoPliku(String linia) {
        File plik = new File("tekst.txt");
        try {
            FileWriter myWriter = new FileWriter("tekst.txt", true);
            myWriter.write(linia + "\n");
            myWriter.close();
            System.out.println("Dodano do pliku");
        } catch (IOException e) {
            System.out.println("BŁĄD!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        dopiszDoPliku("Hello World");
    }
}
