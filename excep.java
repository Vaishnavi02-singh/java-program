class excep
{
public static void main(String args[])
{
try
{
int a=8;
int b=6;
System.out.println(a/b);
}
catch(ArithmeticException e)
{
System.out.println("division by zero is not allowed");
}
System.out.println("hello java");
}

}