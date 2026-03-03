package jobsheet3;

public class ujianResto26 {
            String namaCostumer;
            String namamenu;
            String kategori;
            int JumlahMenu;
            boolean statusTersedia;
            int pembayaran;
        public ujianResto26(){

        }
    public ujianResto26(String namaCostumer,String namamenu,int jumlahMenu){

        this.namaCostumer = namaCostumer;
        this.namamenu = namamenu;
        this.JumlahMenu = jumlahMenu;
       

    }
     public void tampilInformasi() {
        System.out.println("Nama Costumer        : " + namaCostumer);
        System.out.println("Kategori    : " + kategori );
        System.out.println("Nama Menu   : " + namamenu);
        System.out.println("Jumlah Menu : " + JumlahMenu);
        System.out.println("Status Tersedia : " + (statusTersedia ? "Tersedia" : "Tidak Tersedia"));
     }

        public void setStatusMenu(boolean status) {
            this.statusTersedia = status;
            System.out.println("Status menu telah diubah menjadi: " + (statusTersedia ? "Tersedia" : "Tidak Tersedia"));

        }
        public void ubahJumlahMenu(int jumlahBaru) {
            this.JumlahMenu = jumlahBaru;
            System.out.println("Jumlah menu telah diubah menjadi: " + JumlahMenu);
        }
        public void setPembayaran(int pembayaran) {
            if (pembayaran == 1) {
                System.out.println("Metode pembayaran: Cash");
            } else if (pembayaran == 2) {
                System.out.println("Metode pembayaran: Debit");
            } else {
                System.out.println("Metode pembayaran tidak valid.");
            }
        }
} 
    