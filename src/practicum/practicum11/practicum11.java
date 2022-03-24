package practicum.practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class practicum11 {
    public static void main(String[] args) throws IOException{
        System.out.println("Voer bronbestand in : ");
        Scanner bronBestand = new Scanner(System.in);
        String bronBestandsnaam = bronBestand.nextLine();

        System.out.println("Voer bestemmingsBestand in : ");
        Scanner bestemmingsBestand = new Scanner(System.in);
        String bestemmingsBestandsnaam = bestemmingsBestand.nextLine();

        System.out.println("Voer waarde van 1 USD in euro's in : ");
        Scanner waarde = new Scanner(System.in);
        String euroWaarde = waarde.nextLine();

        String s = null;
        List<String> alleRegels = null;

        try {
            Path path = Path.of("src/practicum/practicum11/" + bronBestandsnaam);
            alleRegels = Files.readAllLines(path);
        for (String product : alleRegels){
            List<String> lst = Arrays.asList(product.split(" : "));
            double berekendeWaarde = 0.0;
            try {
                berekendeWaarde = Double.valueOf(lst.get(1)) * Double.valueOf(euroWaarde);
            }
            catch (Exception e){
                System.out.println("De ingevulde naam van het eurowaarde is ongeldig.");
            }

            s+= lst.get(0) + String.format(Locale.GERMANY,"%.2f",berekendeWaarde) + "\n";

        }
        }
        catch (Exception e){
            System.out.println("De ingevulde naam van het bronbestand is ongeldig.");
        }

        try {
            Path newpath = Path.of("src/practicum/practicum11/" + bestemmingsBestandsnaam);
            BufferedWriter out = Files.newBufferedWriter(newpath);
            out.write(s);
            out.close();
        }
        catch (Exception e){
            System.out.println("De ingevulde naam van het bestemmingsbestand is ongeldig.");
        }

    }
}
