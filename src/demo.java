public class demo {
    public static void main(String []args)
    {

        for(int i=0 ; i<=5 ; i++)
        {
            for(int s=i ; s<=5 ; s++)
            {
                System.out.print(" ");
            }

            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
