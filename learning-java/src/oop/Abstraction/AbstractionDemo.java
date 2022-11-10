package oop.Abstraction;

public class AbstractionDemo {
    //Abstractia presupune crearea unei clase abstracte (cu cel putin o metoda abstracta (fara implementare) care va fi mostenita de una sau mai multe subclase in care se vor afla implementarile
    public static void main(String[] args) {

        GraphicObject circle = new Circle(); //abstract = new concrete(); -> downcast
        circle.draw();
        circle.resize();

        Rectangle rectangle=new Rectangle();//putem si fara downcast
        rectangle.draw();
        rectangle.resize();


    }
}
