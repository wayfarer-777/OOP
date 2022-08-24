package Seminars.Seminar_1.Auto;

public class Transport {
  /**
   *задание полей базового класса
   */
  private String model;
  private String color;
  private int wheelsNumber;
  private int weight;
  private int speed;

  /**
   * конструктор базового класса Транспорт
   * 
   * @param model        - модель транспортного средства
   * @param color        - цвет
   * @param wheelsNumber - кол-во колес
   * @param weight       - вес
   * @param speed        - скорость
   */
  public Transport(String model, String color, int wheelsNumber, int weight, int speed) {
    this.model = model;
    this.color = color;
    this.wheelsNumber = wheelsNumber;
    this.weight = weight;
    this.speed = speed;
  }

  /**
   * метод базового класса - "ехать"
   */
  public void moov() {
    System.out.printf("%s moving", this.getClass().getSimpleName());
    System.out.println();
  }

  /**
   * метод базового класса - показать значение всех его публичных свойств
   * @return возврат значений всех его публичных свойств
   */
  public String getInfo() {
    return String.format("model: %s , color: %s , wheelsNumber: %d , weight: %d , speed: %d , Type: %s",
        this.model, this.color, this.wheelsNumber, this.weight, this.speed, this.getClass().getSimpleName());
  }
}
