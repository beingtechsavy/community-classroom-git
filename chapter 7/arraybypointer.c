#include <stdio.h>
int main(){
     int arr[3];
     int *ptr=&arr[0];
     for (int i = 0; i < 3; i++)
     {
        printf("enther the value for marks %d\n",i+1);
        scanf("%d",ptr);
        ptr++;
     }
     for (int i = 0; i < 3; i++)
     {
        printf("the value of ith element is %d\n",arr[i]);
     }
     
     
     return 0 ;
}