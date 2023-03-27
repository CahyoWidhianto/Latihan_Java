package OOP.BangunRuang;

public class Bola extends BangunRuang {
    private double jari_jari;

    public Bola(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public Bola() {
    }

    @Override
    public double luas() {
       return Math.PI * Math.pow(jari_jari,2);
    }

    @Override
    public double volume() {
        return 3/4 * Math.PI * Math.pow(jari_jari, 3);
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    
}
