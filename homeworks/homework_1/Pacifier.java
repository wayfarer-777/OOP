package homeworks.homework_1;

public class Pacifier extends ChildrenProducts {
  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Pacifier(String n, int p, int a, String u, int m, String d) {
    super(n, p, a, u, m, d);
  }

  // перегрузка метода toString()
  public String toString() {
    return "Соска";
  }
}
