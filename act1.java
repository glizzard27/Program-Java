//Muhammad Fajar Baihaqi_50421950
// NPM : Genap

// Import Library
import java.util.Scanner;

// Class untuk Kubus
class Kubus {
    int sisi;

    // constructor kubus
    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int hitungVolume() {
        return sisi * sisi * sisi;
    }
}

// Class untuk Balok
class Balok {
    int panjang;
    int lebar;
    int tinggi;

    // constructor balok
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int hitungVolume() {
        return panjang*lebar*tinggi;
    }
}

public class act1{
    public static void main(String[] args) {
        try (Scanner act1 = new Scanner(System.in)) {

            //Program Kubus
            System.out.println("--- Program Menghitung Volume Kubus ---");
            // Menginput sisi kubus
            System.out.print("Masukkan panjang sisi kubus: ");
            int sisiKubus = act1.nextInt();
            // membuat objek kubus
            Kubus kubus = new Kubus(sisiKubus);
            // menghitung luas kubus
            int volumeKubus = kubus.hitungVolume();
            // menampilkan hasil perhitungan Volume Kubus
            System.out.println("Hasil Perhitungan Volume Kubus dengan sisi " + sisiKubus + " adalah " + volumeKubus + "\n");


            //Program Balok
            System.out.println("--- Program Menghitung Volume Balok ---");
            // Menginput ukuran balok
            System.out.print("Masukkan panjang balok: ");
            int panjangBalok = act1.nextInt();
            System.out.print("Masukkan lebar balok: ");
            int lebarBalok = act1.nextInt();
            System.out.print("Masukkan tinggi balok: ");
            int tinggiBalok = act1.nextInt();
            // membuat objek balok
            Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
            // menghitung luas kubus dan balok
            int volumeBalok = balok.hitungVolume();
            // menampilkan hasil perhitungan Volume Balok
            System.out.println("Hasil Perhitungan Volume Balok dengan panjang " + panjangBalok + ", lebar " + lebarBalok + 
            ", dan tinggi " + tinggiBalok + " adalah " + volumeBalok);
        }
    }
}