/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 5 - Praktikum - Pengenalan Arraylist
Main
 */

public class Main {

    public static void main(String[] args) {

        CarRider Ladi = new CarRider("Ladi Firmaladi",50, "085227527809");
        CarRider Soichiro  = new CarRider("Soichiro Honda", 36, "08192837465");
        CarRider Karl  = new CarRider("Karl Benz", 24, "08123456789");
        CarRider Ferruccio  = new CarRider("Ferruccio Lamborghini", 30, "081122334455");

        CarData data = new CarData();
        data.addCar("SPORT", "F 1723 FL", "Lamborghini");
        data.addCar("Sedan", "B  3  NZ", "Mercedes");
        data.addCar("SUV", "R 7878 AS", "Honda");
        data.addCar("MPV", "L  4  DY", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(Ladi, data.carList.get(3), 1);
        arsip.Rent(Soichiro,data.carList.get(2),7);
        arsip.Rent(Karl, data.carList.get(1), 2);
        arsip.Rent(Ferruccio, data.carList.get(3), 3);

        System.out.println();
        arsip.info();

    }
}