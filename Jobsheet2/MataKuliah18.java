
public class MataKuliah18 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam telah berhasil ditambahkan menjadi " + jumlahJam + " jam");;

    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah berhasil dikurangi menjadi " + jumlahJam + " jam");
        } else {
            System.out.println("Maaf jam tidak dapat dikurangi dikarenakana jumlah jam kurang");
        }
    }

    public MataKuliah18() {

    }

    public MataKuliah18(String mk, String nm, int sks, int jm) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jm;
    }
}
