package filkomTourNTravel;

class Mobil{
    String noPlat;
    String merkMobil;
    String warnaMobil;
    String tahunKeluaran;
    String behaviour;

public Mobil (){
    
}

public void setNoPlat (String noPlat){
    this.noPlat = noPlat;
}
public void setMerkMobil (String merkMobil){
    this.merkMobil = merkMobil;
}
public void setWarnaMobil (String warnaMobil){
    this.warnaMobil = warnaMobil;
}
public void setTahunKeluaran (String tahunKeluaran){
    this.tahunKeluaran = tahunKeluaran;
}


public void display(){
    System.out.println("Nomor Plat \t\t:"+noPlat);
    System.out.println("Merk Mobil \t\t:"+merkMobil);
    System.out.println("Warna Mobil \t\t:"+warnaMobil);
    System.out.println("Tahun Keluaran \t\t:"+tahunKeluaran);
}

}
