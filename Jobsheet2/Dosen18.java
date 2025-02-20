
public class Dosen18 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        System.out.println("Status Aktif : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        
    }

    int hitungMasaKerja(int thnSkrg) {
        if (thnSkrg >= tahunBergabung) {
            thnSkrg = thnSkrg - tahunBergabung;
            System.out.println("Masa Kerja : " + thnSkrg + " tahun");
        } else {
            System.out.println("Tahun tidak valid");
        }
        return thnSkrg;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen18(){

    }

    public Dosen18(String idDosen, String nama, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
