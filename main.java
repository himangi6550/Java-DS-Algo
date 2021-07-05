class Parent
{
       int a=100;
       public void display()
       {
              System.out.println("Display in parent A: "+a);
       }
}

class Child extends Parent
{
       int b=200;

       public void display()
       {
              System.out.println("Display in parent B: "+b);
       }
}

public class main
{
       public static void main(String args[])
       {
              Parent obj = new Child();
              obj.display();
       }
}