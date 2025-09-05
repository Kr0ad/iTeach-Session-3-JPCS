package IT1Methods;

import java.util.Scanner;

public class Exercise1 {
    
    public static int getArea(int length, int  width) {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length;
        int width;

        System.out.println("Length: " );
        length = sc.nextInt();
        System.out.println("Width: ");
        width = sc.nextInt();

        int area = getArea(length, width);

        System.out.println("Area of rectangle 1: " + area);
        System.out.println("Area of rectangle 2: " + area);
        System.out.println("Area of rectangle 3: " + area);


    }
}
