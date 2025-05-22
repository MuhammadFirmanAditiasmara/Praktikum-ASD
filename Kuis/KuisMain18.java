
public class KuisMain18 {

    public static final double nilaiUTS18 = 0;
    public static double nilaiKuis18;

    public static void main(String[] args) {
        Kuis18[] nilai18 = new Kuis18[3];

        nilai18[0] = new Kuis18("2356", "Aditiasmara", 90.5, 90.0, 90.2);
        nilai18[1] = new Kuis18("2357", "Budi", 85.0, 85.5, 88.0);
        nilai18[2] = new Kuis18("2358", "Cindy", 92.0, 91.5, 93.0);

        for (Kuis18 kuis18 : nilai18) {

            kuis18.tampilkanInformasi();
        }

        // Kuis18 nilai4 = new Kuis18();
        // nilai4.nim18 = "2479";
        // nilai4.nama18 = "Roma";
        // nilai4.nilaiKuis18 = 88.5;
        // nilai4.nilaiUTS18 = 88.4;
        // nilai4.nilaiUAS18 = 80.2;
        // nilai4.tampilkanInformasi();
    }
}
