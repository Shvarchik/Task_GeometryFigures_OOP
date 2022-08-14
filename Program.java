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
    
    public static void main(String[] args) {
        
        ArrayList <Figure> figures = new ArrayList<>();
        figures.add(new Circle(5));
        figures.add(new Square(10));
        figures.add(new Rectangle(3,5));
        figures.add(new Triangle(5,6,7));
        for (Figure item:figures){
            System.out.printf("Площадь: %.2f, Периметр: %.2f\n", item.area(), item.perimeter());
            
        }
    }
}
