#include <stdio.h>

int main(void) {
  unsigned int a = 0;
  unsigned int b = 1;

  unsigned int tmp = 0;
  unsigned int sum = 0;

  while(b < 4000000) {
    tmp = b;
    b = a + b;
    a = tmp;

    if(b % 2 == 0) {
      sum += b;
    }
  }

  printf("%lu \n", sum);
  return 0;
}
