package abstractexam;

public abstract class Figure {
    
    protected int xPosition;
    protected int yPosition;

    public Figure(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void initialization(){
        xPosition = 0;
        yPosition = 0;
    }

    public abstract void drawing();



}
