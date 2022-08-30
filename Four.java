import java.util.*;
class Four
{
public static void main()
{
int nums,result=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
nums = sc.nextInt();
for(int i=1;i<=nums;i++){    
      result  = result * i;
      
  }    
  System.out.println(" Factorial of  "+ nums + " = " + result );
}
}
