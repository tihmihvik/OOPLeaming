import java.util.Scanner;

/**
 *
 */
public final class Point {
    double x, y;

    void  move(double dx, double dy){
        x += dx;
        y += dy;

    }
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        double x = in.nextDouble();
        System.out.println("Введите значение y: ");
        double y = in.nextDouble();
        move(x, y);
    }
    double getDinston(Point a){
        return Math.sqrt(Math.pow(x-a.x,2) + Math.pow(y-a.y,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
