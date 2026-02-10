package Jobsheet1;
import java.util.Scanner;

public class Tugas1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        char[] KODE = new char[10];
        char[][] KOTA = new char[10][12];
        
        System.out.println("=== PROGRAM PENCARIAN KOTA BERDASARKAN KODE PLAT NOMOR ===");
        System.out.println("A,B,D,E,F,G,H,L,N,T");
        KODE[0] = 'A';  
        KODE[1] = 'B';  
        KODE[2] = 'D';  
        KODE[3] = 'E';  
        KODE[4] = 'F';  
        KODE[5] = 'G';  
        KODE[6] = 'H';  
        KODE[7] = 'L';  
        KODE[8] = 'N';  
        KODE[9] = 'T';  
        
        
        char[] kota0 = {'B','A','N','T','E','N'};
        for (int j = 0; j < kota0.length; j++) {
            KOTA[0][j] = kota0[j];
        }
        
      
        char[] kota1 = {'J','A','K','A','R','T','A'};
        for (int j = 0; j < kota1.length; j++) {
            KOTA[1][j] = kota1[j];
        }
        
   
        char[] kota2 = {'B','A','N','D','U','N','G'};
        for (int j = 0; j < kota2.length; j++) {
            KOTA[2][j] = kota2[j];
        }
        
  
        char[] kota3 = {'C','I','R','E','B','O','N'};
        for (int j = 0; j < kota3.length; j++) {
            KOTA[3][j] = kota3[j];
        }
        
       
        char[] kota4 = {'B','O','G','O','R'};
        for (int j = 0; j < kota4.length; j++) {
            KOTA[4][j] = kota4[j];
        }
        
     
        char[] kota5 = {'P','E','K','A','L','O','N','G','A','N'};
        for (int j = 0; j < kota5.length; j++) {
            KOTA[5][j] = kota5[j];
        }
        
   
        char[] kota6 = {'S','E','M','A','R','A','N','G'};
        for (int j = 0; j < kota6.length; j++) {
            KOTA[6][j] = kota6[j];
        }
        
    
        char[] kota7 = {'S','U','R','A','B','A','Y','A'};
        for (int j = 0; j < kota7.length; j++) {
            KOTA[7][j] = kota7[j];
        }
        
     
        char[] kota8 = {'M','A','L','A','N','G'};
        for (int j = 0; j < kota8.length; j++) {
            KOTA[8][j] = kota8[j];
        }
        
  
        char[] kota9 = {'T','E','G','A','L'};
        for (int j = 0; j < kota9.length; j++) {
            KOTA[9][j] = kota9[j];
        }
        
       
        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char inputKode = sc.next().toUpperCase().charAt(0);
        
     
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }
        }
        
       
        if (index != -1) {
            System.out.print("Kota untuk kode plat " + inputKode + ": ");
            
            for (int j = 0; j < KOTA[index].length; j++) {
                if (KOTA[index][j] != 0) { 
                    System.out.print(KOTA[index][j]);
                }
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan.");
    
        }
    }
}
