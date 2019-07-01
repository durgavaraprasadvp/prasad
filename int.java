abstract class Employee
{
   string name;
   int salary;
   int age;

void getName(string name)
  {
       this.name=name;
return name;
  } 
 void getSalary(int salary)
  {
       this.salary=salary;
return salary;
  } 
void getAge(int age)
  {
      this.age=age; 
return age;
  } 
}

class Emp extends Employee
{
  
void  display()
{
  system.out.println("Details of employes");
}

}s

class text
{
  public static void main(string [] args)
 {
   Emp a=new Emp();
   a.getName("prasad");
   a.getSalary(10000000);
   a.getAge(19);
   a.display();
}
}