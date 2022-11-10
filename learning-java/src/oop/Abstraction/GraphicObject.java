package oop.Abstraction;

public abstract class GraphicObject {
    int x,y;

    void moveTo( int newX, int newY){
        System.out.println("move to x:"+newX+" and y:"+newY);
    }

    abstract void draw();

    abstract void resize();
}
