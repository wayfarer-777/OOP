package homeworks.homework_1;

public class Diapers extends ChildrenProducts {

  /**
   * поля класса Diapers
   * 
   * @size - размер
   * @minWeight - минимальный вес
   * @maxWeight - максимальный вес
   * @type - тип
   */
  private int size;
  private int minWeight;
  private int maxWeight;
  private String type;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  Diapers(String n, int p, int a, String u, int m, String d, int sz, int mnw, int mxw, String tp) {
    super(n, p, a, u, m, d);
    size = sz;
    minWeight = mnw;
    maxWeight = mxw;
    type = tp;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Подгузники:" + " размер " + size + " мин.вес " + minWeight + " мах.вес " + maxWeight
        + " тип " + type;
  }

}
