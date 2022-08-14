package Figures;

public class Triangle extends Figure{

    public int side1;
    public int side2;
    public int side3;
    
    public Triangle (int side1, int side2, int side3){

        try {
            if ( side1+side2 <= side3 || side2+side3 <= side1 || side1+side3 <= side2 )
                throw new IllegalArgumentException("Некорректно заданы стороны треугольника");
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
    }

    @Override
    public double perimeter() {
        return this.side1+ this.side2 + this.side3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }
}

