
public class MataKuliah18 {

    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    
    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMk);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;

    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }

    
    public void Matakuliah18(String kdMk, String nm, int sks, int jmlhJam) {
        kodeMk = kdMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlhJam;
    }
}
