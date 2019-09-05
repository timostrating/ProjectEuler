#include <stdio.h>



int main () {
  long value = 600851475143;
  long i = 2;

  while(value != 1) {
    if(value % i == 0) {
      value = value / i;
      printf("%lu \n", i);
    }

    i++;
  }

  return 0;
}
