class abcd{
    
    int a;    
    void get(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println("Value of a : "+a);
    }
    public static void main(String[] args)
    {   
        abcd m=new abcd();
        m.get(90);
        m.show();
    }
}