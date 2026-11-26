abstract class sound
{
abstract void sound();
}
class dog extends sound
{
int x=8;
dog()
{
System.out.println(x);
}
void sound()
{
System.out.println("dog barks");
}
}
class cat extends sound
{
void sound()
{
System.out.println("cat mewo");
}
}

class animal
{
public static void main(String args[])
{
dog d1=new dog();
d1.sound();
cat c1=new cat();
c1.sound();
}
}