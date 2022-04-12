/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 4 - Praktikum
Main
 */

import java.util.Scanner;

public class MainMenu {
    //Main
    public static void main(String[] args) {
        Scanner pelanggan = new Scanner(System.in);

        //Memasukan Menu Toko
        DapurMerchant.merchantUB = DapurMerchant.tambahMerchant(new KatalogMerchant(
                "Bakso Pak Sahid",
                "Bakso",
                8000));
        DapurMerchant.merchantUB = DapurMerchant.tambahMerchant(new KatalogMerchant(
                "Nasgor Mblebes",
                "Nasi Goreng Jawa",
                10000));
        DapurMerchant.merchantUB = DapurMerchant.tambahMerchant(new KatalogMerchant(
                "Ayam Geprek Kak Ros",
                "Ayam Kota Ekstra Nasi",
                8000));

        DapurMerchant.tampilData();

        //Menampilkan Menu Toko
        System.out.println("\n=====Memasukkan Data Merchant Baru=====");
        System.out.println("Silahkan masukkan nama Merchant, nama Menu dan Harga Menu yang baru.");
        System.out.print("Nama Merchant : ");
        String NamaToko = pelanggan.nextLine();

        System.out.print("Nama Menu     : ");
        String NamaMenu = pelanggan.nextLine();

        System.out.print("Harga Satuan  : ");
        double HargaSatuan = pelanggan.nextDouble();
        pelanggan.nextLine();

        DapurMerchant.merchantUB = DapurMerchant.tambahMerchant(new KatalogMerchant(NamaToko, NamaMenu, HargaSatuan));
        System.out.println();

        //menampilkan Menu Toko
        DapurMerchant.tampilData();
        System.out.println();

        //ubah data merchant yang sudah di inputkan
        System.out.println("-------------------------------------------------");
        System.out.println("|                    UBFOOD                     |");
        System.out.println("-------------------------------------------------");
        System.out.println("============UBAH MENU MERCHANT UBFOOD============");

        System.out.print("Nama baru untuk Merchant  : ");
        String Merchant_BARU = pelanggan.nextLine();
        System.out.print("Menu baru                 : ");
        String Menu_BARU = pelanggan.nextLine();
        System.out.print("Harga satauan             : ");
        double Harga_BARU = pelanggan.nextDouble();
        System.out.println();

        DapurMerchant.updateMerchant (DapurMerchant.cariMerchant (Merchant_BARU), Merchant_BARU, Menu_BARU, Harga_BARU);

        //menampilkan data merchant yang diupdate dengan metode pencarian
        DapurMerchant.tampilMerchant(DapurMerchant.cariMerchant("Bakso Pak Sahid"));
    }
}
