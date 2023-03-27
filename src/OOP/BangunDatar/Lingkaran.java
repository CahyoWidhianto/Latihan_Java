package OOP.BangunDatar;

public class Lingkaran extends bangunDatar {
    private double r;
    
    public Lingkaran(double jari_jari){
        this.r=jari_jari;
    }
    public Lingkaran(){
    }

    @Override
    public double Keliling() {
        return 2 * (Math.PI * r);
    }

    @Override
    public double Luas() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getR() {
        return r;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
}
