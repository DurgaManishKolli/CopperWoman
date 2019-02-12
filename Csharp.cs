using System; 
class MainClass {
public static void Main (string[] args) {
int Count, Counter;
Console.Write("To print the natural numbers upto the given number, enter a number:");
Count = int.Parse(Console.ReadLine());
Console.Write("The first " + Count + " natural numbers are");
for(Counter = 1; Counter <= Count; Counter++){
   Console.Write(" " + Counter);
    }
Console.Write(".\n");
  }
  }
