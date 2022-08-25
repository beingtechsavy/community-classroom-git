#include <stdio.h>

int avg(int a ,int b,int c);
int main(){
    int a,b,c;
    printf(" enter the 3 numbers ");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    int ans=avg(a,b,c);
    printf("the answer is %d",ans); 
    return 0 ;
}
int avg(int a ,int b,int c){
    int answer=(a+b+c)*0.5;
    return answer;
}