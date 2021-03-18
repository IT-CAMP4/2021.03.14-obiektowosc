public class Kwadrat {
    int bok;
    int pole;
    int obw;

    Kwadrat(int a) {
        bok = a;
        pole = a * a;
        obw = 4 * a;
    }

    Kwadrat() {

    }

    void uzupelnijDane(int a) {
        bok = a;
        pole = a * a;
        obw = 4 * a;
    }
}
