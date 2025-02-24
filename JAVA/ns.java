import java.io.*;

class ns{
    public static void main(String []h )throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the first number");
    int a = Integer.parseInt(br.readLine());

    System.out.println("Enter the second number");
    int b=Integer.parseInt(br.readLine());

    System.out.println("Enter the third number");
    int c=Integer.parseInt(br.readLine());

    if(a>b && a>c){
        System.out.println("a is greatest number "+a);
    }
        else{
            if(b>c && b>a){
                System.out.println("b is greatest number " +b);
            }
        else{
            System.out.println("c is greatest number "+c);
        }
        }

    }

}