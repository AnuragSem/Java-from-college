class Bank
{
    float getroi()
    {
        return 0.0f;
    }
}

class HDFC extends Bank
{
    float getroi()
    {
        System.out.println("HDFC");
        return 4.0f;
    }
}

class PNB extends Bank
{
    float getroi()
    {
        System.out.println("PNB");
        return 5f;
    }
}

class SBI extends Bank
{
    float getroi()
    {
        System.out.println("SBI");
        return 4.5f;
    }
}

class Main
{
    public static void main(String args[])
    {
        Bank b;
        b = new HDFC();
        System.out.println(b.getroi()+"%");
        b= new PNB();
        System.out.println(b.getroi()+"%");
        b=new SBI();
        System.out.println(b.getroi()+"%");
    }
}