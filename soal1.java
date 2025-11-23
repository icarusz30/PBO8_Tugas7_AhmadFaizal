

//Sebuah class dalam Java merupakan *blueprint* atau cetakan yang berisi atribut dan method. Class belum menjadi sesuatu yang bisa digunakan sebelum dibuatkan
//object. Mekanismenya adalah ketika program dijalankan, kita membuat object dengan menggunakan keyword **new**, misalnya `Orang o = new Orang();`. 
//Pada saat inilah Java menyediakan ruang memori untuk object tersebut dan menyalin struktur yang didefinisikan di dalam class. Setelah menjadi object, 
//barulah data dapat diisi (misalnya `o.nama = "Budi";`) dan method di dalam class dapat dipanggil (misalnya `o.sapa();`). Dengan demikian, class adalah rancangan,
//sedangkan object adalah hasil nyata yang diciptakan dari rancangan tersebut.



package pertemuan7;

class Orang {
    String nama;

    void sapa() {
        System.out.println("Halo, nama saya " + nama);
    }
}
