package IT1Methods;

public class areaOfCircle {

    public static int areaOfSquare(int side) {
        int area = side * side;
        return area;
    }

    public static double areaOfCircle(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {

        System.out.println(areaOfSquare(4));


    }
}
