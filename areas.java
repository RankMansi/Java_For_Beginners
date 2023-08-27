import java.util.*;

class areas {
    static int area(int s) {
        return s * s;
    }

    static float area(float rl, float rb) {
        return rl * rb;
    }

    static double area(double th, double tb) {
        return th * tb / 2;
    }

    static float area(float sr) {
        return (3.14f * sr * sr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                int s = sc.nextInt();
                int area1 = area(s);
                System.out.println("Area of the square: " + area1);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                float rl = sc.nextFloat();
                System.out.print("Enter the breadth of the rectangle: ");
                float rb = sc.nextFloat();
                float area2 = area(rl, rb);
                System.out.println("Area of the rectangle: " + area2);
                break;
            case 3:
                System.out.print("Enter the height of the triangle: ");
                double th = sc.nextDouble();
                System.out.print("Enter the base of the triangle: ");
                double tb = sc.nextDouble();
                double area3 = area(th, tb);
                System.out.println("Area of the triangle: " + area3);
                break;
            case 4:
                System.out.print("Enter the radius of the circle: ");
                float sr = sc.nextFloat();
                float area4 = area(sr);
                System.out.println("Area of the circle: " + area4);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
