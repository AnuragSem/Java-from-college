import java.util.Scanner;
class Main
{
    public static void main (String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int a[][] = new int[n][];
        int s[]=new int[n];
        System.out.println("enter the number of column corresponding to each row atarting from fist row");
        for (int i = 0; i < n;i++)
        {
	        s[i] = sc.nextInt();
	        a[i] = new int[s[i]];
        }
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("the elements of array are ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
   }
}
