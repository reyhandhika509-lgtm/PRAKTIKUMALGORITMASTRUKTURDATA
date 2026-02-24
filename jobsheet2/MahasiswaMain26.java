public class MahasiswaMain26 {
    public static void main(String[] args) {
        
    Mahasiswa26 mhs1 = new Mahasiswa26();
    mhs1.nama = "Reyhandhika Zikri Prijadi";
    mhs1.nim = "254107020219";
    mhs1.kelas = "TI 1G";
    mhs1.ipk = 3.7;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("TI 1H");
    mhs1.UpdateIpk(3.8);
    mhs1.tampilkanInformasi();

    Mahasiswa26 mhs2= new Mahasiswa26("Yudistira", "254107020220", "TI 1G", 3.8);
    mhs2.updateipk(3.30);
    mhs2.tampilkanInformasi();
    }
}