package Jobsheet1;
import java.util.Scanner;

public class PraktikumArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nilai;
        String [] mapel = new String[8];
        int [] nilaiAngka = new int [8];
        String [] nilaiHuruf = new String [8];
        double [] bobot = new double [8];
        int  [] jmlhsks = new int [8];

        System.out.println("======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================================");
        
        for(int i = 0; i < mapel.length; i++){
            System.out.print("Masukkan nama mata pelajaran ke-" + (i + 1) + ": ");
            mapel[i] = sc.nextLine();
            System.out.print("Masukkan bobot sks : ");
            jmlhsks[i] = sc.nextInt();
            sc.nextLine(); 
        }
            System.out.println("=======================================");

        for(int i = 0; i < mapel.length; i++){
            System.out.print("Masukkan nilai " + mapel[i] + ": ");
            while(true){
                nilai = sc.nextInt();
                if(nilai < 0 || nilai > 100){
                    System.out.print("Nilai tidak valid. Masukkan nilai " + mapel[i] + " kembali: ");
                } else {
                    break;
                }
            }
            nilaiAngka[i] = nilai;


            if (nilai > 80 && nilai <= 10) {
                nilaiHuruf [i] = "A";
                bobot [i] = 4.0;
            } else if (nilai > 73) {
                nilaiHuruf [i] ="B+";
                bobot [i] = 3.5;
            } else if (nilai > 65) {
                nilaiHuruf [i] = "B";
                bobot [i] = 3.0;
            } else if (nilai > 60) {
                nilaiHuruf [i] = "C+";
                bobot [i] = 2.5;
            } else if (nilai > 50){
                nilaiHuruf [i] = "C";
                bobot [i] = 2.0;
            } else if (nilai > 39) {
                nilaiHuruf [i] = "D";
                bobot [i] = 1.0;
            } else {
                nilaiHuruf [i] = "E";
                bobot [i] = 0.0;
            }
        }
         
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("=============");
        System.out.println();
        System.out.println("| MK    | Nilai Angka | Nilai Huruf | Bobot Nilai |");
        System.out.println("");
     
        for(int i = 0; i < mapel.length; i++){
            System.out.printf("| %-40s | %-10.2f | %-11s | %-11.2f |\n", 
                mapel[i], (double)nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }
        
        
        double totalbobot = 0;
        int totalSks = 0;
        
        for(int i = 0; i < mapel.length; i++){
            totalbobot += bobot[i] * jmlhsks[i];
            totalSks += jmlhsks[i];
        }
        
        double ipSemester = totalbobot / totalSks;
        
        System.out.printf("\nIP : %.2f\n", ipSemester);
    }
    }
    
