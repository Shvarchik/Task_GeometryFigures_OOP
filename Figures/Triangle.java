package Figures;

public class Triangle extends Figure implements Perimeter{

    public int side1;
    public int side2;
    public int side3;
    
    public Triangle (int side1, int side2, int side3) throws IllegalArgumentException {

        if ( side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2 || side1 <=0 || side2 <=0 || side3 <=0)
                throw new IllegalArgumentException("Некорректно заданы стороны треугольника");

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
            
    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }
}

