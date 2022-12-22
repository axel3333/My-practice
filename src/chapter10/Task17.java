package chapter10;

/* Напишите класс, который генерирует длины сторон катетов прямоугольного треугольника так,
чтобы длина катета не превышала 10.5 см. Класс должен подсчитать длину гипотенузы этого треугольника,
его площадь и периметр и вывести их на экран.
Затем эти вычисленные значения следует округлить и вывести результат на экран в отдельной
строке вместе с соответствующим текстовым сообщением.
 */

public class Task17 {
    public static void main(String[] args) {
        double down = 0.0;
        double up = 10.5;
        double firstCathet = down + ((up - down + 1) * Math.random());
        double secondCathet = down + ((up - down + 1) * Math.random());
        double hypotenuse = Math.sqrt(firstCathet * firstCathet + secondCathet * secondCathet);
        double areaOfTriangle = (firstCathet * secondCathet) / 2;
        double perimeterOfTriangle = firstCathet + secondCathet + hypotenuse;
        System.out.println(hypotenuse);
        System.out.println(areaOfTriangle);
        System.out.println(perimeterOfTriangle);
        int hypo = (int) Math.round(hypotenuse);
        int area = (int) Math.round(areaOfTriangle);
        int perimeter = (int) Math.round(perimeterOfTriangle);
        System.out.println("Гипотенуза равна " + hypo);
        System.out.println("Площадь треугольника равна " + area);
        System.out.println("Периметр треугольника равен " + perimeter);
    }
}
