package homeworks.homework_1;

public class Bread extends Food {
  /**
   * поля класса Bread
   * 
   * @typeOfFloor - тип муки
   * 
   */
  private String typeOfFloor;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Bread(String n, int p, int a, String u, String d, String t) {
    super(n, p, a, u, d);
    typeOfFloor = t;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Хлеб: " + "тип муки " + typeOfFloor;
  }

}
