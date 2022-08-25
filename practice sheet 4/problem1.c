#include <stdio.h>
int main(){
     printf("THIS IS A PROGRAM TO PRINT A TABLE \n");
     printf("ENTER THE NUMBER ");
     int number;
     scanf("%d",&number);
     for (int i = 1; i < 11; i++)
     {
        printf("%d multiplied by ",number);
        printf("%d",i);
        printf("    is %d\n", i*number);
     }
     
     return 0 ;
}