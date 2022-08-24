package homeworks.homework_1;

public class ChildrenProducts extends Products {

  /**
   * поля класса ChildrenProducts
   * 
   * @minAge - минимальный возраст
   * @hypoallegenicity - гипоаллергенность
   */
  private int minAge;
  private String hypoallegenicity;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  ChildrenProducts(String n, int p, int a, String u, int m, String d) {
    super(n, p, a, u);
    minAge = m;
    hypoallegenicity = d;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Детские товары:" + " минимальный возраст " + minAge + " гипоаллергенность " + hypoallegenicity;
  }

}
