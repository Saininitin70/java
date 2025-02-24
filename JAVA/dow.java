class rahul
{
    int a=80,b=90;
}

class sum extends rahul
{
    int s;
   public void show()
    {
        s=a+b;
        System.out.println("sum ="+s);
    }
}

class multiply extends rahul
{
     int n;
    public void show()
    {
        n=a*b;
        System.out.println("multiply= "+n);
    }
}
class subtract extends rahul
{
     int x;
    public void show()
    {
        x=a-b;
        System.out.println("subtract= "+x);
    }
}

class dow
{
    public static void main(String h[])
    {
            sum m=new sum();
            m.show();
            
            multiply n=new multiply();
            n.show();

            subtract b=new subtract();
            b.show();
    }
}