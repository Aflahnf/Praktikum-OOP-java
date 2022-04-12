/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 4 - Praktikum
Merchant
 */

public class KatalogMerchant {
    //Merchant
    //Berikut ini adalaha data Katalog Merchant UB
        private String namaMerchant;
        private String namaProduk;
        private double hargaMakanan;

        public KatalogMerchant (String NAMA_MERCAHANT, String NAMA_PRODUK, double HARGA_MAKANAN){
            this.namaMerchant = NAMA_MERCAHANT;
            this.namaProduk = NAMA_PRODUK;
            this.hargaMakanan = HARGA_MAKANAN;
        }

        public String getNamaMerchant() {
            return namaMerchant;
        }

        public void setNamaMerchant(String NAMA_MERCAHANT_UB) {
            this.namaMerchant = NAMA_MERCAHANT_UB;
        }

        public String getNamaMenu() {
            return namaProduk;
        }

        public void setNamaMenu(String NAMA_PRODUK_UB) {
            this.namaProduk = NAMA_PRODUK_UB;
        }

        public double getHargaSatuan() {
            return hargaMakanan;
        }

        public void setHargaSatuan(double hargaMakanan) {
            this.hargaMakanan = hargaMakanan;
        }
    }


