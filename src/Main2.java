import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        /*KlasaPostaci mag = new KlasaPostaci();
        mag.nazwa = "Mag";
        mag.mana = 500;
        mag.zrecznosc = 7;
        mag.hp = 100;
        mag.sila = 5;

        Kwadrat k = new Kwadrat();
        k.uzupelnijDane(5);
        System.out.println(k.bok);
        System.out.println(k.pole);
        System.out.println(k.obw);


        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.bok);
        System.out.println(kwadrat.pole);
        System.out.println(kwadrat.obw);*/

        /*int a = 8;
        System.out.println(a);

        Kwadrat k = new Kwadrat();
        k.bok = 10;
        System.out.println(k);

        Jakas jakas = new Jakas();

        System.out.println(a);
        System.out.println(k.bok);
        jakas.a(a);
        jakas.b(k);
        System.out.println(a);
        System.out.println(k.bok);*/

        Kwadrat kwadrat1 = new Kwadrat(5);
        Kwadrat kwadrat2 = kwadrat1;

        System.out.println(kwadrat1.bok);
        System.out.println(kwadrat2.bok);

        kwadrat1.bok = 7;

        System.out.println(kwadrat1.bok);
        System.out.println(kwadrat2.bok);

        String tekst = "OK";
        String tekst2 = "OK";

        System.out.println(Integer.toHexString(tekst.hashCode()));
        System.out.println(Integer.toHexString(tekst2.hashCode()));
        System.out.println(tekst);
        System.out.println(tekst2);

        tekst = tekst + " śmiga jak malina !!!";

        System.out.println(tekst);
        System.out.println(tekst2);

        System.out.println(Integer.toHexString(tekst.hashCode()));
        System.out.println(Integer.toHexString(tekst2.hashCode()));

        String jakis = "M";
        jakis = jakis + "a" + "t" + "e" + "u" + "s" + "z";

        StringBuilder sb = new StringBuilder();
        sb.append("M")
                .append("a")
                .append("t")
                .append("e")
                .append("u")
                .append("s")
                .append("z");

        String wynik = sb.toString();

        System.out.println(wynik);
    }
}
