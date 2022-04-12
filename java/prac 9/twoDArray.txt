import java.util.Scanner;
class twoDArray
{
    int []a[] = new int [3][3];
    
    void set()
    {
        System.out.println("Enter the elements in array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    void get()
    {
        System.out.println("Elements in the array are :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
    void search()
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(key==a[i][j])
                {
                    count++;
                    System.out.println("element found!");
                    System.out.println("Row");
                    System.out.println(i+1);
                    System.out.println("Column");
                    System.out.println(j+1);
                    System.out.println("");
                }
            }
        }
        if(count==0)
        {
            System.out.println("element nor found");
        }
    }
}

class Main
{
    public static void main (String[] args)
    {
        twoDArray td = new twoDArray();
        td.set();
        td.get();
        td.search();
    }
}