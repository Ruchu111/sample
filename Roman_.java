import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public interface Roman_new {
     int convert(char a);
     int check(char a);
}


class Roman_Interface implements Roman_new{
    static int countd=0,countv=0,countl=0,b=1;
    public int convert(char a)
    {
        int b=0;
        if(a=='L')
            b=50;
        if(a=='X')
            b=10;
        if(a=='I')
            b=1;
        if(a=='C')
            b=100;
        if(a=='M')
            b=1000;
        if(a=='D')
            b=500;
        if(a=='V')
            b=5;
        return b;
    }
    
    public int check(char a)
    {
        if(a=='D')
            countd++;
        if(a=='L')
            countl++;
        if(a=='V')
            countv++;

        if(countl>1 || countv>1 || countd>1)
        {
            b=0; return 0;    
        }    
        
            else return 1;
    }
}


public class Roman_  
{

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        Roman_Interface obj=new Roman_Interface();
        System.out.println("hiiiii");
        System.out.println("enter the roman numeral");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        int a,r,r1,b=1,sum;
        sum=0;
        char[] stringArray;
        
        try {
            s=br.readLine();
            System.out.println("output"+s);
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
            
            //int i=Integer.parseInt(a);
        
        //int len=s.length();
        stringArray=s.toCharArray();
        
        for(int i=0;i<stringArray.length;i=i+1)
        {
            //System.out.println(i);
            a=obj.check(stringArray[i]);
            if(a==1)
            {
                
                //q=(int)(s[i]-'0');
                r=obj.convert(stringArray[i]);
                //    sysout ("%d \n",r);
                if(i+1<stringArray.length)
                {
                    //q1=(int)(s[i+1]-'0');
                r1=obj.convert(stringArray[i+1]);
                if(r1>r) 
                {
                    if(r==1) 
                    {
                        if(r1==10 || r1==5)
                        System.out.println("");
                         else
                     {
                         b=0; System.out.println("hola");
                         break;
                     }
                    }
                     
                    
                    if(r==10)
                    {
                        if(r1==50 || r1==100) System.out.println("");
                     else
                     {
                         b=0;
                         break;
                     }
                    }    
                     if(r==100)
                     {
                        if(r1==500 || r1==1000)     System.out.println("");
                     else
                     {
                         b=0;
                         break;
                     }
                    }
                     if(r==5 || (r==50 || r==500))
                     {
                         b=0;
                         break;
                     } 
                    r=r*-1;
                
                }
                }    
                sum=sum+r;
            }
        }
           //System.out.println("output"+i);
        
        if(b==1)
            System.out.println("sum"+sum);
                else
                    System.out.println("WRONG INPUT");
            try {
                br.close();
            } 
            catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        

    }

}