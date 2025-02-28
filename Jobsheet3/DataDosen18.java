
public class DataDosen18 {

    public void dataSemuaDosen(Dosen18[] arrayOfDosen18) {
        System.out.println("======= Data Semua Dosen ======");
        for (int i = 0; i < arrayOfDosen18.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode                 : " + arrayOfDosen18[i].kode);
            System.out.println("Nama                 : " + arrayOfDosen18[i].nama);
            System.out.println("Jenis Kelamin (L/P)  : " + (arrayOfDosen18[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                 : " + arrayOfDosen18[i].usia);
            System.out.println("---------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen18) {
        int pria = 0, wanita = 0;
        System.out.println("======= Jumlah Dosen Per Jenis Kelamin ======");
        for (int i = 0; i < arrayOfDosen18.length; i++) {
            if (arrayOfDosen18[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen18) {
        int usiaPria = 0, usiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;
        double rataPria, rataWanita;
        System.out.println("======= Rerata Usia Dosen Per Jenis Kelamin ======");
        for (int i = 0; i < arrayOfDosen18.length; i++) {
            if (arrayOfDosen18[i].jenisKelamin) {
                usiaPria += arrayOfDosen18[i].usia;
                jmlPria++;
            } else {
                usiaWanita += arrayOfDosen18[i].usia;
                jmlWanita++;
            }
            System.out.println();
        }

        rataPria = (double) usiaPria / jmlPria;
        rataWanita = (double) usiaWanita / jmlWanita;
        System.out.println("Rata-rata Usia Dosen Pria : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
        System.out.println();
    }

    public void infoDosenPalingTua(Dosen18[] arrayOfDosen18) {
        System.out.println("======= Informasi Dosen Paling Tua ======");
        Dosen18 tertua = arrayOfDosen18[0];
        for (int i = 0; i < arrayOfDosen18.length; i++) {
            if (arrayOfDosen18[i].usia > tertua.usia) {
                tertua = arrayOfDosen18[i];
            }
        }
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
    }

    public void infoDosenPalingMuda(Dosen18[] arrayOfDosen18) {
        System.out.println("======= Informasi Dosen Paling Muda ======");
        Dosen18 termuda = arrayOfDosen18[0];
        for (int i = 0; i < arrayOfDosen18.length; i++) {
            if (arrayOfDosen18[i].usia < termuda.usia) {
                termuda = arrayOfDosen18[i];
            }
        }
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
    
    
    }
}
