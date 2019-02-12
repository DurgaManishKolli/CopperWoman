#include <stdio.h>
int main(void) {
  int NumberOne, NumberTwo;
  printf("To add two numbers, enter the first number:");
  scanf("%d", &NumberOne);
  printf("Enter the second number:");
  scanf("%d", &NumberTwo);
  int Sum = NumberOne + NumberTwo;
  printf("The sum of %d and %d is %d. \n", NumberOne, NumberTwo, Sum);
  return 0;
}
