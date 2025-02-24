class interest
{
    int p=5000,t=12,r=15;
}
class calculate extends interest
{
    int c;
    public void show()
    {
        c=(p*r*t)/100;
        System.out.println("simple interest =" +c);
    }
} 

class ne 
{
    public static void main(String h[])
    {
        calculate cw=new calculate();
        cw.show();
    }
}