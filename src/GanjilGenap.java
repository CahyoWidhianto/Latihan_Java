
import java.util.*;
public class GanjilGenap {
    public static void main(String[] args) {
       menu();
    }

    static void cekGanjilGenap(){
        Scanner scan=new Scanner(System.in);
        int bil;
        System.out.print("Masukan Bilangan yang ingin dicek : ");
        bil=scan.nextInt();
        if (bil > 0){
            if (bil%2<=0){
                System.out.println("genap");
            }else {
                System.out.println("ganjil");
            }
        }else{
            System.out.println("Invalid Input!!");
        }
        System.out.println("================================================================");
    }

    static void printGanjilGenap(int limit,String pilihan){
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilihan (Ganjil/Genap) : ");
        pilihan = scan.nextLine();
        switch(pilihan){
            case "Ganjil":
                System.out.print("Masukan limit : ");
                limit=scan.nextInt();
                int a = 1;
                System.out.println("Print Bilangan " + a + " - " + limit);
                if(limit >0){
                    for (; a <limit; a+=2){
                        System.out.print(a+", ");
                    }
                }else{
                    System.out.println("Input Limit tidak Valid!!");
                }
                System.out.println("");
            break;
            case "Genap":
                System.out.print("Masukan limit : ");
                limit=scan.nextInt();
                int b = 2;
                System.out.println("Print Bilangan " + b + "- " + limit);
                    if(limit>0){
                        for (; b <=limit; b+=2){
                            System.out.print(b+", ");
                        }
                    }else{
                        System.out.println("Input Limit tidak Valid!!");
                    }
                    System.out.println("");
            break;
            default:
                System.out.println("Input Pilihan tidak Valid!!");
        }
        System.out.println("================================================================");
    }

    static void menu(){
        System.out.println("================================================================");
        System.out.println("                      MENU GANJIL GENAP  ");
        System.out.println("----------------------------------------------------------------");

        int menu;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Cek Ganjil Genap");
        System.out.println("2. Print Ganjil/Genap(dengan limit)");
        System.out.println("3. Exit");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        
        System.out.print("Pilihan : ");
        menu = scan.nextInt();


        
            switch(menu){
                case 1:
                    cekGanjilGenap();
                break;
                case 2: 
                    printGanjilGenap(0, null);
                break;
                case 3:
                    System.exit(menu);
            }

    

    }  
       
}
