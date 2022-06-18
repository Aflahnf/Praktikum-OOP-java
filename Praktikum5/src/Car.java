/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 5 - Praktikum - Pengenalan Arraylist
Car
 */

public class Car {
    private String carType ;
    private String polNum ;
    private String merk ;
    private boolean status ;

    Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType ;
        this.polNum = polNum ;
        this.merk = merk ;
        this.status = status ;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }


}
