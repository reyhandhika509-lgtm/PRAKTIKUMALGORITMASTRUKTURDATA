package Jobsheet1;
import java.util.Scanner;

public class Tugas2 {
static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int jumlahJadwal;
    public static void main(String[] args) {
        
         System.out.println("=== PROGRAM MANAJEMEN JADWAL KULIAH ===");
        
        
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        jumlahJadwal = sc.nextInt();
        sc.nextLine(); 
        
      
        jadwal = new String[jumlahJadwal][4];
        
        int pilihan;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Jadwal Kuliah");
            System.out.println("2. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Nama Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    inputDataJadwal();
                    break;
                case 2:
                    tampilkanSemuaJadwal();
                    break;
                case 3:
                    cariJadwalByHari();
                    break;
                case 4:
                    cariJadwalByMataKuliah();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
    
    
    public static void inputDataJadwal() {
        System.out.println("\n=== INPUT DATA JADWAL KULIAH ===");
        
        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.println("\nJadwal ke-" + (i + 1) + ":");
            
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            
            System.out.print("Jam Kuliah (contoh: 08.00-10.00): ");
            jadwal[i][3] = sc.nextLine();
        }
        
        System.out.println("\nData jadwal berhasil diinput!");
    }
    
   
    public static void tampilkanSemuaJadwal() {
        if (jumlahJadwal == 0 || jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal. Silakan input data terlebih dahulu.");
            return;
        }
        
        System.out.println("\n=== DAFTAR SELURUH JADWAL KULIAH ===");
        System.out.println("================================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n", 
                         "No", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("================================================================================");
        
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][0] != null) {
                System.out.printf("| %-3d | %-25s | %-15s | %-10s | %-12s |\n", 
                                 (i + 1), jadwal[i][0], jadwal[i][1], 
                                 jadwal[i][2], jadwal[i][3]);
            }
        }
        
        System.out.println("================================================================================");
    }
    
   
    public static void cariJadwalByHari() {
        if (jumlahJadwal == 0 || jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal. Silakan input data terlebih dahulu.");
            return;
        }
        
        System.out.print("\nMasukkan hari yang dicari: ");
        String hariDicari = sc.nextLine();
        
        System.out.println("\n=== JADWAL KULIAH PADA HARI " + hariDicari.toUpperCase() + " ===");
        System.out.println("================================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n", 
                         "No", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("================================================================================");
        
        boolean ditemukan = false;
        int counter = 1;
        
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][0] != null && jadwal[i][2].equalsIgnoreCase(hariDicari)) {
                System.out.printf("| %-3d | %-25s | %-15s | %-10s | %-12s |\n", 
                                 counter, jadwal[i][0], jadwal[i][1], 
                                 jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
                counter++;
            }
        }
        
        if (!ditemukan) {
            System.out.println("|                      TIDAK ADA JADWAL PADA HARI INI                      |");
        }  
        System.out.println("================================================================================");
    }
    
   
    public static void cariJadwalByMataKuliah() {
        if (jumlahJadwal == 0 || jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal. Silakan input data terlebih dahulu.");
            return;
        }
        
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String mkDicari = sc.nextLine();
        
        System.out.println("\n=== JADWAL KULIAH: " + mkDicari.toUpperCase() + " ===");
        System.out.println("================================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n", 
                         "No", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("================================================================================");
        
        boolean ditemukan = false;
        int counter = 1;
        
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][0] != null && jadwal[i][0].toLowerCase().contains(mkDicari.toLowerCase())) {
                System.out.printf("| %-3d | %-25s | %-15s | %-10s | %-12s |\n", 
                                 counter, jadwal[i][0], jadwal[i][1], 
                                 jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
                counter++;
            }
        }
        
        if (!ditemukan) {
            System.out.println("|                  MATA KULIAH TIDAK DITEMUKAN DALAM JADWAL                  |");
        }
        System.out.println("================================================================================");
    }
    
}
