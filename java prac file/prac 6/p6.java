
class Main
{
    public static void main(String args[])
    {
        //concat in String object
        String s = "Java";
        s.concat("Welcome");
        System.out.println(s.concat("Welcome"));
        //this will print javaWelcome but will not change the content of s
        System.out.println(s);
        
        //char at index 1
        System.out.println("Character at index 1 is -: "+ s.charAt(1));
        
        //index of first 'a'
        System.out.println("Index of first 'a' -:"+s.indexOf('a'));
        
        //index of second 'a'
        System.out.println("index of second 'a'-:"+s.indexOf('a',2));
        
        //comparing s or java with JAVA including cases
        System.out.println("comparing s or java with JAVA including cases -:"+s.equals("JAVA"));
        
        //comparing s or java with JAVA Excluding cases
        System.out.println("comparing s or java with JAVA Excluding cases -:"+s.equalsIgnoreCase("JAVA"));
        
        //index of 'a' from last
        System.out.println("index of 'a' from last -:"+s.lastIndexOf('a'));
        
    }
}