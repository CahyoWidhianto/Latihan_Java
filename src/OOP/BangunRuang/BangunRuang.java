package OOP.BangunRuang;

public abstract class BangunRuang {
    public abstract double luas();
    public abstract double volume();

    public void print(){
        System.out.println("Luas : " + luas());
        System.out.println("Volume : " + volume());
        
    }

}
