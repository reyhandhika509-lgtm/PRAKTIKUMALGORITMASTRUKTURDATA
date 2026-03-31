package Praktikum05;


public class Dosen26 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen26(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public void tampil() {
        System.out.println(kode + " | " + nama + " | " +
                (jenisKelamin ? "Laki-laki" : "Perempuan") +
                " | " + usia);
    }
}
// public class Dosen26 {
  
//     String kode;
//     String nama;
//     boolean jenisKelamin;
//     int usia;
    
//     Dosen26(){

//     }
//     Dosen26(String kd, String name, boolean jk, int age) {
//         kode = kd;
//         nama = name;
//         jenisKelamin = jk;
//         usia = age;
//     }
    
//     void tampilkanInformasi() {
//         System.out.println("Nama:           "+ nama);
//         System.out.println("Kode:            "+ kode);
//         System.out.println("Jenis Kelamin:  "+ jenisKelamin);
//         System.out.println("Usia:           "+ usia);
//         System.out.println("----------------------");
    
    
//     }
// }
    

