class A
{
static int x=5;
int y=5;
}
class print
{
public static void main(String args[])
{
A a1=new A();
A a2=new A();
a1.x=10;
a1.y=10;
System.out.println(a2.x+" " +a2.y); 
}
}