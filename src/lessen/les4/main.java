package lessen.les4;

public class main {
    public static void main(String[] args) {
        Rekening r1 = new Rekening( 12345);
        Rekening r2 = new Rekening( 23456);
        Rekening r3 = null;

        r1.neemOp(25);
        r1.stort(60);
        r2.neemOp(5);
        r2.stort(10);

        //Klant k1 = new Klant("jan");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
