#include <stdio.h>

int main(){
    printf("WELCOME,\nTHIS IS A PROGRAM TO CALCULATE IF A NUMBER IS DIVISIBLE BY 97\n");
    int a;
    printf("enter the number to be calculated about");
    scanf("%d",&a);
    if (a%97==0)
    {
        printf("yes the no is divisible by 97");
    }
    else{
        printf("no the no is not divisible");
    }
    
    return 0;
}