import java.util.Scanner;
public class UserInput
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Value of a:");
int a=sc.nextInt();
System.out.println("Enter Value of b:");
int b=sc.nextInt();
int c=a+b;
System.out.println("Addition of a & b is :"+ c);
}
}
