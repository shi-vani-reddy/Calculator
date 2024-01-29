import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println(i);
Double i=sc.nextDouble();
Double j=sc.nextDouble();
char op=sc.next().charAt(0);
Double r = 0.00;
switch(op)
{
case '+':
    r=i+j;
    break;
case '-':
    r=i-j;
    break;
case '*':
    r=i*j;;
    break;
case '/':
    r=i/j;
    break;
}
System.out.println(r);
}
}