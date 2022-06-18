/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 6 - Manusia
 */

public class Manusia {

    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan;
        if (this.getMenikah() == true) {
            if (this.getJenisKelamin() == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        double pendapatan = getTunjangan();
        return pendapatan;
    }
    String Kosong=" ";
    @Override
    public String toString() {
        System.out.printf("| Nama          : %29s |\n",this.getNama());
        System.out.printf("| NIK           : %29s |\n",this.getNIK());
        System.out.printf("| Jenis Kelamin : %29s |\n",(jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.printf("| Pendapatan    :" + "%25s$%3s |\n",Kosong, this.getPendapatan());
        System.out.println("-------------------------------------------------");

        return " ";
    }
}