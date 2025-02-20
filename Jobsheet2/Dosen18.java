
public class Dosen18 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        
    }

    int hitungMasaKerja(int thnSkrg) {
        if (thnSkrg >= tahunBergabung) {
            thnSkrg = thnSkrg - tahunBergabung;
        } else {
            System.out.println("Tahun tidak valid");
        }
        return thnSkrg;
    }

    void ubahKeahlian (String bidang){

    }

}
