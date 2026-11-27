class excep1
{
public static void main(String args[])
{
try
{
System.out.println("outer try starts");
try
{
System.out.println(5/0);
System.out.println("inner try start");
}
catch(Exception e)
{
System.out.println("ager try me exception nhi aati to ye block nhi chalega");
}
}
catch(Exception e1)
{
System.out.println("ager first try me exception nhi aati to ye block nhi chalega");
}
}
}