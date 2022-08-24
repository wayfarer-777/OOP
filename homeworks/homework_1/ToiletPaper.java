package homeworks.homework_1;

public class ToiletPaper extends HygienceItems {

  /**
   * поля класса ToiletPaper
   * 
   * @numberOfLayers - кол-во слоев
   */
  private int numberOfLayers;

  /**
   * конструктор, инициализирующий переменные с помощью
   * метода super()
   */
  ToiletPaper(String n, int p, int a, String u, int amt, int num) {
    super(n, p, a, u, amt);
    numberOfLayers = num;
  }

  // перегрузка метода toString()
  public String toString() {
    return "Туалетная бумага:" + " кол-во слоев " + numberOfLayers;
  }
}
