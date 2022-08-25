#include <stdio.h>
#include <math.h>
int area(int length);
int main(){
     int a ;
     scanf("%d",&a);
     int c=area(a);
     printf("the area is about  %d  meters square",c);
     return 0 ;
}
int area(int length){
    int ans=pow(length,2);
    if (length%5==0){
        ans+=1;
    }
    return ans;
}