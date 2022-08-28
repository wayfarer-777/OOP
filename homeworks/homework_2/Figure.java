package homeworks.homework_2;

abstract class Figure {
  /**
   * поля абстрактного класса
   */
  double dim1;
  double dim2;

  /**
   * конструктор абстрактного класса
   * 
   * @dim1 - первый параметр
   * @dim2 - второй параметр
   */
  Figure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  /**
   * абстрактный метод вычисления площади фигуры
   */
  double square() {
    System.out.println("Площадь фигуры");
    return 0;
  }
   /**
   * абстрактный метод вычисления периметра фигуры
   */
  double perimeter() {
    System.out.println("Периметр фигуры");
    return 0;
  }

}