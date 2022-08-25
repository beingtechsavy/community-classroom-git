#include <stdio.h>
int main(){
     int a =65;
     int ab=56;
     int *ptr1=&ab;
     int *ptr=&a;
     printf("the difference in memory is  %d\n",ptr-ptr1);
     printf("%u\n  %u",ptr,ptr1);
     return 0 ;
}