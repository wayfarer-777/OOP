package Seminars.Seminar_1.Robot;

public class RobotCleaner extends Robot {
  String name = "Shadow";

  RobotCleaner() {
    this("NoNaMe");
  }

  RobotCleaner(String name) {
    super(name);
  }

  void printName() {
    System.out.println(name);
    System.out.println(super.name);
  }
}
