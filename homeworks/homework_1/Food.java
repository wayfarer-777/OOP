package homeworks.homework_1;

public class Food extends Products {
  /**
   * поля класса Food
   * 
   * @bestBeforeDate - срок годности
   */
  protected String bestBeforeDate;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Food(String n, int p, int a, String u, String d) {
    super(n, p, a, u);
    bestBeforeDate = d;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Продукт питания:" + " срок годности " + bestBeforeDate;
  }
}