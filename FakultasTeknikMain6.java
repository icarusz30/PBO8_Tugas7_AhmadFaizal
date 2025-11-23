package pertemuan7;

import java.util.Scanner;

public class FakultasTeknikMain6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama dosen     : ");
        String nd = input.nextLine();

        System.out.print("Masukkan nama mahasiswa : ");
        String nm = input.nextLine();

        System.out.print("Masukkan nama staff     : ");
        String ns = input.nextLine();

        Dosen6 dosen = new Dosen6(nd);
        Mahasiswa6 mhs = new Mahasiswa6(nm);
        Staff6 staff = new Staff6(ns);


        System.out.println("\n=== Data Civitas Akademika Fakultas Teknik ===");
        dosen.tampil();
        System.out.println();
        mhs.tampil();
        System.out.println();
        staff.tampil();
    }
}
