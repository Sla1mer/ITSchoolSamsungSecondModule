import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первую дробь");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Введите вторую дробь");
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println("Введите число, которое будет выполнять проверку");
        float n = in.nextFloat();


        HomeWorkFunc1 homeWorkFunc1 = new HomeWorkFunc1(a,b,c,d,n);

        homeWorkFunc1.Read(); // Функция которая читает переменные

        homeWorkFunc1.Display(); // Функция которая выводит на экран








//        double a = in.nextDouble();
//        double b = in.nextDouble();
//        double c = in.nextDouble();
//        Triangle triangle = new Triangle(a,b,c);
//        System.out.println("Создан треугольник со сторонами a="
//        + triangle.getA()+ " b="+triangle.getB()+ " c="+triangle.getC());
//        System.out.println("Площадь "+triangle.getArea());
//        System.out.println("Периметр "+triangle.getPerimetr());
//
    }
}
