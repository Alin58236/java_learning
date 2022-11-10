package oop.test;

import oop.test.Test;

public class TestDemo {



    public static void main(String[] Args)
    {
        Test t = new Test(); // test e fara modificator
        t.display();
        t.display1("text de afisat");

        // public -l poate fi accesat de oriunde
        // protected - trebuie sa fie in acelasi pachet sau sa fie subclasa
        // fara modifier - poate fi in acelasi pachet dar nu poate fi subclasa
        // private - trebuie sa fie in aceeasi clasa


    }
}
