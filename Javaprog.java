import java.util.*; class Main {
  public static void main(String[] args) {
    int FirstNumber, SecondNumber, ThirdNumber, Product;
    Scanner s = new Scanner(System.in);
    System.out.print("To multiply three numbers, enter the first number:");
    FirstNumber = s.nextInt();
    System.out.print("Enter the second number:");
    SecondNumber = s.nextInt();
    System.out.print("Enter the third number:");
    ThirdNumber = s.nextInt();
    Product = FirstNumber * SecondNumber * ThirdNumber;
    System.out.print("The product of " + FirstNumber + ", " + SecondNumber + " and " + ThirdNumber + " is " + Product + ".\n");
  }
}
