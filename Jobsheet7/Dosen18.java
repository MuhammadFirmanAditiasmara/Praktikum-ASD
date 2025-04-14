
public class Dosen18 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int umur;

    Dosen18() {

    }

    Dosen18(String kd, String nm, boolean jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        umur = age;

    }

    void tampil(){
        System.out.println("Kode\t\t : " + kode);
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Jenis Kelamin\t : " +  (jenisKelamin? "Laki-laki" : "Perempuan"));
        System.out.println("Umur\t\t : " + umur);
    }

    

}
