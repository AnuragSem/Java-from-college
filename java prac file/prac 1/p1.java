import java.util.Scanner;
class Student
{
    int id;
    String name;
    String branch;
    String university;

    void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the name of branch");
        branch= sc.nextLine();
        System.out.println("Enter the name of university");
    	university = sc.nextLine();
    }
    
    void showDetails()
    {
	System.out.println("Student details are :");
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(university);
    }
}

class Main
{
    public static void main (String[] args)
    {
        Student s = new Student();
        s.setDetails();
        s.showDetails();
    }
}