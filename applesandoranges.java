import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int s=S.nextInt();
        int t=S.nextInt();
        int a=S.nextInt();
        int b=S.nextInt();
        int m=S.nextInt();
        int n=S.nextInt();
        int apple[]=new int[m];
        int orange[]=new int[n];
        for(int i=0;i<m;i++)
        {
            apple[i]=S.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            orange[i]=S.nextInt();
        }
        int applecount=0;
        int orangecount=0;
        for(int i=0;i<m;i++)
        {
            int pos=a+apple[i];
            if(pos>=s && pos<=t)
            {
              applecount++;  
            }
        }
        for(int i=0;i<n;i++)
        {
            int pos=b+orange[i];
            if(pos>=s && pos<=t)
            {
              orangecount++;  
            }
        }
        System.out.println(applecount);
        System.out.println(orangecount);
    }
}