package Seminars.Seminar_1.Robot;

public class Robot {
  // поле состояний
  private int serialNumber;
  protected String name = "NoNaMe";

  /**
   * конструктор по умолчанию
   * @param name2
   */
  Robot(String name2) {
    System.out.println("Robot()");
  }

  protected int getSerialNumber() {
    return serialNumber;
  }

  protected String getName() {
    return name;
  }

  protected void setSerialNumber(int sn) {
    serialNumber = sn;
  }

  protected void setName(String name) {
    this.name = name;
  }
}
