package Figures;

public class Square extends Rectangle {  

    public int side;
        
    public Square (int side){ 
        super(side);
        this.side=side;
    }
    @Override
    public double area() {
        return this.side * this.side;
    }

}

