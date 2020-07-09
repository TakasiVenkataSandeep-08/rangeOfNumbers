import java.util.Scanner;

public class tillFiveDigits {

public static void main(String[] agrs) {
    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number you want to check:");
    n = s.nextInt();
    if(n<=10 && n>=0)
    {
        System.out.println("This is a 1 digit number!");
    }
    else if(n<=99999 && n>=10000)
    {
        System.out.println("This is a 5 digit number!");
    }
    else if(n<=9999 && n>=1000)
    {
        System.out.println("This is a 4 digit number!");
    }
    else if(n<=999 && n>=100)
    {
        System.out.println("This is a 3 digit number!");
    }
    else if(n<=99 && n>=10)
    {
        System.out.println("This is a 2 digit number!");
    }
    else if(n<=0)
    {
        System.out.println("Error!");
    }
    else
    {
        System.out.println("Out of range!");
    }
}
}


