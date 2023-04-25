import java.util.*;
import java.lang.Math;
class onlyNumbers {
    static Scanner input = new Scanner(System.in);
    public static int getInt(){
        while (!input.hasNextInt()){
            input.next();
            System.out.println("Just number!");
        }
        int a = input.nextInt();
        return a;
    }
    public static double getDouble(){
        while (!input.hasNextDouble()){
            input.next();
            System.out.println("Just number!");
        }
        double a = input.nextDouble();
        return a;
    }
}
public class Points {
    private double x;
    private double y;
    public Points(int x, int y){
        this.x = (double) x;
        this.y = (double) y;
    }
    public Points(double x, double y) {
        this.x = x > 0 ? x : 0;
        this.y = y > 0 ? y : 0;
    }
    public Points(double x){
        this.x = x;
        this.y = 0;
    }
    public Points() {
        this.x = 0;
        this.y = 0;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public void moveX(double dx){
        this.x += dx;
        System.out.println("Moving alone x:" + "\nx = " + this.x);
    }
    public void moveY(double dy) {
        this.y += dy;
        System.out.println("Moving alone y:" + "\ny = " + this.y);
    }
    public double distantToStart(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double distanceTo(Points otherPoint){
        double dx = x - otherPoint.getX();
        double dy = y - otherPoint.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double[] Polar(){
        double r = distantToStart();
        double t = Math.atan2(this.y, this.x);
        return new double[] {r, t};
    }
    public boolean equals(Points p){
        return this.x == p.x && this.y == p.y;
    }
    public boolean notEquals(Points p){
        return !equals(p);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3;

        System.out.println("Enter the coordinates of the point:");
        System.out.print("x1 = ");
        x1 = onlyNumbers.getDouble();

        System.out.print("y1 = ");
        y1 = onlyNumbers.getDouble();

        Points p1 = new Points(x1, y1);

        System.out.println("Enter for another point:");
        System.out.print("x2 = ");
        x2 = onlyNumbers.getDouble();

        System.out.print("y2 = ");
        y2 = onlyNumbers.getDouble();
        Points p2 = new Points(x2, y2);

        System.out.println("Enter point for moving:");
        System.out.print("x3 = ");
        x3 = onlyNumbers.getDouble();

        System.out.print("y3 = ");
        y3 = onlyNumbers.getDouble();

        System.out.println("Moved points:");
        p1.moveX(x3);
        p1.moveY(y3);

        System.out.println("Distance to the origin of the coordinates: " + p1.distantToStart());
        System.out.println("Distance between points: " + p1.distanceTo(p2));
        double[] polar = p1.Polar();
        System.out.println("Radius: " + polar[0] + "\nAngle: " + polar[1]);

        if(p1.equals(p2)){
            System.out.println("The points match!");
        } else {
            System.out.println("The points don't match!");
        }
    }
}
//import java.util.*;
//import java.lang.Math;
//public class Points {
//    private double x;
//    private double y;
//
//    public Points(double x, double y){
//        this.x = x;
//        this.y = y;
//        System.out.println("Entered coordinates:" + "\nx1 = " + x + "\ny1 = " + y);
//    }
//    public Points(double x){
//        this.x = x;
//        this.y = 0;
//    }
//    public Points(float y){
//        this.x = 0;
//        this.y = y;
//    }
//    public double getX() {
//        return x;
//    }
//    public void setX(double x) {
//        this.x = x;
//    }
//    public double getY() {
//        return y;
//    }
//    public void setY(double y) {
//        this.y = y;
//    }
//    public void moveX(double dx){
//        x += dx;
//        System.out.println("Moving alone x:" + "\nx = " + x);
//    }
//
//    public void moveY(double dy) {
//        y += dy;
//        System.out.println("Moving alone y:" + "\ny = " + y);
//    }
//
//    public double DistantToStart(){
//        return Math.sqrt(x*x + y*y);
//    }
//
//    public double DistanceBetween(Points p){
//        double dx = p.x - x;
//        double dy = p.y - y;
//        return Math.sqrt(dx*dx + dy*dy);
//    }
//
//    public double[] Polar(){
//        double r = DistantToStart();
//        double t = Math.atan2(y, x);
//        return new double[] {r, t};
//    }
//
//    public boolean equals(Points p){
//        return x == p.x && y == p.y;
//    }
//
//    public boolean notEquals(Points p){
//        return !equals(p);
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
////        double x1, y1, x2, y2, x3, y3;
////
////        System.out.print("x1 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! x1 = ");
////        }
////        x1 = in.nextFloat();
////
////        System.out.print("y1 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! y1 = ");
////        }
////        y1 = in.nextFloat();
////        Points p1 = new Points(x1, y1);
////
////        System.out.println("Enter for another point:");
////        System.out.print("x2 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! x2 = ");
////        }
////        x2 = in.nextFloat();
////
////        System.out.print("y2 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! y2 = ");
////        }
////        y2 = in.nextFloat();
////        Points p2 = new Points(x2, y2);
////
////        System.out.println("Enter point for moving:");
////        System.out.print("x3 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! x3 = ");
////        }
////        x3 = in.nextFloat();
////
////        System.out.print("y3 = ");
////        while(!in.hasNextFloat()) {
////            in.next();
////            System.out.println("Just number! y3 = ");
////        }
////        y3 = in.nextFloat();
////
////        System.out.println("Moved points:");
////        p1.moveX(x3);
////        p1.moveY(y3);
////
////        System.out.println("Distance to the origin of the coordinates: " + p1.DistantToStart());
////        System.out.println("Distance between points: " + p1.DistanceBetween(p2));
////        double[] polar = p1.Polar();
////        System.out.println("Radius: " + polar[0] + "\nAngle: " + polar[1]);
////
////        if(p1.equals(p2)){
////            System.out.println("The points match!");
////        } else {
////            System.out.println("The points don't match!");
////        }
//
//        Points p1 = new Points(2);
//        Points p2 = new Points(3.2);
//
//    }
//}