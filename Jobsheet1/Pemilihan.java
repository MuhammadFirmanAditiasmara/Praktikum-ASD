
import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        int nilaiTugas, nilaiKuis, nilaiUAS, nilaiUTS;
        double nilaiAkhir;
        String nilaiHuruf;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan nilai Tugas : ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = input.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        if (nilaiTugas < 0 || nilaiTugas > 100
                || nilaiKuis < 0 || nilaiKuis > 100
                || nilaiUTS < 0 || nilaiUTS > 100
                || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");
        }

        nilaiAkhir = ((nilaiTugas * 20 / 100) + (nilaiKuis * 20 / 100) + (nilaiUTS * 30 / 100) + (nilaiUAS * 30 / 100));
        System.out.println("Nilai AKhir : " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+")
            || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
            || nilaiHuruf.equals("C")
        ) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiHuruf.equals("D")  || nilaiHuruf.equals("E")) {
            System.out.println("ANDA TIDAK LULUS");
        }
        System.out.println("===============================");
        System.out.println("===============================");
    }
}
