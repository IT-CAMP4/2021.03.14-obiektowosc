class Kwadrat2 {
    private int bok;
    private int pole;
    private int obw;

    Kwadrat2(int bok) {
        calculateNewObjectState(bok);
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        calculateNewObjectState(bok);
    }

    public int getPole() {
        return pole;
    }

    public int getObw() {
        return obw;
    }

    private void calculateNewObjectState(int bok) {
        this.bok = bok;
        this.pole = bok * bok;
        this.obw = 4 * bok;
    }

    public void wylicz() {
        calculateFirstPart();
        int a = calculateSecondPart();
        calculateThirdPart();
    }

    private void calculateFirstPart() {

    }

    private int calculateSecondPart() {
        return 0;
    }

    private void calculateThirdPart() {

    }
}
