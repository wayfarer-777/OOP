package Seminars.Seminar_1.Test;

public class Test {
  public static void main(String[] args) {
    // Cat cat_1 = new Cat("Мурка", "серая");
    // cat_1.setName("Мурка");
    // cat_1.setColor("серая");
    // System.out.println(cat_1.getName());
    // System.out.println(cat_1.getColor());
    // System.out.println("Имя кошки: " + cat_1.getName() + "\nЦвет кошки :" +
    // cat_1.getColor());

    // Box catBox = new Box();
    // catBox.width = 400;
    // catBox.height = 200;
    // catBox.depth = 250;
    // int volume = catBox.width * catBox.height * catBox.depth;
    // // mInfoTextView.setText("Объем коробки: " + volume);
    // System.out.println("Объем коробки: " + volume);
    // Box bigBox = new Box();
    // Box smallBox = new Box();
    // int volume;

    // присвоим значения переменным для большой коробки
    // bigBox.width = 400;
    // bigBox.height = 200;
    // bigBox.depth = 250;

    // // присвоим значения переменным для маленькой коробки
    // smallBox.width = 200;
    // smallBox.height = 100;
    // smallBox.depth = 150;

    // // вычисляем объем большой коробки
    // volume = bigBox.width * bigBox.height * bigBox.depth;
    // System.out.println("Объем большой коробки: " + volume);
    // // вычисляем объем маленькой коробки
    // volume = smallBox.width * smallBox.height * smallBox.depth;
    // System.out.println("Объем маленькой коробки: " + volume);
    // // cat_1.meow();

    // // instanceof - принадлежность объекта к классу
    // if (cat_1 instanceof Cat) {
    // cat_1.meow();
    // }

    // метод с переменным числом аргументов
    // public static double getMaxValue(double... values) {
    // double largest = Double.MIN_VALUE;
    // for (double v : values) {
    // if (v > largest) {
    // largest = v;
    // }
    // }
    // return largest;
    // }

    Object obj = new Cat("Barsik", null);
    System.out.println("Имя кошки: " + ((Cat) obj).getName() + "\nЦвет кошки :" +
        ((Cat) obj).getColor());
    Box catBox = new Box();
    // catBox.width = 200;
    // catBox.height = 100;
    // catBox.depth = 250;
    catBox.setDim(200, 100, 230);
    System.out.println(catBox.getVolume());
    System.out.println(catBox.toString());
    ((Cat) obj).meow();
    Box catBox_1 = new Box();
    System.out.println(catBox_1.getVolume());
    Box catBox_2 = new Box(10, 20, 30);
    System.out.println(catBox_2.getVolume());

    Box cube = new Box(10);
    int vol = cube.getVolume();
    System.out.println("Объем куба: " + vol);

    Box box_1 = new Box(100, 200, 100);
    Box cloneBox = new Box(box_1);
    int vol_1 = cloneBox.getVolume();
    System.out.println("Объем коробки: " + vol_1);
    HeavyBox box = new HeavyBox(15, 10, 20, 5);
    System.out.println(box.getVolume());
    System.out.println(box.toString());
  }

  // double variable = getMaxValue(5.3, 39.6, -4); - не прошло!!!
  // походу я выпал за границы main

}
