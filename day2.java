//Static members and innstance members.

class one
{
int a;  //Instance member variable and method accessable in other class after create an object.
int b;
static int z=9;  //static member variable and method accessable in other call without create any object.
}
class day2
{
public static void main(String args[])
{
one o1 =new one();
o1.a=6;
o1.b=4;
System.out.println(o1.a);
System.out.println(o1.b);
System.out.println(one.z);
}
}

