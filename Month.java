import java.util.Scanner;
public class Month
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter month number:");
int a=sc.nextInt();
switch(a)
{
case 1:
System.out.println("January");
case 2:
System.out.println("Febrauary");
case 3:
System.out.println("March");
case 4:
System.out.println("April");
case 5:
System.out.println("May");
case 6:
System.out.println("June");
case 7:
System.out.println("July");
case 8:
System.out.println("August");
case 9:
System.out.println("September");
case 10:
System.out.println("October");
case 11:
System.out.println("November");
case 12:
System.out.println("December");
}
sc.close();
sc=null;
}
}
