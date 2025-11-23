package pertemuan7;

public class soal4 {

    String kalimat1;
 
    public soal4() {
        kalimat1 = "Kami putra dan putri Indonesia";
    }

    void tampilLanjutan() {
        System.out.println("mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("menjunjung bahasa persatuan, bahasa Indonesia.");
    }

    public static void main(String[] args) {
        soal4 sp = new soal4();
        
        System.out.println(sp.kalimat1);
        sp.tampilLanjutan();
    }
}
