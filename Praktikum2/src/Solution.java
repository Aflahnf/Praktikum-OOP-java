/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 2 - Menghitung Luas
 */

import java.io.*;
import java.util.*;

public class Solution {
    static int Panjang_Sisi, Panjang_Sisi_Alas, Panjang_Sisi_Tinggi, Panjang_Rusuk, Pilih_Menu_ke;

    public static void main(String[] args) {
        Scanner Aflah_Hanif = new Scanner(System.in);

        Persegi Luas_Persegi     = new Persegi();
        Segitiga Luas_Segitiga   = new Segitiga();
        Lingkaran Luas_Lingkaran = new Lingkaran();

        Pilih_Menu_ke = Aflah_Hanif.nextInt();

        if(Pilih_Menu_ke > 3 || Pilih_Menu_ke < 1){
            System.out.print("Input yang anda masukan tidak sesuai");
        }

        if(Pilih_Menu_ke == 1){
            Panjang_Sisi = Aflah_Hanif.nextInt();

            Luas_Persegi.get_Nilai_Luas_Persegi(Panjang_Sisi);

        }

        if(Pilih_Menu_ke == 2){
            Panjang_Sisi_Alas = Aflah_Hanif.nextInt();
            Panjang_Sisi_Tinggi = Aflah_Hanif.nextInt();

            Luas_Segitiga.get_Nila_Luas_Segitiga(Panjang_Sisi_Alas, Panjang_Sisi_Tinggi);
        }

        if(Pilih_Menu_ke == 3){
            Panjang_Rusuk = Aflah_Hanif.nextInt();

            Luas_Lingkaran.get_Nilai_Luas_Lingkaran(Panjang_Rusuk);
        }

    }
}


class Persegi{
    void get_Nilai_Luas_Persegi (int Panjang_Sisi){
        System.out.print(Panjang_Sisi * Panjang_Sisi);
    }
}

class Segitiga {
    void get_Nila_Luas_Segitiga(int Sisi_Alas, int Sisi_Tinggi){
        System.out.print((Sisi_Alas * Sisi_Tinggi) / 2);
    }
}

class Lingkaran{
    static double Rumus_Lingkaran;
    static int Nilai_Luas_Lingkaran;

    void get_Nilai_Luas_Lingkaran (int rusuk){
        if(rusuk == 7){
            Rumus_Lingkaran = 22/7 * rusuk * rusuk;
            Nilai_Luas_Lingkaran = (int) Rumus_Lingkaran;

            System.out.print((double) Nilai_Luas_Lingkaran);
        }

        if(rusuk % 7 > 0){
            Rumus_Lingkaran = 3.14 * rusuk * rusuk;
            Nilai_Luas_Lingkaran = (int) Rumus_Lingkaran;

            System.out.print((double) Nilai_Luas_Lingkaran);
        }


    }
}


