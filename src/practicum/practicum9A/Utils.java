package practicum.practicum9A;

import java.util.Locale;

public class Utils {
    public static void main(String[] args) {

        System.out.println(euroBedrag(3.333333));
    }

    public static String euroBedrag(double bedrag){
        return euroBedrag(bedrag,2);
    }

    public static String euroBedrag(double bedrag, int precisie){
        String pr = "%." + precisie + "f";
        return "€" + String.format(Locale.GERMANY,pr,bedrag);
    }
}
