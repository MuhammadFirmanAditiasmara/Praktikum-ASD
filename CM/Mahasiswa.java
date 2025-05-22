
import java.util.Scanner;

public class Mahasiswa {

    static Scanner input = new Scanner(System.in);
    static Mahasiswa[] list = new Mahasiswa[5];
    static String NIM;
    String nama;
    String prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void dataSemuaMahasiswa() {
        System.out.println("==== DAFTAR MAHASISWA ====");
        list[0] = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        list[1] = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        list[2] = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        list[3] = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");
        list[4] = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                if (i % 2 == 0) {
                    
                    list[i].tampilMahasiswa();
                }
            }
        }
    }

    void tampilMahasiswa() {
        System.out.println("NIM : " + NIM + "| Nama : " + nama + "| Prodi : " + prodi);
    }



    public static void cariNim(Mahasiswa data) {
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa mhs : list) {
            if (mhs != null && mhs.NIM.equalsIgnoreCase(cari)) {
                if (!ditemukan) {
                    System.out.println("Mahasiswa ditemukan: ");
                    ditemukan = true;
                    mhs.tampilMahasiswa();
                }
            }
        }

        if (ditemukan == false) {
            System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
        } 
    }

    public void updateNilai() {
        System.out.println("Masukkan NIM Mahasiswa: ");
        String cari = input.nextLine();
    }

  
}
