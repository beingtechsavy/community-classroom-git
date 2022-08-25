#include <stdio.h>
int main(){
     int income;
     printf("enter your income in rupees");
     scanf("%d",&income);
     int grade;
     if (income<250000)
     {
        grade=1;

     }
     else if (income<500000 && income >=250000)
     {
        grade=2;
     }
     else if (income>=500000 && income <1000000)
     {
        grade=3;
     }
     else if (income >=1000000)
     {
        grade=4;
     }
     switch (grade)
     {
        case 1:
            printf("you are not eligible for tax\n");
            break;
        case 2 :
            printf("you are  eligible for tax\n");
            printf("your tax slab is about 5 percent ");

            break;
        case 3 :
            printf("you are  eligible for tax\n");
            printf("your tax slab is about 10 percent ");
            
            break;
        case 4 :
            printf("you are  eligible for tax\n");
            printf("your tax slab is about 20 percent ");
            
            break;
        default:
            printf("hello");
            break;
     }
     
     
     
     return 0 ;
}