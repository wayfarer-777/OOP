package Seminars.Seminar_1.Robot;

public class RobotShow {
  public static void main(String[] args) {
    Robot rb = new Robot(null);
    System.out.println("rb.getName = " + rb.getName());

    RobotCleaner rc = new RobotCleaner();
    rc.setName("Уборщик помещений");
    System.out.println("rc.getName = " + rc.getName());
  }
}
