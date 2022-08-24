package Seminars.Seminar_1.Test;

public class Cat {
  // поля состояний
  private String name;
  private String color;

  // конструктор по умолчанию
  public Cat(String name, String color) {
    this.name = name;
    this.color = color;
  }

  // набор перегруженных методов meow()
  void meow() {
    System.out.println("Мяу");
  }

  void meow(int count) {
    // используется один параметр типа int
  }

  void meow(int count, int pause) {
    // используются два параметра типа int
  }

  long meow(long time) {
    // используется один параметр типа long
    return time;
  }

  double meow(double time) {
    // используется один параметр типа double
    return time;
  }

  // селекторы и модификаторы
  public String getName() {
    return name;
  }

  public void setName(String a) {
    name = a;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
