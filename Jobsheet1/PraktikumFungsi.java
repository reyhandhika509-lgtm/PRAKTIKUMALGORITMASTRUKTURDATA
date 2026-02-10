package Jobsheet1;

import java.util.Scanner;
public class PraktikumFungsi {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][] stok = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int[] harga = {
                75000,   // Aglonema
                50000,   // Keladi
                60000,   // Alocasia
                10000    // Mawar
        };
         // 1. Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("1. Pendapatan setiap cabang jika semua bunga habis terjual:");
        int[] pendapatan = hitungPendapatan(stok, harga);
        tampilkanPendapatan(pendapatan);
        
        System.out.println("\n2. Status setiap cabang:");
        // 2. Menampilkan status setiap cabang
        tampilkanStatus(pendapatan);
    }
    
    // Fungsi untuk menghitung pendapatan setiap cabang
    public static int[] hitungPendapatan(int[][] stok, int[] harga) {
        int[] pendapatan = new int[stok.length];
        
        for (int i = 0; i < stok.length; i++) {
            int total = 0;
            for (int j = 0; j < stok[i].length; j++) {
                total += stok[i][j] * harga[j];
            }
            pendapatan[i] = total;
        }
        
        return pendapatan;
    }
    
    // Fungsi untuk menampilkan pendapatan setiap cabang
    public static void tampilkanPendapatan(int[] pendapatan) {
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("RoyalGarden %d: Rp%d%n", i + 1, pendapatan[i]);
        }
    }
    
    // Fungsi untuk menampilkan status setiap cabang berdasarkan pendapatan
    public static void tampilkanStatus(int[] pendapatan) {
        for (int i = 0; i < pendapatan.length; i++) {
            String status;
            if (pendapatan[i] > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            System.out.printf("RoyalGarden %d: %s (Rp%d)%n", i + 1, status, pendapatan[i]);
        }
    }

}
