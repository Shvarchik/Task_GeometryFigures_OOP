// В программе имеется массив фигур, с которым можно сделать следующие операции:
// 1.Добавить новую фигуру
// 2.Посчитать периметр у всех фигур
// 3.Посчитать площадь у всех фигур
// Для фигуры использовать базовый абстрактный класс фигуры, 
// у которого есть методы посчитать периметр и посчитать площадь фигуры.
// Массив фигур в программе должен быть представлен как массив объектов этого базового класса. 
// Массив фигур должен создаваться и вся работа с ним идёт внутри main. 

import java.util.ArrayList;
import Figures.*;

public class Program {

    static void allPerimetres(ArrayList<Figure> figures){
        int i=1;
        for (Figure item:figures) {
            if (item instanceof Circle)
                System.out.printf("%d. Длина окружности: %.2f\n", i++, ((Circle) item).circumference ());
            else System.out.printf("%d. Периметр: %.2f\n", i++, ((Perimeter)item).perimeter());
        }
    }

    static void allAreas (ArrayList<Figure> figures){
        int i=1;
        for (Figure item:figures) {
            System.out.printf("%d. Площадь: %.2f\n", i++, item.area());
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList <Figure> figures = new ArrayList<>();
        try {
        figures.add(new Circle(5));
        figures.add(new Square(8));
        figures.add(new Rectangle(3,5));
        figures.add(new Triangle(5,6,7));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        allPerimetres(figures);
        System.out.println();
        allAreas(figures);
        
    }
}
