public class Kwadrat {
    int bok;
    int pole;
    int obw;

    Kwadrat(int bok) {
        this.bok = bok;
        this.pole = bok * bok;
        this.obw = 4 * bok;
    }

    Kwadrat() {

    }

    void uzupelnijDane(int a) {
        this.bok = a;
        this.pole = a * a;
        this.obw = 4 * a;
    }

    Kwadrat copy() {
        Kwadrat copy = new Kwadrat();
        copy.bok = this.bok;
        copy.pole = this.pole;
        copy.obw = this.obw;

        return copy;
    }
}
