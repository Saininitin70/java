import java.io.*;

class ongc {
 public static void main(String[] args) throws IOException
 {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    System.out.println("enter the number");
    int a = Integer.parseInt(br.readLine());
    int i;
    for(i=1;i<=10;i++)
    {
        System.out.println(a+"*"+i+"="+a*i);
    }

 }
    
}
