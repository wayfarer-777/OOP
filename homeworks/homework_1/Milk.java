package homeworks.homework_1;

public class Milk extends Food {
  /**
   * поля класса Milk
   * 
   * @fatPercentage - процент жирности
   * 
   */
  public int fatPercentage;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Milk(String n, int p, int a, String u, String d, int f) {
    super(n, p, a, u, d);
    fatPercentage = f;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Молоко: " + "процент жирности " + fatPercentage + " срок годности " + bestBeforeDate;
  }
}