#include <stdio.h>

int main(){
    float principal,rate,time;
    printf("enter the principal amount in rs. ");
    scanf("%f",&principal);
    printf("enter the interest rate in percentages ");
    scanf("%f",&rate);
    printf("enter the time in rs.");
    scanf("%f",&time);
    float simpint=principal*rate*time;
    printf("your simple intrest is about %f years ",simpint);
    return 0;
}