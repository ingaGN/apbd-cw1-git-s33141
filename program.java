import java.util.Scanner

public class Main{
    public static void main() {
        System.out.println("hi!");

        getName();
    }

    public void getName(){
        System.out.printf("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    }
    
    public void CaluculateAverage(int[] values){
        System.out.println("calcuate");
    }

    public void CalculateMax(int[] values){
        System.out.println("zmiana");
    }
}