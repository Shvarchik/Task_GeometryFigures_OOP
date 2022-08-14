package TaskGeometry;

public class Circle extends Figure{
    public int radius;

    public Circle(int radius){

        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}
