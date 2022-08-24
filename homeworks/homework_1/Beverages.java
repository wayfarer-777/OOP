package homeworks.homework_1;

public class Beverages extends Products {

  /**
   * поля класса Beverages
   * 
   * @volume - объем
   */
  private int volume;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Beverages(String n, int p, int a, String u, int v) {
    super(n, p, a, u);
    volume = v;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Напитки:" + " объем " + volume;
  }

}
