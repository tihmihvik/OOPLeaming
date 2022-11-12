public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.width = 5;
        rect1.heght = 10;
        rect1.nameOfRect = "Я rect1";

        Rect rect2 = new Rect();
        rect2.width = 1;
        rect2.heght = 2;
        rect2.nameOfRect = "Я rect2";

        Rect rect3 = new Rect();
        rect3.width = 15;
        rect3.heght = 10;
        rect3.nameOfRect = "Я rect3";

        /*System.out.println(rect1==rect2);
        System.out.println(rect1);
        rect1=rect2;
        System.out.println(rect1==rect2);
        System.out.println(rect1);*/

        /*System.out.println(rect1.getArion());
        System.out.println(rect2.getArion());
        System.out.println(rect3.getArion());
        rect3.magnify(1.5);
        System.out.println(rect3.getArion());*/
        Point point1 = new Point();
        Point point2 = new Point();
        point1.input();
        System.out.println(point1);
        point2.input();
        System.out.println(point2);
        System.out.println(point1.getDinston(point2));

        System.out.println("Старт point1");
        point1.move(100,120);
        System.out.println(point1);
        System.out.println(point1.getDinston(point2));
    }
}