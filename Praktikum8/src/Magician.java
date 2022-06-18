/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 8 - Magician
 */

public class Magician extends Character {
    Magician (){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

    @Override
    public boolean attack() {
        double kesempatan;

        //Pada Magician, kesempatan mengenai lawan adalah 35%
        kesempatan = Math.random() * 10;
        if (kesempatan <= 3.5 && kesempatan > 0){
            return true;
        }

        else{
            return false;
        }
    }

}
