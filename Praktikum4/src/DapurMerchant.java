/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 4 - Praktikum
Data Merchant
 */

public class DapurMerchant {
        //DataMerchant
        static KatalogMerchant[] merchantUB = new KatalogMerchant[0];

        public static KatalogMerchant[] tambahMerchant (KatalogMerchant Nama_Menu_Baru){
            KatalogMerchant[] toko = new KatalogMerchant[DapurMerchant.merchantUB.length + 1];

            for (int i = 0; i < DapurMerchant.merchantUB.length; i++){
                toko[i] = merchantUB[i];
            }

            toko [DapurMerchant.merchantUB.length] = Nama_Menu_Baru;
            return toko;
        }

        public static void tampilData(){
            System.out.println("\n----------------------------------------");
            System.out.println("|                UBFOOD                |");
            for (KatalogMerchant x : DapurMerchant.merchantUB) {
                System.out.println("=====Tampilan Menu Merchant UBFOOD=====");
                System.out.println("Nama Merchant   : " + x.getNamaMerchant());
                System.out.println("Nama Menu       : " + x.getNamaMenu());
                System.out.println("Harga Satuan    : " + (int) x.getHargaSatuan());
            }
        }

        public static KatalogMerchant cariMerchant (String nama){
            int index = 0;
            for (int i = 0; i < DapurMerchant.merchantUB.length; i++){
                if (DapurMerchant.merchantUB[i].getNamaMerchant() == nama){
                    index = i;
                    break;
                }
            }
            return merchantUB[index];
        }

        public static void tampilMerchant (KatalogMerchant data_katalog){
            System.out.println("======Tampilan Menu Merchant UBFOOD Terbaru======");
            System.out.println("Nama Merchant   : " + data_katalog.getNamaMerchant());
            System.out.println("Nama Menu       : " + data_katalog.getNamaMenu());
            System.out.println("Harga Satuan    : " + (int) data_katalog.getHargaSatuan());
            System.out.println("-------------------------------------------------");
            System.out.println("|                    UBFOOD                     |");
            System.out.println("-------------------------------------------------");
        }

        public static void updateMerchant (KatalogMerchant dataKatalog, String Nama_Merchant, String Nama_Menu, double Harga_Satuan){
            dataKatalog.setNamaMerchant(Nama_Merchant);
            dataKatalog.setNamaMenu(Nama_Menu);
            dataKatalog.setHargaSatuan(Harga_Satuan);
        }
    }

