
import java.util.Scanner;

public class DosenDemo18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dosen18[] arrayOfDosen18 = new Dosen18[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        System.out.println("======= Input Data Dosen ======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                 : ");
            kode = input.nextLine();
            System.out.print("Nama                 : ");
            nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P)  : ");
            dummy = input.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("L") ? true : false;
            System.out.print("Usia                 : ");
            dummy = input.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfDosen18[i] = new Dosen18(kode, nama, jenisKelamin, usia);
        }
        int data = 0;
        for (Dosen18 dosen : arrayOfDosen18) {
            System.out.println("Data Dosen ke-" + data++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("---------------------------------------");
        }

        DataDosen18 dataDosen18 = new DataDosen18();
        dataDosen18.dataSemuaDosen(arrayOfDosen18);
        dataDosen18.jumlahDosenPerJenisKelamin(arrayOfDosen18);
        dataDosen18.rerataUsiaDosenPerJenisKelamin(arrayOfDosen18);
        dataDosen18.infoDosenPalingTua(arrayOfDosen18);
    }

}
