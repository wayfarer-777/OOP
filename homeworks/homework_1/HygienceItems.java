package homeworks.homework_1;

public class HygienceItems extends Products {

  /**
   * поля класса HygienceItems
   * 
   * @amountInAPackage - кол-во штук в упаковке
   */
  private int amountInAPackage;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  HygienceItems(String n, int p, int a, String u, int amt) {
    super(n, p, a, u);
    amountInAPackage = amt;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Предметы гигиены:" + " кол-во в упаковке " + amountInAPackage;
  }

}
