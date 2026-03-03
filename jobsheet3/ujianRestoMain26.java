package jobsheet3;

import java.util.Scanner;


public class ujianRestoMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu yang ingin ditambahkan: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();
        
        ujianResto26[] arrayOfMenu = new ujianResto26[jumlahMenu];
        
        System.out.println("Masukkan data pemesan");
        System.out.print("Nama Pemesan : ");
        String namaPemesan = sc.nextLine();
     
       
         for(int i=0; i <jumlahMenu; i++){
            arrayOfMenu[i] = new ujianResto26(namaPemesan, "", 0);
            System.out.println("Masukkan data menu ke-" + (i + 1));
            System.out.print("Masukkan Kategori Menu Makanan Atau Minuman: ");
            arrayOfMenu[i].kategori = sc.nextLine();
            System.out.print("Nama Menu yang Di Pesan: ");
            arrayOfMenu[i].namamenu = sc.nextLine();
            System.out.print("Jumlah  Menu Yang di Pesan: ");
            arrayOfMenu[i].JumlahMenu = sc.nextInt();
            sc.nextLine();
        }
        
        
        System.out.println("Metode Pembayaran:");
            for(int i=0; i <jumlahMenu; i++){
                System.out.println("Menu " + arrayOfMenu[i].namamenu + ":");
                System.out.println("1. Cash");
                System.out.println("2. Debit");
                System.out.print("Pilih metode pembayaran untuk menu " + arrayOfMenu[i].namamenu + ": ");
                int pembayaran = sc.nextInt();
                arrayOfMenu[i].setPembayaran(pembayaran);
            }
       
        
            
        System.out.println("\n=== Informasi Pesanan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            arrayOfMenu[i].tampilInformasi();
        }
        System.out.println("\n=== Update Status Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Apakah menu " + arrayOfMenu[i].namamenu + " tersedia? (true/false): ");
            boolean status = sc.nextBoolean();
            arrayOfMenu[i].setStatusMenu(status);
            System.out.print("Apakah Anda ingin mengubah jumlah menu " + arrayOfMenu[i].namamenu + "? (true/false): ");
            boolean ubahJumlah = sc.nextBoolean();
            if (ubahJumlah) {
                System.out.print("Masukkan jumlah baru untuk menu " + arrayOfMenu[i].namamenu + ": ");
                int jumlahBaru = sc.nextInt();
                arrayOfMenu[i].ubahJumlahMenu(jumlahBaru);
            }
            System.out.println("Status menu " + arrayOfMenu[i].namamenu + " telah diperbarui.");


        }
        sc.close();
    }
}