package oop.abstractexam;

public class Square extends Figure{
    
    public int width;
    public int height;

    public Square(int xPosition, int yPosition, int width, int height){
        super(xPosition, yPosition);
        this.width = width;
        this.height = height;

    }

    @Override
    public void drawing(){
        System.out.println("============[사각형 그리기]================");
        System.out.println("좌표값 : (" + xPosition + ", " + yPosition + ")");
        System.out.println("길이: " + width + " 높이: " + height);
    }
}
