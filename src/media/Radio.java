package media;

public class Radio {

    private double fmFrequency = 91.8;
    private double amFrequency = 600;
    private char band;

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public double getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(double amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {

        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }

    public Radio() {
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'A';

    }

    public Radio(double fmFrequency, double amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public void showData() {
        System.out.println("FM freq. is : " + this.fmFrequency);
        System.out.println("AM Frequency is : " + this.amFrequency);
        System.out.println("Band is : " + this.band);

        System.out.println("");
    }
}
