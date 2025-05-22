
import java.util.Scanner;

public class Penilaian {

    static Scanner input = new Scanner(System.in);
    Mahasiswa NIM;
    String nama;
    String mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    MataKuliah kodeMK;
    static Penilaian[] list = new Penilaian[5];

    static Penilaian[] unsortedCase = new Penilaian[5];

    static {
        list[0] = new Penilaian("Ali Rahman", "Struktur Data", 80, 85, 90, 0.0);
        list[1] = new Penilaian("Ali Rahman", "Basis Data", 60, 75, 70, 0.0);
        list[2] = new Penilaian("Budi Santoso", "Struktur Data", 75, 70, 80, 0.0);
        list[3] = new Penilaian("Citra Dewi", "Basis Data", 85, 90, 95, 0.0);
        list[4] = new Penilaian("Citra Dewi", "Desain Web", 80, 90, 65, 0.0);

        unsortedCase[0] = new Penilaian("Ali Rahman", "Struktur Data", 80, 85, 90, 0.0);
        unsortedCase[1] = new Penilaian("Ali Rahman", "Basis Data", 60, 75, 70, 0.0);
        unsortedCase[2] = new Penilaian("Budi Santoso", "Struktur Data", 75, 70, 80, 0.0);
        unsortedCase[3] = new Penilaian("Citra Dewi", "Basis Data", 85, 90, 95, 0.0);
        unsortedCase[4] = new Penilaian("Citra Dewi", "Desain Web", 80, 90, 65, 0.0);
    }

    public Penilaian() {
    }

    public Penilaian(String nama, String mataKuliah, double tugas, double uts, double uas, double nilaiAkhir) {

        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiAkhir = nilaiAkhir;
    }

    void dataUnsorted() {
        System.out.println("=== DATA PENILAIAN === ");
        for (int i = 0; i < list.length; i++) {
            unsortedCase[i].hitungNilaiAkhir();
            unsortedCase[i].tampilPenilaian();
        }
        System.out.println();
    }

    void dataPenilaian() {
        System.out.println("=== DATA PENILAIAN === ");
        for (int i = 0; i < list.length; i++) {
            list[i].hitungNilaiAkhir();
            list[i].tampilPenilaian();
        }
        System.out.println();
    }

    void SelectionSort() {
        for (int v = 0; v < list.length; v++) {
            list[v].hitungNilaiAkhir();
            list[v].nilaiAkhir += nilaiAkhir;
        }

        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if ((list[j].nilaiAkhir) > (list[idxMin].nilaiAkhir)) {
                    idxMin = j;
                }
            }
            Penilaian tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
        dataPenilaian();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilPenilaian() {
        System.out.println(nama + " | " + mataKuliah + " | Nilai Akhir: " + nilaiAkhir);
    }

    public void updateNilai() {
        System.out.println("=== UPDATE NILAI ===");

        System.out.print("Masukkan NIM Mahasiswa: ");
        String cariNIM = input.nextLine();

        System.out.print("Masukkan Kode Mata Kuliah: ");
        String cariKodeMk = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < list.length; i++) {
            String kodeMK = cariKodeMK(list[i].mataKuliah);

            if (NIM.equals(cariNIM) && kodeMK.equalsIgnoreCase(cariKodeMk)) {

                System.out.println("Data ditemukan:");
                list[i].tampilPenilaian();

                System.out.print("Masukkan Nilai Tugas Baru: ");
                list[i].nilaiTugas = input.nextDouble();

                System.out.print("Masukkan Nilai UTS Baru: ");
                list[i].nilaiUTS = input.nextDouble();

                System.out.print("Masukkan Nilai UAS Baru: ");
                list[i].nilaiUAS = input.nextDouble();

                list[i].hitungNilaiAkhir();
                System.out.println("Data berhasil diperbarui.");
                list[i].tampilPenilaian();

                ditemukan = true;
                break;
            } else {
                System.out.println("Data dengan nama dan kode mata kuliah tersebut tidak ditemukan.");

            }
        }

    }

    public static String cariKodeMK(String namaMatkul) {
        switch (namaMatkul.toLowerCase()) {
            case "struktur data":
                return "MK001";
            case "basis data":
                return "MK002";
            case "desain web":
                return "MK003";
            default:
                return "";
        }
    }

}
