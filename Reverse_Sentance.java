
import java.util.Scanner;


public class Reverse_Sentance 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of testcases");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter String");
            String a=sc.next();
            String a1[]=a.split("\\.");
            String a2="";
            for(int j=a1.length-1;j>0;j--)
            {
                a2+=a1[j]+".";
            }
            a2+=a1[0];
            System.out.println(a2);
        }
    }
    
}
