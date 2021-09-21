import java.util.Random;

/*
Lab 4
Me: Tanner Daria. Partner: Maggie Korte.
Date: 9/21
*/

class Main {
  public static void main(String[] args) {
    
    Random r = new Random();

    int randomNum = r.nextInt(50) + 1;

    System.out.println("The Random Number is: " + randomNum);

    for (int i=randomNum; i>=0 && i<=50; i--)
    {
      System.out.println(i);
    }

      if (randomNum <= 5){
      System.out.println("Ahoy Mateys!");
      }
      else if (randomNum > 25 && randomNum < 42){
      System.out.println("Cannonball!");
      }
      else{
      System.out.println("Blast off!");
      }
  }
}