package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {
    private static final double PERSEN_TUNJANGAN = 0.35;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan younglex = new Karyawan();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        younglex.gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        younglex.status = scanner.next();
        
        younglex.hitungTunjangan(PERSEN_TUNJANGAN);
        younglex.hitungGajiTotal();
        
        //Menampilkan hasil
        System.out.println("\n===========Hasil Perhitungan Gaji Anda===========");
        System.out.printf("Gaji Pokok\t\t: Rp. %.1f%n", younglex.gajiPokok);
        System.out.printf("Tunjangan\t\t: Rp. %.1f%n", younglex.tunjangan);
        System.out.printf("Total Gaji\t\t: Rp. %.1f%n", younglex.gajiTotal);
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
