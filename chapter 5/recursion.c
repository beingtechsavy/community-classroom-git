#include <stdio.h>
// finding factorial of a function
int factorial(int n);
int main(){
    int number;
    printf("enter the number you want to take a factorial of \n");
    scanf("%d",&number);
    int c=factorial(number);
    printf("%d",c);
    return 0 ;
}
int factorial(int n){
    int ans=1;
    if (n==1){
        return 1;
    }
    ans*= n* factorial(n-1);
    return ans;
}