
import java.util.Scanner;


public class MahasiswaDemo18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa18[] arrayOfMahasiswa18 = new Mahasiswa18[3];
        String dummy;

        // Modifikasi poin 4
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa18[i] = new Mahasiswa18();
            arrayOfMahasiswa18[i].nim = input.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa18[i].nama = input.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa18[i].kelas = input.nextLine();
            System.out.print("IPK     : ");
            dummy = input.nextLine();
            arrayOfMahasiswa18[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------------");
        }
        // arrayOfMahasiswa18[0] = new Mahasiswa18();
        // arrayOfMahasiswa18[0].nim = "244107060033";
        // arrayOfMahasiswa18[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa18[0].kelas = "SIB-1E";
        // arrayOfMahasiswa18[0].ipk = (float) 3.75;

        // arrayOfMahasiswa18[1] = new Mahasiswa18();
        // arrayOfMahasiswa18[1].nim = "2341720172";
        // arrayOfMahasiswa18[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa18[1].kelas = "TI-2A";
        // arrayOfMahasiswa18[1].ipk = (float) 3.36;

        // arrayOfMahasiswa18[2] = new Mahasiswa18();
        // arrayOfMahasiswa18[2].nim = "244107023006";
        // arrayOfMahasiswa18[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiswa18[2].kelas = "TI-2E";
        // arrayOfMahasiswa18[2].ipk = (float) 3.80;


        // Modifikasi poin 5
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            // System.out.println("NIM     : " + arrayOfMahasiswa18[i].nim);
            // System.out.println("Nama    : " + arrayOfMahasiswa18[i].nama);
            // System.out.println("Kelas   : " + arrayOfMahasiswa18[i].kelas);
            // System.out.println("ipk     : " + arrayOfMahasiswa18[i].ipk);
            // System.out.println("---------------------------------------");
            arrayOfMahasiswa18[i].cetakInfo();
        }
        // System.out.println("Data Mahasiswa ke-1");
        // System.out.println("NIM     : " + arrayOfMahasiswa18[0].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa18[0].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa18[0].kelas);
        // System.out.println("ipk     : " + arrayOfMahasiswa18[0].ipk);
        // System.out.println("---------------------------------------");
        // System.out.println("NIM     : " + arrayOfMahasiswa18[1].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa18[1].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa18[1].kelas);
        // System.out.println("ipk     : " + arrayOfMahasiswa18[1].ipk);
        // System.out.println("---------------------------------------");
        // System.out.println("NIM     : " + arrayOfMahasiswa18[2].nim);
        // System.out.println("Nama    : " + arrayOfMahasiswa18[2].nama);
        // System.out.println("Kelas   : " + arrayOfMahasiswa18[2].kelas);
        // System.out.println("ipk     : " + arrayOfMahasiswa18[2].ipk);
        // System.out.println("---------------------------------------");

    }

}
