#include <stdio.h>
#include <math.h>
int main(){
     int a ;
     int count=0;
     scanf("%d",&a);
     for (int i=2;i<pow(a,0.5);i++){
        if (a%i==0){
            count+=1;
            
        }
     }
     if(count==0){
        printf("This is a prime number");
     }
     else{
        printf("this is not a prime number");
     }
     return 0 ;
}