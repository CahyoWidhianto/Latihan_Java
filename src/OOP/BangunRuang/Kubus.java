package OOP.BangunRuang;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
    }

    @Override
    public double luas() {
        return 6*Math.pow(sisi, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    
}
