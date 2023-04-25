import java.util.*;
public class Matrix {
    private final double[][] matrix = new double[2][2];
    public Matrix(double a00, double a01, double a10, double a11){
        matrix[0][0] = a00;
        matrix[0][1] = a01;
        matrix[1][0] = a10;
        matrix[1][1] = a11;
    }
    public double determinant(){
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public void inv(){
        double det = determinant();
        if(det == 0){
            throw new RuntimeException("Matrix does not exist, because the determinant is equal to zero!");
        }
        double a00 = matrix[0][0] / det;
        double a01 = -matrix[0][1] / det;
        double a10 = -matrix[1][0] / det;
        double a11 = matrix[1][1] / det;
        System.out.println("Inversion: ");
        Matrix.printMatrix(new Matrix(a00, a01, a10, a11).getMatrix());
    }
    public void multiply(Matrix other){
        double a00 = matrix[0][0] * other.matrix[0][0] + matrix[0][1] * other.matrix[1][0];
        double a01 = matrix[0][0] * other.matrix[0][1] + matrix[0][1] * other.matrix[1][1];
        double a10 = matrix[1][0] * other.matrix[0][0] + matrix[1][1] * other.matrix[1][0];
        double a11 = matrix[1][0] * other.matrix[0][1] + matrix[1][1] * other.matrix[1][1];
        System.out.println("Matrix by matrix multiplication: ");
        Matrix.printMatrix(new Matrix(a00, a01, a10, a11).getMatrix());
    }
    public void add(Matrix other){
        double a00 = matrix[0][0] + other.matrix[0][0];
        double a01 = matrix[0][1] + other.matrix[0][1];
        double a10 = matrix[1][0] + other.matrix[1][0];
        double a11 = matrix[1][1] + other.matrix[1][1];
        System.out.println("Matrix addition: ");
        Matrix.printMatrix(new Matrix(a00, a01, a10, a11).getMatrix());
    }
    public void multy(double b){
        double a00 = matrix[0][0] * b;
        double a01 = matrix[0][1] * b;
        double a10 = matrix[1][0] * b;
        double a11 = matrix[1][1] * b;
        System.out.println("Multiplication by a number: ");
        Matrix.printMatrix(new Matrix(a00, a01, a10, a11).getMatrix());
    }
    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public double[][] getMatrix() {
        return matrix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a00, a01, a10, a11, b, c00, c01, c10, c11;

        //Enter matrix
        System.out.println("Enter the matrix:");
        System.out.print("a00 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        a00 = in.nextDouble();
        System.out.print("a01 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        a01 = in.nextDouble();
        System.out.print("a10 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        a10 = in.nextDouble();
        System.out.print("a11 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        a11 = in.nextDouble();
        System.out.println("Entered matrix: ");
        Matrix matrix = new Matrix(a00, a01, a10, a11);
        System.out.println("Matrix:");
        Matrix.printMatrix(matrix.getMatrix());

        //Enter matrix2
        System.out.println("Enter the matrix2: ");
        System.out.print("c00 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        c00 = in.nextDouble();
        System.out.print("c01 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        c01 = in.nextDouble();
        System.out.print("c10 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        c10 = in.nextDouble();
        System.out.print("c11 = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        c11 = in.nextDouble();
        System.out.println("Entered matrix: ");
        Matrix matrix2 = new Matrix(c00, c01, c10, c11);
        System.out.println("Matrix:");
        Matrix.printMatrix(matrix2.getMatrix());

        //Enter the number to multiply
        System.out.print("b = ");
        while(!in.hasNextFloat()) {
            in.next();
            System.out.println("Just number!");
        }
        b = in.nextDouble();

        System.out.println("Determinant: " + matrix.determinant());

        matrix.inv();
        matrix.multiply(matrix2);
        matrix.add(matrix2);
        matrix.multy(b);
    }
}
