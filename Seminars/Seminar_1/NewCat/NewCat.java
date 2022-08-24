package Seminars.Seminar_1.NewCat;

public class NewCat {
  // поля состяний
  String name;
  int age;

  /**
   * конструктор по умолчанию (дефолтный)
   * для домашних котов
   * 
   * @param name - имя кота
   * @param age  - возраст кота
   */
  public NewCat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * конструктор по умолчанию (дефолтный)
   * для уличных котов (ни возраста, ни имени)
   */
  public NewCat() {

  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // создаем экземпляр домашнего кота
    NewCat barsik = new NewCat("Barsik", 5);
    System.out.println("Домашний кот " + barsik.name);
    // создаем экземпляр уличного кота
    NewCat streetCat = new NewCat();
    System.out.println("Снова подобрали кота!"+streetCat);
  }
}
