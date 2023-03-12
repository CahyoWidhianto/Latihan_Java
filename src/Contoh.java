import java.util.Scanner;

public class Contoh {

  public static void PersegiPanjang() {

    System.out.println("Luas & Keliling Persegi Panjang");
    System.out.println("===============================");

    int p, l, luas, keliling;
    Scanner panjang = new Scanner(System.in);
    Scanner lebar = new Scanner(System.in);

    System.out.print("Masukkan panjang persegi = ");
    p = panjang.nextInt();
    System.out.print("Masukkan lebar persegi = ");
    l = lebar.nextInt();

    System.out.println("");

    luas = p * l;
    System.out.println("Luasnya adalah p*l = " + luas);
    keliling = 2 * (p + l);
    System.out.println("Kelilingnya adalah 2*(p+l) = " + keliling);
  }

  public static void Persegi() {
    System.out.println("Luas & Keliling Persegi");
    System.out.println("=======================");

    int s, luas, keliling;
    Scanner sisi = new Scanner(System.in);

    System.out.print("Masukkan sisi persegi = ");
    s = sisi.nextInt();

    System.out.println("");

    luas = s * s;
    System.out.println("Luasnya adalah s*s = " + luas);
    keliling = 4 * s;
    System.out.println("Kelilingnya adalah 4*s = " + keliling);
  }

  public static void Segitiga() {
    System.out.println("Luas & Keliling Segitiga");
    System.out.println("========================");

    int s, a, t, keliling;
    double luas;
    Scanner sisi = new Scanner(System.in);
    Scanner alas = new Scanner(System.in);
    Scanner tinggi = new Scanner(System.in);

    System.out.print("Masukkan sisi segitiga = ");
    s = sisi.nextInt();
    System.out.print("Masukkan alas segitiga = ");
    a = alas.nextInt();
    System.out.print("Masukkan tinggi seitiga = ");
    t = tinggi.nextInt();

    System.out.println("");

    luas = 0.5 * a * t;
    System.out.println("Luasnya adalah 1/2 a*t = " + luas);
    keliling = s + s + s;
    System.out.println("Kelilingnya adalah s+s+s = " + keliling);
  }

  public static void JajarGenjang() {
    System.out.println("Luas & Keliling Jajar Genjang");
    System.out.println("=============================");

    int s, a, t, luas, keliling;
    Scanner sisi = new Scanner(System.in);
    Scanner alas = new Scanner(System.in);
    Scanner tinggi = new Scanner(System.in);

    System.out.print("Masukkan sisi jajar genjang = ");
    s = sisi.nextInt();
    System.out.print("Masukkan alas jajar genjang = ");
    a = alas.nextInt();
    System.out.print("Masukkan tinggi jajar genjang = ");
    t = tinggi.nextInt();

    System.out.println("");

    luas = a * t;
    System.out.println("Luasnya adalah a*t = " + luas);
    keliling = 2 * (a + s);
    System.out.println("Kelilingnya adalah 2*(a+s) = " + keliling);
  }

  public static void BelahKetupat() {
    System.out.println("Luas & Keliling Belah Ketupat");
    System.out.println("=======================");

    double luas;
    int s, d1, d2, keliling;
    Scanner sisi = new Scanner(System.in);
    Scanner diagonal1 = new Scanner(System.in);
    Scanner diagonal2 = new Scanner(System.in);

    System.out.print("Masukkan sisi belah ketupat = ");
    s = sisi.nextInt();
    System.out.print("Masukkan diagonal1 belah ketupat = ");
    d1 = diagonal1.nextInt();
    System.out.print("Masukkan diagonal2 belah ketupat = ");
    d2 = diagonal2.nextInt();

    System.out.println("");

    luas = 0.5 * d1 * d2;
    System.out.println("Luasnya adalah 1/2*d1*d2 = " + luas);
    keliling = 4 * s;
    System.out.println("Kelilingnya adalah 4*s = " + keliling);
  }

  public static void Lingkaran() {
    System.out.println("Luas & Keliling Lingkaran");
    System.out.println("=======================");

    double phi, r, luas, keliling;
    int d;
    Scanner diameter = new Scanner(System.in);

    System.out.print("Masukkan diameter lingkaran = ");
    d = diameter.nextInt();

    System.out.println("");

    phi = 3.14;
    r = d / 2;
    luas = phi * r * r;
    System.out.println("Luasnya adalah phi*r*r = " + luas);
    keliling = phi * d;
    System.out.println("Kelilingnya adalah phi*d = " + keliling);
  }

  public static void LayangLayang() {
    System.out.println("Luas & Keliling Layang-Layang");
    System.out.println("=======================");

    double luas;
    int s1, s2, d1, d2, keliling;
    Scanner sisi1 = new Scanner(System.in);
    Scanner sisi2 = new Scanner(System.in);
    Scanner diagonal1 = new Scanner(System.in);
    Scanner diagonal2 = new Scanner(System.in);

    System.out.print("Masukkan sisi 1 layang-layang = ");
    s1 = sisi1.nextInt();
    System.out.print("Masukkan sisi 2 layang-layang = ");
    s2 = sisi2.nextInt();
    System.out.print("Masukkan diagonal1 layang-layang = ");
    d1 = diagonal1.nextInt();
    System.out.print("Masukkan diagonal2 layang-layang = ");
    d2 = diagonal2.nextInt();

    System.out.println("");

    luas = 0.5 * d1 * d2;
    System.out.println("Luasnya adalah 1/2*d1*d2 = " + luas);
    keliling = 2 * (s1 + s2);
    System.out.println("Kelilingnya adalah 2*(s1+s2) = " + keliling);
  }

  public static void main(String[] args) {
    // Task Fundamental Java - Membuat aplikasi perhitungan rumus luas & keliling
    System.out.println("*************************");
    System.out.println("Name  = Fuad Zein");
    System.out.println("Tugas = Fundamental Java");
    System.out.println("*************************");
    System.out.println("");

    System.out.println("=====================================================");
    System.out.println("# Aplikasi Perhitungan Luas & Keliling Bangun Datar #");
    System.out.println("=====================================================");
    System.out.println("");

    int tipe;
    Scanner pilih = new Scanner(System.in);

    System.out.println("Daftar Pilihan: ");
    System.out.println("===============================");
    System.out.println("1. Persegi Panjang");
    System.out.println("2. Persegi");
    System.out.println("3. Segitiga");
    System.out.println("4. Jajar Genjang");
    System.out.println("5. Belah Ketupat");
    System.out.println("6. Lingkaran");
    System.out.println("7. Layang-Layang");
    System.out.println("===============================");
    System.out.println("");

    System.out.print("Masukkan pilihan: ");
    tipe = pilih.nextInt();

    System.out.println("");

    switch (tipe) {

      case 1:
        PersegiPanjang();
        break;

      case 2:
        Persegi();
        break;

      case 3:
        Segitiga();
        break;

      case 4:
        JajarGenjang();
        break;

      case 5:
        BelahKetupat();
        break;

      case 6:
        Lingkaran();
        break;

      case 7:
        LayangLayang();
        break;

      default:
        System.out.println("Maaf, input tidak ada");
        break;
    }
  }
}