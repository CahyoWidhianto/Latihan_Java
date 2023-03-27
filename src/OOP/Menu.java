package OOP;

import java.util.Scanner;

import OOP.BangunDatar.Lingkaran;
import OOP.BangunDatar.Persegi;
import OOP.BangunDatar.PersegiPanjang;
import OOP.BangunRuang.Balok;
import OOP.BangunRuang.Bola;
import OOP.BangunRuang.Kubus;

public class Menu {
    public static void main(String[] args) {
        menu();

    }

    static void menuBangunDatar() {
        System.out.println("Daftar Pilihan Bangun Datar ");
        System.out.println("===============================");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Exit");
        System.out.println("-------------------------------");
    }

    static void BangunDatar() {
        menuBangunDatar();
        System.out.print("Masukan Pilihan : ");
        Scanner s = new Scanner(System.in);
        int pilihan;
        pilihan = s.nextInt();
        do {
            if (pilihan == 1) {
                System.out.print("Masukan panjang persegi panjang : ");
                double l = s.nextDouble();
                System.out.print("Masukan Lebar persegi panjang : ");
                double p = s.nextDouble();
                PersegiPanjang pp = new PersegiPanjang();
                pp.setLebar(l);
                pp.getLebar();
                pp.setPenjang(p);
                pp.getPenjang();
                pp.print();
                System.out.println("-------------------------------");

                BangunDatar();
            } else if (pilihan == 2) {
                System.out.print("masukan sisi Persegi : ");
                double sp = s.nextDouble();
                Persegi p = new Persegi();
                p.setSisi(sp);
                p.getSisi();
                p.print();
                System.out.println("-------------------------------");

                BangunDatar();
            } else if (pilihan == 3) {
                System.out.print("Masukan jari-jari Lingkaran : ");
                double r = s.nextDouble();
                Lingkaran l = new Lingkaran();
                l.setR(r);
                l.getR();
                l.print();
                System.out.println("-------------------------------");

                BangunDatar();
            } else if (pilihan == 4) {
                menu();
            } else if (pilihan == 5) {
                System.exit(pilihan);
            } else {
                System.out.println("Invalid Input");
            }

        } while (pilihan < 6);
    }

    static void MenuBangunRuang() {

        System.out.println("Daftar Pilihan: ");
        System.out.println("===============================");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Bola");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Exit");
        System.out.println("-------------------------------");
        System.out.println("");
    }

    static void BangunRuang() {
        MenuBangunRuang();
        System.out.print("Masukan Pilihan : ");
        Scanner s = new Scanner(System.in);
        int pilihan;
        pilihan = s.nextInt();
        do {
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Panjang Balok : ");
                    double p = s.nextDouble();
                    System.out.print("Masukan Lebar Balok : ");
                    double l = s.nextDouble();
                    System.out.print("Masukan Tinggi Balok : ");
                    double t = s.nextDouble();
                    Balok b = new Balok();
                    b.setLebar(l);
                    b.setPanjang(p);
                    b.setTinggi(t);
                    b.getLebar();
                    b.getPanjang();
                    b.getTinggi();
                    b.print();
                    System.out.println("-------------------------------");

                    BangunRuang();
                    break;
                case 2:
                    System.out.print("Masukan Sisi Kubus : ");
                    double sb = s.nextDouble();
                    Kubus k = new Kubus();
                    k.setSisi(sb);
                    k.getSisi();
                    k.print();
                    System.out.println("-------------------------------");

                    BangunRuang();
                    break;
                case 3:
                    System.out.print("Masukan Jari-jari Bola : ");
                    double r = s.nextDouble();
                    Bola bo = new Bola();
                    bo.setJari_jari(r);
                    bo.getJari_jari();
                    bo.print();
                    System.out.println("-------------------------------");

                    BangunRuang();
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    System.exit(pilihan);
                    break;

            }
        } while (pilihan < 6);
    }

    public static void menu() {
        System.out.println("=========================================================");
        System.out.println("      Ini adalah Menu Bangun datar dan Bangun Ruang");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.println("3. Exit");
        System.out.print("Masukan pilihan : ");
        int menu;
        Scanner s = new Scanner(System.in);
        menu = s.nextInt();
        System.out.println("-------------------------------");
        switch (menu) {
            case 1:
                BangunDatar();
                break;
            case 2:
                BangunRuang();
                break;
            case 3:
                System.exit(menu);
        }
        System.out.println("=========================================================");
    }
}
