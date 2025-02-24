import java.io.*;
class ftable{
    public static void main(String []h)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter number to print table =");
        String st=br.readLine();
        int n=Integer.parseInt(st);

        int x,r;
        for(x=1;x<=10;x++){
            r=n*x;
            System.out.println(n+"*"+x+"="+r);
        }
    }
}