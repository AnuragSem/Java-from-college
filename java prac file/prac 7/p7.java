
class Main
{
    public static void main(String args[])
    {
        
        StringBuffer s = new StringBuffer("java");
        //apending Welcome in java
        s.append("Welcome");
        System.out.println("apending Welcome in java");
        System.out.println(s);
        
         s= new StringBuffer("java");
        //inserting "Java" at index 1
        s.insert(1,"Java");
        System.out.println("inserting 'Java' at index 1");
        System.out.println(s);
        
        s= new StringBuffer("java");
        //replacing Java between index 1,2
        s.replace(1,2,"Java");
        System.out.println("replacing Java between index 1,2");
        System.out.println(s);
        
        s= new StringBuffer("java");
        //delete between 1 and 2
        s.delete(1,2);
        System.out.println("delete between 1 and 2");
        System.out.println(s);
        
        //reverse a string
        s= new StringBuffer("HELLO");
        s.reverse();
        System.out.println("reverse of the string");
        System.out.println(s);
    }
}