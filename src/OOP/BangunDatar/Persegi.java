package OOP.BangunDatar;

public class Persegi extends bangunDatar {

    protected double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public Persegi() {
    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }

    @Override
    public double Luas() {
        return Math.pow(sisi, sisi);
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    
}
