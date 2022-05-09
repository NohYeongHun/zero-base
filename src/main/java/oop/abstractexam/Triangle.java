package oop.abstractexam;

public class Triangle extends Figure{
    
    public int width;
    public int height;

    public Triangle(int xPosition, int yPosition, int width, int height){
        super(xPosition, yPosition);
        this.width = width;
        this.height = height;

    }

    @Override
    public void drawing(){
        System.out.println("============[삼각형 그리기]================");
        System.out.println("좌표값 : (" + xPosition + ", " + yPosition + ")");
        System.out.println("길이: " + width + " 높이: " + height);
    }
}
