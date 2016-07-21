public class Intervals{
public static int main(String[] args)
{
Scanner s=new Scanner(System.in);
    int n1, n2, i, flag;
    System.out.println("Enter two numbers(intevals):");
    int a=s.nextInt();
    int b=s.nextInt();
    while (a < b)
    {
        flag=0;

        for(i=2; i<=a/2; ++i)
        {
            if(a%i == 0)
            {
                flag=1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ",a);

        ++a;
    }

    return 0;
}
