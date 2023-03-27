package OOP.BangunDatar;

public class PersegiPanjang extends bangunDatar {

    double lebar,panjang;

    public PersegiPanjang(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public PersegiPanjang() {
    }

    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getPenjang() {
        return panjang;
    }
    public void setPenjang(double penjang) {
        this.panjang = penjang;
    }
    @Override
    public double Keliling() {
        return 2*(lebar+panjang);
    }
    @Override
    public double Luas() {
        return panjang*lebar;
    } 
}
