package Seminars.Seminar_1.Auto;

public class Car extends Transport {

  /**
   * @param model
   * @param color
   * @param weight
   * @param speed
   */
  public Car(String model, String color, int weight, int speed) {
    super(model, color, extracted(), weight, speed);
  }

  private static int extracted() {
    return 4;
  }

}
