/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 6 - Mahasiswa
 */
public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan = "";
        String jurusan = "";
        angkatan = "20" + NIM.substring(0, 2);

        switch (NIM.substring(6, 7)) {
            case "2":
                jurusan = "Teknik Meniup Gelembung";
                break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                jurusan = "Sistem Perhamburgeran";
                break;
            case "6":
                jurusan = "Pendidikan Chum Bucket";
                break;
            case "7":
                jurusan = "Teknologi Telepon Kerang";
                break;
        }
        return jurusan + "," + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa;
        if (IPK >= 3.0 && IPK <= 3.5) {
            beasiswa = 50;
        } else if (IPK > 3.5 && IPK <= 4) {
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }

    public String toString() {
        String Kosong=" ";
        System.out.printf("| Nama          : %29s |\n",this.getNama());
        System.out.printf("| NIK           : %29s |\n",this.getNIK());
        System.out.printf("| Jenis Kelamin : %29s |\n",(this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.printf("| Pendapatan    : " + "%24s$%4s |\n",Kosong,(this.getBeasiswa() + this.getTunjangan()));
        System.out.printf("| NIM           : %29s |\n",this.getNIM());
        System.out.printf("| IPK           : %29s |\n",this.getIPK());
        System.out.printf("| Status        : %29s |\n",this.getStatus());
        System.out.println("-------------------------------------------------");
        return "";
    }
}