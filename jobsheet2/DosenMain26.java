public class DosenMain26 {

    public static void main(String[] args) {
       
        Dosen26 dsn1 = new Dosen26();
        dsn1.idDosen = "D001";
        dsn1.nama = "Dr. Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("=== Informasi Dosen 1 (default) ===");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        int masaKerja1 = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa kerja: " + masaKerja1 + " tahun");
        dsn1.ubahKeahlian("Machine Learning");
        System.out.println();

        Dosen26 dsn2 = new Dosen26("D002", "Prof. Siti Aminah", true, 2005, "Rekayasa Perangkat Lunak");
        System.out.println("=== Informasi Dosen 2 (berparameter) ===");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        int masaKerja2 = dsn2.hitungMasaKerja(2026);
        System.out.println("Masa kerja: " + masaKerja2 + " tahun");
        dsn2.ubahKeahlian("DevOps");
    }
 }



