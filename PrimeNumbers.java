import java.util.Scanner;
class PrimeNumbers{
   public static void main(String[] args) {
    int n;
    boolean flag = true;
    Scanner p = new Scanner(System.in);
    System.out.println("Enter any number to check it is prime or not:  ");
    n = p.nextInt();
    for (int i = 2;i <= n/2; i++) {
      if(n%i == 0){
        flag = false;
      }
    }
    if(n==1){
      System.out.println("It is not prime number.");
    }
      if(flag == true){
        if(n==2){
            System.out.println("It is a prime number.");
      }
    }
      else{
             System.out.println("It is not prime number.");
    }
//      p.close();
  }
}
