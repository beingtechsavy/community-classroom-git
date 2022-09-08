#include <stdio.h>
int main(){
     int a=10;
     int i=0;
     int sum=0;
     while(i<a){
        sum+=i;
        i++;
     }
     printf("%d",sum);
     return 0 ;
}