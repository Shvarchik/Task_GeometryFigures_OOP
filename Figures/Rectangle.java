package Figures;

public class Rectangle extends Figure implements Perimeter {

    public int side1;
    public int side2;

    public Rectangle (int side1, int side2) throws IllegalArgumentException {
        if (side1 <=0 ||side2 <=0 )
                throw new IllegalArgumentException("Некорректно задана сторона квадрата или прямоугольника");
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle (int side){
        this(side,side);
    }

    @Override
    public double perimeter() {
        return 2 * (this.side1 + this.side2);
    }

    @Override
    public double area() {
        return this.side1 * this.side2;
    }
}
