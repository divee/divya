public class SubArray{
public bool isSubset(int arr1[], int arr2[], int m, int n)
{
    int i = 0;
    int j = 0;
    for (i=0; i<n; i++)
    {
        for (j = 0; j<m; j++)
        {
           if(arr2[i] == arr1[j])
              break;
        }
        if (j == m)
           return 0;
    }
    return 1;
}
  
public static int main(String args[])
{
    int arr1[] = {11, 1, 13, 21, 3, 7};
    int arr2[] = {11, 3, 7, 1};
   
    int m = sizeof(arr1)/sizeof(arr1[0]);
    int n = sizeof(arr2)/sizeof(arr2[0]);
 SubArray s=new SubArray();
 s.is Subset(arr1,arr2,m,n);
    if(s.isSubset(arr1, arr2, m, n))
      System.out.println("arr2[] is subset of arr1[] ");
    else
      System.out.println("arr2[] is not a subset of arr1[]");      
 
    getchar();
    return 0;
}
}
