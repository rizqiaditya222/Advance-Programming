package filkomTourNTravel;
import java.util.*;

public class objFilkomMART {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Karyawan karyawan[] = new Karyawan[5];
    Mobil mobil[] = new Mobil[5];
    int i = 1;
    int j = 1;

    while (true) {
        System.out.print("1. Input Data Karyawan\n2. Input Data Mobil\n3. Akhiri Program\nMasukkan Perintah : ");
        int choice = input.nextInt();

        if (choice==1) {
            while (i<=3){
                karyawan[i] = new Karyawan();
    
                System.out.println("\nINPUT DATA KARYAWAN "+(i));
                
                System.out.print("Masukkan nama karyawan\t\t: ");
                karyawan[i].setNama(input.next());
                
                System.out.print("Masukkan alamat karyawan\t: ");
                karyawan[i].setAlamat(input.next());
                
                System.out.print("Masukkan nomor telepon karyawan\t: ");
                karyawan[i].setNoTelp(input.next());
                
                System.out.print("Masukkan jenis kelamin karyawan\t: ");
                karyawan[i].setJenisKelamin(input.next());
                
                System.out.print("Masukkan kategori karyawan\t: ");
                karyawan[i].setKategoriKaryawan(input.next());
                
                
                System.out.println("\nDATA KARYAWAN "+(i));
                karyawan[i].display();
                karyawan[i].getBehaviour(karyawan[i].kategoriKaryawan);
                System.out.println("\n");

                i++;
                break;
        }

        }else if (choice==2){
            while (j<=3){
                mobil[j] = new Mobil();

                System.out.println("\nINPUT DATA MOBIL "+j);
                
                System.out.print("Masukkan nomor plat\t\t: ");
                mobil[j].setNoPlat(input.next());

                System.out.print("Masukkan merk mobil\t\t: ");
                mobil[j].setMerkMobil(input.next());

                System.out.print("Masukkan warna mobil\t\t: ");
                mobil[j].setWarnaMobil(input.next());

                System.out.print("Masukkan tahun keluaran\t\t: ");
                mobil[j].setTahunKeluaran(input.next());
                
                
                System.out.println("\nDATA MOBIL "+(j));
                mobil[j].display();
                System.out.println("\n");

                j++;
                break;
            }

        }else if (choice==3) {
            System.out.println("Love you muachhh");
            break;
        }
    }
    }
}

