import java.util.Scanner;

public class totalsurfaceareaofcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Enter the value of r : ");
        int r = in.nextInt();
        System.out.print("Enter the value of h : ");
        int h = in.nextInt();
        // char totalsurfaceareaofcylinder = 2*pi*r*h;
        System.out.println("The Total surface area of the cylinder is " + 2 * pi * r * (h + r));

    }
}
