/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 6 - Pekerja
 */

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin,
                   boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = this.hariKerja * this.jamKerja * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        double bonusLembur;
        double bonusLibur;
        bonusLembur = ((hariKerja / 7) * 5 + (hariKerja % 7)) * (jamKerja - 7) * 7;
        bonusLibur = (hariKerja / 7) * 2 * jamKerja * 20;

        if (jamKerja <= 7) {
            return bonusLibur;
        } else {
            return bonusLibur + bonusLembur;
        }
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;

    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus() {
        String Kantor = "", Cabang, Departemen = "";
        switch (NIP.substring(0, 1)) {
            case "1":
                Kantor = "Mondstadt";
                break;
            case "2":
                Kantor = "Liyue";
                break;
            case "3":
                Kantor = "Inazuma";
                break;
            case "4":
                Kantor = "Sumeru";
                break;
            case "5":
                Kantor = "Fontaine";
                break;
            case "6":
                Kantor = "Natlan";
                break;
            case "7":
                Kantor = "Snezhnaya";
                break;
        }
        Cabang = " cabang " + NIP.substring(2, 3);
        switch (NIP.substring(6, 7)) {
            case "1":
                Departemen = "Pemasaran";
                break;
            case "2":
                Departemen = "Humas";
                break;
            case "3":
                Departemen = "Riset";
                break;
            case "4":
                Departemen = "Teknologi";
                break;
            case "5":
                Departemen = "Personalia";
                break;
            case "6":
                Departemen = "Akademik";
                break;
            case "7":
                Departemen = "Administrasi";
                break;
            case "8":
                Departemen = "Operasional";
                break;
            case "9":
                Departemen = "Pembangunan";
                break;
        }
        return Departemen + " , " + Kantor + " " + Cabang;
    }

    public String toString() {
        String Kosong=" ";
        System.out.printf("| Nama          : %31s |\n",this.getNama());
        System.out.printf("| NIK           : %31s |\n",this.getNIK());
        System.out.printf("| Jenis Kelamin : %31s |\n", (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.printf("| Pendapatan    : " + "%24s$%4s |\n",Kosong,(this.getGaji() + this.getBonus() + this.getTunjangan()));
        System.out.printf("| Bonus         : " + "%31s |\n",this.getBonus());
        System.out.printf("| Gaji          :" + "%25s$%4s |\n",Kosong,this.getGaji());
        System.out.printf("| Status        :%32s |\n", this.getStatus());
        System.out.println("---------------------------------------------------");


        return "";
    }
}