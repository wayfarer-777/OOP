package homeworks.homework_1;

public class Lemonade extends Beverages {
  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Lemonade(String n, int p, int a, String u, int v) {
    super(n, p, a, u, v);
  }

  // перегрузка метода toString()
  public String toString() {
    return "Лимонад";
  }
}
