abstract class sound
{
abstract void sound();
}
class dog extends sound
{
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
}
}