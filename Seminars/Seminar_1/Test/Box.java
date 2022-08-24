package Seminars.Seminar_1.Test;

public class Box {
  /**
   * width - ширина коробки
   * height - высота коробки
   * depth - глубина коробки
   */
  int width;
  int height;
  int depth;

  // конструктор для класса по умолчанию
  Box() {
    width = 10;
    height = 10;
    depth = 10;
  }

  // конструктор для класса с параметрами
  Box(int w, int h, int d) {
    width = w;
    height = h;
    depth = d;
  }

  // конструктор для вычисления куба
  Box(int len) {
    width = height = depth = len;
  }

  // конструктор с объектом типа Box
  Box(Box ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // устанавливаем размеры коробки
  void setDim(int w, int h, int d) {
    width = w;
    height = h;
    depth = d;
  }

  // вычисляем объем коробки
  int getVolume() {
    return width * height * depth;
  }

  public String toString() {
    return "Коробочка для кота размером " + width + "x" + height + "x" + depth;
  }
}

class HeavyBox extends Box {
  int weigth; // вес коробки

  // конструктор подкласса
  HeavyBox(int w, int h, int d, int m) {
    width = w;
    height = h;
    depth = d;
    weigth = m; // масса
  }

  public String toString() {
    return "Коробочка для кота размером " + width + "x" + height + "x" + depth
        + "весом" + weigth;
  }
}
