/* Factorial of n integer*/


public class factorial {

    public static void main (String [] args)
    {
        int n =5;
        if (n==0)
        {System.out.println(1);}

        for(int i=0;i<=n-1;i++)
            System.out.println(facto(i));

    }

    public static int facto(int n)
    {
        if(n<=1)
        {return 1;}
        return n*facto(n-1);
    }


}
