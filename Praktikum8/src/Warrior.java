/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 8 - Warrior
 */

public class Warrior extends Character {
    Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

    @Override
    public boolean attack() {
        double kesempatan;

        //Pada Warrior, kesempatan mengenai lawan adalah 60%
        kesempatan = Math.random() * 10;
        if (kesempatan <= 6.0 && kesempatan > 0){
            return true;
        }

        else{
            return false;
        }
    }

}
