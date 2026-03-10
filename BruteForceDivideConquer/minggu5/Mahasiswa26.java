package BruteForceDivideConquer.minggu5;

public class Mahasiswa26 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Mahasiswa26(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS =nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public void tampildata(){
    System.out.println("Nama            : "+ nama);
    System.out.println("Nim             : "+ nim);
    System.out.println("Tahun Masuk     : "+ tahunMasuk);
    System.out.println("UTS             : "+ nilaiUTS);
    System.out.println("UAS             : "+ nilaiUAS);

    }
}



















































    // static class Mahasiswa {
    //     String nama;
    //     String nim;
    //     int tahunMasuk;
    //     int nilaiUTS;
    //     int nilaiUAS;

    //     Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
    //         this.nama = nama;
    //         this.nim = nim;
    //         this.tahunMasuk = tahunMasuk;
    //         this.nilaiUTS = nilaiUTS;
    //         this.nilaiUAS = nilaiUAS;
    //     }
    // }

    
    // public static int maxUTS(Mahasiswa[] arr, int left, int right) {
    //     if (left == right) {
    //         return arr[left].nilaiUTS;
    //     }
    //     int mid = (left + right) / 2;
    //     int maxKiri = maxUTS(arr, left, mid);
    //     int maxKanan = maxUTS(arr, mid + 1, right);
    //     return Math.max(maxKiri, maxKanan);
    // }


    // public static int minUTS(Mahasiswa[] arr, int left, int right) {
    //     if (left == right) {
    //         return arr[left].nilaiUTS;
    //     }
    //     int mid = (left + right) / 2;
    //     int minKiri = minUTS(arr, left, mid);
    //     int minKanan = minUTS(arr, mid + 1, right);
    //     return Math.min(minKiri, minKanan);
    // }

    
    // public static double rataUAS(Mahasiswa[] arr) {
    //     int total = 0;
    //     for (Mahasiswa m : arr) {
    //         total += m.nilaiUAS;
    //     }
    //     return (double) total / arr.length;
        
    // } 
// }

