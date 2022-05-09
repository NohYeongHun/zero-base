package oop.overrides;

public class OverridingTest{
    public static void main(String[] args) {
        Human man = new Human(20, "SSA");
        man.infoPrint();

        Human woman = new Human(30,"AAS");
        woman.infoPrint();

        Staff manStaff = new Staff(20, "SSAS", "fastCampus", 11111);
        manStaff.infoPrint();

        Human[] humanList = {man, woman, manStaff};
        for(Human human : humanList){
            human.infoPrint();
            human.finalTest();
        }
    }
    

}
