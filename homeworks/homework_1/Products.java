package homeworks.homework_1;

public class Products {

  /**
   * поля базового класса
   * 
   * @name - название
   * @price - цена
   * @amount - колличество
   * @unit - единица измерения
   */
  private String name;
  private int price;
  private int amount;
  private String unit;

  /**
   * конструктор базового класса
   */

  Products(String n, int p, int a, String u) {
    name = n;
    price = p;
    amount = a;
    unit = u;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Описание продукта:  " + name + " x " + price + " x " + amount + " x " + unit;
  }
}
