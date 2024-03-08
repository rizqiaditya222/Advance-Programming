package filkomTourNTravel;
import java.util.*;

public class objFilkomMART {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Karyawan karyawan[] = new Karyawan[5];

    for (int i=1;i<=2;i++){
        karyawan[i] = new Karyawan();
        System.out.println("INPUT DATA KARYAWAN "+(i));
        
        System.out.print("Masukkan nama karyawan\t\t: ");
        karyawan[i].setNama(input.nextLine());
        
        System.out.print("Masukkan alamat karyawan\t: ");
        karyawan[i].setAlamat(input.nextLine());
        
        System.out.print("Masukkan nomor telepon karyawan\t: ");
        karyawan[i].setNoTelp(input.nextLine());
        
        System.out.print("Masukkan jenis kelamin karyawan\t: ");
        karyawan[i].setJenisKelamin(input.nextLine());
        
        System.out.print("Masukkan kategori karyawan\t: ");
        karyawan[i].setKategoriKaryawan(input.nextLine());
        
        
        System.out.println("\nDATA KARYAWAN "+(i+1));
        karyawan[i].display();
    }
    }
}

