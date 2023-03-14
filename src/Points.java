import java.util.*;
import java.lang.Math;
public class Points {
    private double x;
    private double y;

    public Points(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("Entered coordinates:" + "\nx1 = " + x + "\ny1 = " + y);
    }

    public void moveX(double dx){
        x += dx;
        System.out.println("Moving alone x:" + "\nx = " + x);
    }

    public void moveY(double dy) {
        y += dy;
        System.out.println("Moving alone y:" + "\ny = " + y);
    }

    public double DistantToStart(){
        return Math.sqrt(x*x + y*y);
    }

    public double DistanceBetween(Points p){
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double[] Polar(){
        double r = DistantToStart();
        double t = Math.atan2(y, x);
        return new double[] {r, t};
    }

    public boolean equals(Points p){
        return x == p.x && y == p.y;
    }

    public boolean notEquals(Points p){
        return !equals(p);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3;
        System.out.print("x1 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        x1 = in.nextFloat();
        System.out.print("y1 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        y1 = in.nextFloat();
        Points p1 = new Points(x1, y1);

        System.out.println("Enter for another point:");
        System.out.print("x2 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        x2 = in.nextFloat();
        System.out.print("y2 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        y2 = in.nextFloat();
        Points p2 = new Points(x2, y2);

        System.out.println("Enter point for moving:");
        System.out.print("x3 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        x3 = in.nextFloat();
        System.out.print("y3 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        y3 = in.nextFloat();

        System.out.println("Moved points:");
        p1.moveX(x3);
        p1.moveY(y3);

        System.out.println("Distance to the origin of the coordinates: " + p1.DistantToStart());
        System.out.println("Distance between points: " + p1.DistanceBetween(p2));
        double[] polar = p1.Polar();
        System.out.println("Radius: " + polar[0] + "\nAngle: " + polar[1]);

        if(p1.equals(p2)){
            System.out.println("The points match!");
        } else {
            System.out.println("The points don't match!");
        }
    }
}

