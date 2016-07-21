class Pow{
public static void main(String angt[]){
     Scanner data = new Scanner(System.in);
      int num1, num2;
      double num;
      System.out.println("Enter a number");
      num1=data.nextInt();
      System.out.println("Enter a power of the number");
      num2=data.nextInt();
      num=Math.pow(num1,num2);
      System.out.println("Answer:"+num);
  }
}
