#include <stdio.h>
int main(){
     int a=34;
     int *j=&a;
     printf("%d\n",*j);
     printf("%d\n",a);
     printf("%d",j);
     printf("%d\n",*(&j));
    //  pointer to pointer 
    int **k=&j;
    printf("%d\n",k);
    printf("%d\n",**k);
     return 0 ;
}