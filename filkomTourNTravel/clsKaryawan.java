package filkomTourNTravel;

class Karyawan {
    String nama;
    String alamat;
    String noTelp;
    String jenisKelamin;
    String kategoriKaryawan;
    int pilihan;

public Karyawan( ) {
}

public void setNama(String nama){
   this.nama = nama;
}
public void setAlamat(String alamat){
   this.alamat = alamat;
}
public void setNoTelp(String noTelp){
   this.noTelp = noTelp;
}
public void setJenisKelamin(String jenisKelamin){
   this.jenisKelamin = jenisKelamin;
}
public void setKategoriKaryawan(String kategoriKaryawan){
   this.kategoriKaryawan = kategoriKaryawan;
}

public void getBehaviour (String kategoriKaryawan){
   this.kategoriKaryawan = kategoriKaryawan;
   if (kategoriKaryawan.equalsIgnoreCase("sopir")){
      System.out.println("Bertugas sebagai sopir penumpang");
   }else if (kategoriKaryawan.equalsIgnoreCase("supir rentcar")){
      System.out.println("Bertugas sebagai sopir mobil sewaan");
   }else if (kategoriKaryawan.equalsIgnoreCase("admin")){
      System.out.println("Bertugas menginput data penyewaan mobil dan sopir");
   }
}


public void display (){
   System.out.println("Nama \t\t: "+nama);
   System.out.println("Alamat \t\t: "+alamat);
   System.out.println("Nomor Teleopn \t: "+noTelp);
   System.out.println("Jenis Kelamin \t: "+jenisKelamin);
   System.out.println("Kategori \t: "+kategoriKaryawan);
}


}
