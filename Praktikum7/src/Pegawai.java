/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 7 - Pegawai
 */

public class Pegawai {

    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP){
    this.nama = nama;
    this.noKTP = noKTP;

}

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        String identitas= "",KTP = "";

        //identitas += String.format("| Nama              : %-25s |\n",this.getNama());
        KTP = String.format("| No KTP            : %-25s |\n",this.getNoKTP());

        return  KTP;
    }

    public double gaji(){
        return 0.0;
    }

}

