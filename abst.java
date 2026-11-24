abstract class abs
{
int x;
int y;
abstract void roi();
}
class savingac extends abs
{
void roi()
{
System.out.println("your roi created");

}
}
class currentac extends abs
{
void roi(int x)
{
//System.out.println("your current account roi created");
System.out.println(x);

}
void roi()
{
System.out.println("hello");
}

}
class abst
{
public static void main(String args[])
{
savingac s1=new savingac();
currentac c1=new currentac();
s1.roi();
c1.roi(5);
}
}