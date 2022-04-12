class Student
{
    int id;
    String name;
    String branch;
    String city;
    String university;
    
    //default
    Student()
    {
    }
    
    //paramatised
    Student(int id)
    {
        this.id=id;
        System.out.println("constructor with 1 parameter");
    }
    
    Student(int id,String name)
    {
        this(id);
        System.out.println("constructor with 2 parameter");
        this.name=name;
    }
    
    Student(int id,String name,String branch)
    {
        this(id,name);
        System.out.println("constructor with 3 parameter");
        this.branch=branch;
    }
    
    Student(int id,String name,String branch,String city)
    {
        this(id,name,branch);
        System.out.println("constructor with 4 parameter");
        this.city = city;
    }
    
    Student(int id,String name,String branch,String city,String university)
    {
        this(id,name,branch,city);
        System.out.println("constructor with 5 parameter");
        System.out.println("");
        this.university = university;
    }
    
    void show()
    {
        System.out.println("Student details are :-");
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(city);
        System.out.println(university);
    }
    
}

class Main
{
    public static void main (String[] args)
    {
        Student s = new Student(1,"Frenzy","CSE","Dehradun","GEHU");
        s.show();
        
    }
}