
import java.util.Scanner;

public class Tugas2 {
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        menu();

    }
    public static void menu() {

        while (true) {

            System.out.println("=======================================");
            System.out.println("==== MENU PROGRAM MENGHITUNG KUBUS ====");
            System.out.println("=======================================");
            System.out.println("1. Menghitung Volume Kubus ");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    volume();
                    break;
                case 2:
                    luasPermukaan();
                    break;
                case 3:
                    keliling();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program kami");
                    return;

                default:
                    System.out.println("Menu tidak tersedia. Masukkan kembali dengan benar.");
                    break;
            }
        }
    }
    public static void volume() {
        int volumeKubus;
        int sisi;
        System.out.print("Masukkan panjang sisi kubus : ");
        sisi = input.nextInt();
        
        volumeKubus = sisi*sisi*sisi;
        System.out.println("Volume Kubus : " + volumeKubus);
        

    }
    public static void luasPermukaan() {
        int volumeKubus;
        int sisi;
        System.out.print("Masukkan panjang sisi kubus : ");
        sisi = input.nextInt();
        
        volumeKubus = 6*sisi*sisi;
        System.out.println("Volume Kubus : " + volumeKubus);
        

    }
    public static void keliling() {
        int volumeKubus;
        int sisi;
        System.out.print("Masukkan panjang sisi kubus : ");
        sisi = input.nextInt();
        
        volumeKubus = 12*sisi;
        System.out.println("Volume Kubus : " + volumeKubus);
        

    }
}
