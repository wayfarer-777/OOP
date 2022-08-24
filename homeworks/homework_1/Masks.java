package homeworks.homework_1;

public class Masks extends HygienceItems {
  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Masks(String n, int p, int a, String u, int amt) {
    super(n, p, a, u, amt);
  }

  // перегрузка метода toString()
  public String toString() {
    return "Предметы гигиены:" + " Маски";
  }
}
