package oop.Encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student s = new Student("gheorgay",31,"hya hya");
        System.out.println(s);

        String name = s.getName();
        System.out.println(name);

        //Incapsularea consta in a oferi un strat de abstractizare parametrilor unei clase (parametrii privati cu getters si setters publici)

    }

}
