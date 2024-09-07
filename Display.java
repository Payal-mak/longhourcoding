import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int empid = sc.nextInt();
        System.out.println("Enter Employee name: ");
        String name = sc.next();
        System.out.println("Enter Employee date: ");
        int date = sc.nextInt();
        System.out.println("Employee id is: "+empid);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee date is: "+date);
    }
}
