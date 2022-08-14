package TaskGeometry;

public class Rectangle extends Figure{

    public int side1;
    public int side2;

    public Rectangle (int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double perimeter() {
        return 2 * (this.side1 + this.side2);
    }

    @Override
    public double area() {
        return side1*side2;
    }
}
