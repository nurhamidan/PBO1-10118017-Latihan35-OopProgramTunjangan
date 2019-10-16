package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menghitung total gaji dan tunjangan dari status pernikahan.
 * 
 */
public class Karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;
    public double gajiTotal;
    
    public void hitungTunjangan(double persenTunjangan) {
        if (status.toUpperCase().equals("MENIKAH")) {
            tunjangan = persenTunjangan * gajiPokok;
        } else {
            tunjangan = 0;
        }
    }
    
    public void hitungGajiTotal() {
        gajiTotal = gajiPokok + tunjangan;
    }
}
