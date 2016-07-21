
public class ArmsInter{
public static int main(String args[])
{
    int  i, temp1, temp2, remainder, n = 0, result = 0;
System.out.println("Enter two numbers(intervals): ");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Armstrong numbers between %d an %d are: ", n1, n2);

    for(i = a+1; i<b; ++i)
    {
        temp2 = i;
        temp1 = i;
        while (temp1 != 0)
        {
            temp1 /= 10;
            ++n;
        }
        while (temp2 != 0)
        {
            remainder = temp2%10;
            result += pow(remainder, n);
            temp2 /= 10;
        }
        if (result == i) {
            printf("%d ", i);
        }
        n = 0;
        result = 0;
    }
    return 0;
}
}
