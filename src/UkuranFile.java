import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Percobaan menggunakan int:
        // int ukuranByte = 3221225472;
        // Error: integer number too large, karena nilai tersebut melebihi batas maksimum int.

        // Menggunakan 1024.0 agar pembagian menghasilkan nilai pecahan (double), bukan pembagian bilangan bulat.
        final double SATU_KB = 1024.0;

        System.out.print("Nama file    : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte): ");
        long ukuranByte = input.nextLong();

        // Perhitungan ukuran file
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Casting double ke int membuang angka di belakang koma.
        int dibulatkanMB = (int) ukuranMB;



        // Menampilkan hasil
        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println(ukuranByte + " byte");
        System.out.printf("%.1f KB%n", ukuranKB);
        System.out.printf("%.1f MB%n", ukuranMB);
        System.out.printf("%.1f GB%n", ukuranGB);

        System.out.println();
        System.out.println("Dibulatkan ke MB : " + dibulatkanMB);


    }
}