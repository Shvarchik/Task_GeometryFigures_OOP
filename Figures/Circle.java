package Figures;

public class Circle extends Figure{
    public int radius;

    public Circle(int radius) throws IllegalArgumentException{

        if ( radius <=0)
                throw new IllegalArgumentException("Некорректно задан радиус");

        this.radius = radius;
    }

    public double circumference () {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}
