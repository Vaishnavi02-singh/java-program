class parse
{
public static void main(String args[])
{
System.out.println(""+Integer.parseInt("10")+Integer.parseInt("20"));
System.out.println(Integer.parseInt("10")+Integer.valueOf("20"));
System.out.println(Integer.parseInt("110",2));

System.out.println(Integer.parseInt("12.5"));
}
}