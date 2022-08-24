package homeworks.homework_1;

public class Eggs extends Food {

  /**
   * поля класса Eggs
   * 
   * @amountInAPackage - кол-во в упаковке
   * 
   */
  private int amountInAPackage;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Eggs(String n, int p, int a, String u, String d, int e) {
    super(n, p, a, u, d);
    amountInAPackage = e;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Яйца: " + "кол-во в упаковке " + amountInAPackage;
  }

}
