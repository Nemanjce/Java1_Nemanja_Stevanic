package media;

public class Radio {

    private double fmFrequency;
    private double amFrequency;
    private String band;

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

    public String getBand() {

        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

}
