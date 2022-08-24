package Seminars.Seminar_1.Cat;

public class program {
  public static void main(String[] args) {
    Cat cat = new Cat("Black", 3, 5, "Barsik");
    // cat.setName("Barsik");
    // cat.setWeight(3);
    // cat.setAge(5);
    // cat.setColor("Black");
    System.out.println("Cat name: " + cat.getName() + "\nCat color :" + cat.getColor()
        + "\nCat age: " + cat.getAge() + "\nCat weight: " + cat.getWeight());
  }
}
