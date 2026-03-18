import java.util.Scanner

public class Main{
    public static void main() {
        System.out.println("hello!");

        getName();
    }

    public void getName(){
        System.out.printf("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    }
}