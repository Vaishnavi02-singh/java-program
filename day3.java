class doo
{
    private static int a;  //private static member variable cannot accessable other class so we create a static method.
    private static int b;
    static void fun1()
    {
       a=8;
       b=3;
       System.out.println(a+b);
       System.out.println("hello java");

    }
}

class day3
{
      public static void main(String args[])
      {
         System.out.println("first print");
         doo.fun1();
         System.out.println("Last print");
       }
}