#include <stdio.h>
     
     
int main(){
     
    
     
     int year;
     printf("HELLO THIS IS A LEAP YEAR VERIFIER \n PLEASE ENTER THE YEAR\n");
     scanf("%d",&year);
     (year%4==0 && year%100!=0   )? printf("it is a leap year"):(year%400==0)?printf("it is a leap year"):printf("not a leap year");
     
     return 0;
     
}     