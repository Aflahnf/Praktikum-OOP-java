/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 6 - Manager
 */
public class Manager extends Pekerja {

    private int lamaKerja;

    public Manager(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK,
                   boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        String Kosong=" ";
        System.out.printf("| Nama          : %31s |\n",this.getNama());
        System.out.printf("| NIK           : %31s |\n",this.getNIK());
        System.out.printf("| NIP           : %31s |\n",this.getNIP());
        System.out.printf("| Jenis Kelamin : %31s |\n",(this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.printf("| Pendapatan    : " + "%24s$%4s |\n",Kosong, (this.getGaji() + (this.getBonus() + (this.getBonus() * 30 / 100)) + (this.getTunjangan() + 15)));
        System.out.printf("| Bonus         : " + "%24s$%4s |\n",Kosong, (this.getBonus() + (this.getBonus() * 30 / 100)));
        System.out.printf("| Gaji          : " + "%24s$%4s |\n",Kosong,this.getGaji());
        System.out.printf("| Status        : %31s |\n", this.getStatus());
        System.out.printf("| Lama Kerja    : %26s hari |\n",this.getLamaKerja());
        System.out.println("---------------------------------------------------");

        return "";
    }
}