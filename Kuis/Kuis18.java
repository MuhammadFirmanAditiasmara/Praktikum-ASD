
public class Kuis18 {

    String nim18, nama18;
    double nilaiKuis18, nilaiUTS18, nilaiUAS18;
    public String nim;
    double nilaiAkhhir;

    public Kuis18() {

    }

    void tampilkanInformasi() {
        for (int i = 0; i < 1; i++) {

            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM         :" + nim18);
            System.out.println("Nama        :" + nama18);
            System.out.println("Nilai Kuis  :" + nilaiKuis18);
            System.out.println("Nilai UTS   :" + nilaiUTS18);
            System.out.println("Nilai UAS  :" + nilaiUAS18);
            System.out.println("Nilai UAS  :" + nilaiUAS18);
        }
    }

    double hitungNilaiAkhir(double nilaiAkhir, double nilai18[]) {
        for (int i = 0; i < 10; i++) {

            nilai18[i] = 0;
            nilai18[i] = ((20 / 100.0 * nilaiKuis18) + (35 / 100.0 * nilaiUTS18) + (45 / 100.0 * nilaiUAS18));
            nilaiAkhir = 0;
            nilai18[i] = nilaiAkhir;
        }
        return nilaiAkhir;
    }

    public Kuis18(String nim18, String nama18, double nilaiKuis18, double nilaiUTS18, double nilaiUAS18) {
        this.nim18 = nim18;
        this.nama18 = nama18;
        this.nilaiKuis18 = nilaiKuis18;
        this.nilaiUTS18 = nilaiUTS18;
        this.nilaiUAS18 = nilaiUAS18;
    }

}
