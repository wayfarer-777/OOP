package Seminars.Seminar_1.Auto;

public class programAuto {
  /**
   * На языке Java реализовать следующий набор классов,
   * при этом должна быть выделена их иерархия:
   * 2.1.Транспортное средство
   * 2.2.Автомобиль
   * 2.3.Мотоцикл
   * 2.4.Грузовик
   * 2.5.Велосипед
   * Во всех классах должны быть написаны поля: цвет, модель,
   * количество колёс, вес и скорость а так же метод ехать.
   * В классе Program реализовать метод который будет работать
   * с любым наследником класса ровно так же как и с родителем,
   * то есть показать значение всех его публичных свойств и
   * вызвать метод ехать.
   */

  public static void main(String[] args) {
    Car car_1 = new Car("KIA-Rio", "Красный", 2000, 300);
    System.out.println(car_1.getInfo());
    car_1.moov();

    Truck truck_1 = new Truck("1111", "Белый", 3000, 55);
    System.out.println(truck_1.getInfo());
    truck_1.moov();

    Motorcycle motorcycle_1 = new Motorcycle("Сузуки", "зеленый", 600, 400);
    System.out.println(motorcycle_1.getInfo());
    motorcycle_1.moov();

    Bicycle bicycle_1 = new Bicycle("Орленок", "Синий", 10, 20);
    System.out.println(bicycle_1.getInfo());
    bicycle_1.moov();
  }

}
