public class MatakuliahMain26 {
    public static void main(String[] args) {
        Matakuliah26 mk1 = new Matakuliah26();
        mk1.kodeMatakuliah = "TI101";
        mk1.namaMatakuliah = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahjam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahjam(2);
        mk1.kurangjam(4);
        mk1.tampilkanInformasi();

        Matakuliah26 mk2 = new Matakuliah26("TI 1G", "Pemrograman Berorientasi Objek", 4, 3);
        mk2.tampilkanInformasi();
        mk2.tambahjam(3);
        mk2.kurangjam(1);

    }   
    
}
