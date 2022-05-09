package oop.abstractexam;

public class Circle extends Figure{
    
    public double radius;

    public Circle(int xPosition, int yPosition, int radius){
        super(xPosition, yPosition);
        this.radius = radius;
    }

    @Override
    public void initialization(){
        xPosition = 0;
        yPosition = 0;
        radius = 0;
    }

    @Override
    public void drawing(){
        System.out.println("============[원 그리기]================");
        System.out.println("좌표값 : (" + xPosition + ", " + yPosition + ")");
        System.out.println("반지름 : " + radius);
        System.out.printf("둘레 : %.0f", radius * 2 * 3.14);
    }
}
