import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String department;
    float salary;
    
    Employee()
    {
        
        System.out.println("default Constructor");
        id=0000;
        name="anonymous";
        department="CSIT";
        salary=0.0f;
    }
    
    void setDetails(int id,String name,String department,float salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    
    void showDetails()
    {
        System.out.println("");
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(salary);
    }
    
}
class Main
{
    public static void main (String[] args)
    {
        Employee e = new Employee();
	e.showDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String b = sc.nextLine();
        System.out.println("Enter department");
        String c= sc.nextLine();
        System.out.println("Enter salary");
        float d = sc.nextFloat();
        e.setDetails(a,b,c,d);
        e.showDetails();
    }
}