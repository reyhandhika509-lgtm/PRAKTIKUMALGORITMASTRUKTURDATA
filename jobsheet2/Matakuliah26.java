public class Matakuliah26 {
    String kodeMatakuliah;
    String namaMatakuliah;
    int sks;
    int jumlahjam;

    public Matakuliah26() {
    }
    public Matakuliah26(String kodeMk, String namaMk, int sks, int jumlahjam) {
        kodeMatakuliah = kodeMk;
        namaMatakuliah = namaMk;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
    void tampilkanInformasi() {
        System.out.println("Kode Matakuliah: " + kodeMatakuliah);
        System.out.println("Nama Matakuliah: " + namaMatakuliah);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahjam);
    }
    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }
    public void tambahjam(int jam){
        jumlahjam += jam;
        System.out.println("Jumlah jam berhasil ditambah menjadi: " + jumlahjam);
    }
    public void kurangjam(int jam){
        if (jumlahjam - jam >= 0) {
            jumlahjam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi: " + jumlahjam);
        } else {
            System.out.println("Jumlah jam tidak bisa dikurangi. Jumlah jam saat ini: " + jumlahjam);
        }
    }
}
