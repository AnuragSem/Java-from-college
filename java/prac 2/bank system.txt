import java.util.Scanner;
class Bank
{
    String name;
    int account_number;
    double amount;
    
    void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you want to deposit");
        float temp = sc.nextFloat();
        amount+=temp;
        System.out.println("");
    }
    void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you want to withdraw *** daily limit 10k ***");
        float temp = sc.nextFloat();
        
        if(temp>10000 || amount < temp)
        {
           System.out.println("The withdrawl request is more than the daily limit or Insufficient balance");
        }
        else
        {
        amount-=temp;
        System.out.println("");
        }
        
    }
    
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter account number");
        account_number = sc.nextInt();
        // sc.nextLine();
        System.out.println("Enter the initial account balance");
        amount = sc.nextFloat();
        System.out.println("");
        
    }
    
    void check_balance()
    {
        System.out.println("Your account balance is :-");
        System.out.println(amount);
        System.out.println("");
    }
    
    void display()
    {
        System.out.println(name);
        System.out.println(account_number);
        System.out.println(amount);
        System.out.println("");
    }
    
    void call()
    {
        insert();
        display();
        deposit();
        check_balance();
        withdraw();
        check_balance();
        display();
    }
}

class Main
{
    public static void main (String[] args)
    {
        Bank b = new Bank();
        b.call();
    }
}