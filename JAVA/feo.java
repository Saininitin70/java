import java.io.*;
class feo{
    public static void main(String []h)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the month number  =");
        String st=br.readLine();
        int mnth=Integer.parseInt(st);
    
        
        switch(mnth)
        {
            case 1,2,11,12:
                System.out.println("winter");
                break;
            case 3,4,5,6:
                System.out.println("rainy season");
                break;
            case 7,8,9,10:
                System.out.println("summer");
                break;
           
            default:
                System.out.println("Wrong month Number");
                break;
            
        }
        }  
    }