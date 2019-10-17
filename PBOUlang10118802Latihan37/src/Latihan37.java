
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scanner.nextInt();

        mahasiswa.HitungTotal(mahasiswa.nilaiMhs, n);
        mahasiswa.HitungRataRataNilaiMhs(mahasiswa.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mahasiswa.HitungRataRataNilaiMhs(mahasiswa.totalNilaiMhs,n));
        System.out.println("Developed by : Iant Reza Anshory");
        
    }
    
}
