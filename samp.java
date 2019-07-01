interface calc
{
    int add(double a,double b);
    int sub(double a,double b);
    double mul(double a,double b);
    float div(double a,double b);


}

class A implements calc
{  
   add(double a,double b)
   {   
      system.out.println(a+b);

    }
 sub(double a,double b)
   {   
      system.out.println(a-b);

    }
 mul(double a,double b)
   {   
      system.out.println(a*b);

    }
 div(double a,double b)
   {   
      system.out.println(a/b);

    }


}
class text
{
   public static void main(string [] args)
{
    A obj=new A();
    obj.add(5,2);

}

}