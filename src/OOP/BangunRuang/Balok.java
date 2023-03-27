package OOP.BangunRuang;

public class Balok extends BangunRuang {
    public double panjang, tinggi, lebar;
    public Balok(double panjang, double tinggi, double lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    public Balok() {
    }
    @Override
    public double luas() {
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }
    @Override
    public double volume() {
        return panjang*tinggi*lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    } 
}
