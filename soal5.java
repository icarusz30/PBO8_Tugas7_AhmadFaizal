package pertemuan7;

import java.util.Scanner;

public class soal5 {

    static void panggilDiri(int n) {
        if (n == 0) {
            System.out.println("Selesai!");
            return; 
        }
        System.out.println("Memanggil diri dengan n = " + n);

        panggilDiri(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka untuk mulai rekursi: ");
        int angka = input.nextInt();

        panggilDiri(angka);
    }
}
