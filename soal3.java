package pertemuan7;

import java.util.Scanner;

public class soal3 {

    static int hasilAkhir(int bulan, int tanggal) {
        return Integer.parseInt("" + bulan + tanggal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();

        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();

        int hasil = hasilAkhir(bulan, tanggal);

        System.out.println("Hasil akhirnya = " + hasil);
    }
}
