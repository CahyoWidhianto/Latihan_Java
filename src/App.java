import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        printGanjilGenap(0, null);
    }
    static void printGanjilGenap(int limit,String pilihan){
        Scanner s = new Scanner(System.in);
        System.out.print("Pilihan (Ganjil/Genap) : ");
        pilihan = s.nextLine();
        switch(pilihan){
            case "ganjil":
                System.out.print("Masukan limit : ");
                limit=s.nextInt();
                int a;
                    for (a=1; a <limit; a+=2){
                        System.out.print(a+", ");
                    }
                System.out.println("");
            break;
            case "genap":
                System.out.print("Masukan limit : ");
                limit=s.nextInt();
                int b;
                        for (b=2; b <=limit; b+=2){
                            System.out.print(b+", ");
                        }
                    System.out.println("");
            break;
        }
    }
}
