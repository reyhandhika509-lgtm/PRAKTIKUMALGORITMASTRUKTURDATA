 package Jobsheet1;

import java.util.Scanner;

public class PraktikumPemilihan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS ;
        double nilaiAkhir;
       
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();

        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        if (nilaiAkhir > 110 || nilaiTugas < 0 || nilaiKuis < 0 || nilaiUTS < 0 || nilaiUAS < 0 || nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("Nilai yang dimasukkan tidak valid. Silakan coba lagi.");
            System.out.println("================================");
        }
        else if(nilaiAkhir <=110 || nilaiTugas >0 || nilaiKuis >0 || nilaiUTS >0 || nilaiUAS >0) { 
            System.out.println("Nilai Akhir Anda Adalah : " + nilaiAkhir);
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 10) {
                System.out.println("Nilai Huruf : A");
            } else if (nilaiAkhir > 73) {
                System.out.println("Nilai Huruf : B+");
            } else if (nilaiAkhir > 65) {
                System.out.println("Nilai Huruf : B");
            } else if (nilaiAkhir > 60) {
                System.out.println("Nilai Huruf : C+");
            } else if (nilaiAkhir > 50){
                System.out.println("Nilai Huruf : C");
            } else if (nilaiAkhir > 39) {
                System.out.println("Nilai Huruf : D");
            } else {
                System.out.println("Nilai Huruf : E");
            }
            if (nilaiAkhir > 51) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Selamat Anda Tidak Lulus");
            }
            System.out.println("================================");
        }
    }
}