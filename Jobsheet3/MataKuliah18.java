
import java.util.Scanner;

public class MataKuliah18 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah18() {

    }

    public MataKuliah18(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner input) {
        System.out.print("Kode       : ");
        this.kode = input.nextLine();
        System.out.print("Nama       : ");
        this.nama = input.nextLine();
        System.out.print("SKS        : ");
        this.sks = input.nextInt();
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = input.nextInt();
        input.nextLine();
        System.out.println("---------------------------------------");
    }

    public void cetakInfo() {

        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------------------");
    }
}
