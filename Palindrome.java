class Palindrome{ 
     public static void main(String args[]){ 
       System.out.print("Enter Number: ");
       Scanner read = new Scanner(System.in);
       int num = read.nextInt();
       int n = num;
       int rev=0,a; 
       while(num>0) 
       { 
         a=num%10; 
         rev=rev*10+a; 
         num=num/10; 
       } 
       if(rev==n) 
         System.out.println(n+" is a Palindrome Number!"); 
       else 
         System.out.println(n+" is not a Palindrome Number!"); 
     } 
}
