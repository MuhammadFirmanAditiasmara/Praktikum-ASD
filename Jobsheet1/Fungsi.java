
public class Fungsi {

    public static void main(String[] args) {

        int stock[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int harga[] = {75000, 50000, 60000, 10000};
        int stokcBaru[] = {-1, -2, 0, -5};

        Pendapatan(harga, stock);
        stockRoyalGarden4(stock, stokcBaru);
    }

    public static void Pendapatan(int harga[], int stock[][]) {
        System.out.println("===============================");
        System.out.println("Pendapatan toko bunga setiap cabang");
        System.out.println("===============================");
        for (int i = 0; i < stock.length; i++) {
            double pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden" + (i + 1) + ": " + pendapatan);
        }
        System.out.println();
    }

    public static void stockRoyalGarden4(int stock[][], int stockBaru[]) {
        System.out.println("===============================");
        System.out.println("Data stock bunga RoyalGarden4");
        System.out.println("===============================");
        System.out.println("Stock Awal:");
        System.out.println("==========");
        System.out.println("Aglonema : " + stock[3][0]);
        System.out.println("Keladi : " + stock[3][1]);
        System.out.println("Alocasia : " + stock[3][2]);
        System.out.println("Mawar : " + stock[3][3]);
        System.out.println("===============================");

        System.out.println("Stock Baru:");
        System.out.println("==========");
        for (int j = 0; j < stock[3].length; j++) {
            stock[3][j] += stockBaru[j];

        }
        System.out.println("Aglonema : " + stock[3][0]);
        System.out.println("Keladi : " + stock[3][1]);
        System.out.println("Alocasia : " + stock[3][2]);
        System.out.println("Mawar : " + stock[3][3]);
        System.out.println("===============================");

    }
}
