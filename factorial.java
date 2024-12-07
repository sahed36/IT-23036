import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int lower,upper;
        System.out.println("Enter the lower  range: ");
       lower = sc.nextInt();
        System.out.println("Enter the upper range: ");
        upper = sc.nextInt();
        System.out.println("Factorion numbers in the range: ");
        for (int num = lower; num <=upper; num ++){   
        int currentNum =num;
        int sum = 0;
        int fact = 1;
      while(currentNum> 0){
          int digit = currentNum%10;  
          currentNum/=10; 
          for(int i = 2; i <= digit ; i++){
              fact = fact*i; 
          }
          sum += fact;
          fact = 1;
      }  
      if(sum==num){
        System.out.println(num);
      }
}
}
}