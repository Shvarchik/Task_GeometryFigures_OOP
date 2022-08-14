package Figures;

public class Square extends Figure{
    public int side;
    
    public Square (int side){
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public double area() {
        return side*side;
    }
}

