package Seminars.Seminar_1.Cat;

public class Cat {
  private String color;
  private int weight;
  private int age;
  private String name;

  // создаем конструктор класса Cat
  public Cat(String color, int weight, int age, String name) {
    this.color = color;
    this.weight = weight;
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return name;
  }
  // пример модификатора
  // public void setName(String name) {
  // this.name = name;
  // }

  // пример селектора
  public String getColor() {
    return color;
  }

  // public void setColor(String color) {
  // this.color = color;
  // }

  public int getWeight() {
    return weight;
  }

  // public void setWeight(int weight) {
  // this.weight = weight;
  // }
  public int getAge() {
    return age;
  }

  // public void setAge(int age) {
  // this.age = age;
  // }
}