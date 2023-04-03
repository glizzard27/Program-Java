// Muhammad Fajar Baihaqi_50421950
// NPM : Genap 

// Import Library
import java.util.Scanner;

// Membuat Class Bernama Bangun Ruang
class BangunRuang {

    // Property
    public int sisi;
    public int panjang;
    public int lebar;
    public int tinggi;
    public double jarijari;

    // constructor
    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;;
    }

    public BangunRuang(double jarijari) {
        this.jarijari = jarijari;
    }

        // Methods hitungVolume (Overloading)
        // Method Rumus Menghitung volume kubus
        public int hitungVolume(Integer sisi) {
            return sisi * sisi * sisi;
        }

        // Method Rumus Menghitung volume balok
        public int hitungVolume(Integer panjang, Integer lebar, Integer tinggi) {
            return panjang * lebar * tinggi;
        }

        // Method Rumus Menghitung volume bola
        public double hitungVolume(double jarijari) {
            return 4.0 / 3.0 * Math.PI * jarijari * jarijari * jarijari;
}
}
//  Class Utama yang akan dijalankan
public class act2 {
    public static void main(String[] args) {
        try (Scanner act2 = new Scanner(System.in)) {

            // Program Kubus
            System.out.println("--- Program Menghitung Volume Kubus ---");
            System.out.print("Masukkan panjang sisi kubus: ");
            Integer sisi = act2.nextInt();
            BangunRuang kubus = new BangunRuang(sisi);
            int volumeKubus = kubus.hitungVolume(sisi);
            System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volumeKubus + "\n");

            // Program Balok
            System.out.println("--- Program Menghitung Volume Kubus ---");
            System.out.print("Masukkan panjang balok: ");
            int panjang = act2.nextInt();
            System.out.print("Masukkan lebar balok: ");
            int lebar = act2.nextInt();
            System.out.print("Masukkan tinggi balok: ");
            int tinggi = act2.nextInt();
            BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);
            int volumeBalok = balok.hitungVolume(panjang, lebar, tinggi);
            System.out.println("Volume balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi
                    + " adalah " + volumeBalok + "\n");

            // Program Bola
            System.out.println("--- Program Menghitung Volume Kubus ---");
            System.out.print("Masukkan jari-jari bola: ");
            double jarijari = act2.nextDouble();
            BangunRuang bola = new BangunRuang(jarijari);
            double volumeBola = bola.hitungVolume(jarijari);
            System.out.println("Volume bola dengan jari-jari " + jarijari + " adalah " + volumeBola + "\n");

        }
    }
}
