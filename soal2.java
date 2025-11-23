package pertemuan7;

import java.util.Scanner;

public class soal2 {

    static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();

        int keliling = hitungKeliling(p, l);
        System.out.println("Keliling persegi panjang = " + keliling);
    }
}
