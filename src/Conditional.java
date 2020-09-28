import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your working hours a week : ");
        int hour = input.nextInt();
        int basepay = 10;


        if (hour > 35){ //overtime Pay
            int overtime = hour - 35;
            double overtimepay = overtime * basepay * 1.5;
            double weeklypay = basepay * hour + overtimepay;
            System.out.println("your weekly payment : " + weeklypay);

        }else {
            double weeklypay = basepay * hour;
            System.out.println("your weekly payment : " + weeklypay);
        }


    }
}
