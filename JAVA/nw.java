import java.io.*;

class nw
{
    public static void main(String h[]) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter number");
        String st=br.readLine();
        int x=Integer.parseInt(st);

        System.out.println("enter number");
        String st1=br.readLine();
        int y=Integer.parseInt(st);
        
        int p=1;
        while (y>0) {
            p=p*x;
            y--;
        }
        System.out.println("power ="+p);
    }











}