class Sum
{
    void sum(int a,int b)
    {
	System.out.println("The sum of the two numbers is :-");
        System.out.println(a+b);
    }
}

class Main
{
    public static void main (String[] args)
    {
        Sum s = new Sum();
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        s.sum(x,y);
    }
}