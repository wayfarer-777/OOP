package Seminars.Seminar_1.Car;

public class Car {
  // поля состояний объекта Car
  private String model;
  private int maxSpeed;

  // конструктор для класса Car
  public Car(String model, int maxSpeed) {
    this.model = model;
    this.maxSpeed = maxSpeed;
  }

  public static void main(String[] args) {
    Car bugatti = new Car("Bugatti Veyron", 407);
    System.out.println(bugatti.model);
    System.out.println(bugatti.maxSpeed);
  }
}
