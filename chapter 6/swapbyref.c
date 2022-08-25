#include <stdio.h>
int swap(int *a,int *b);
int main(){
     printf("this is a program to swap the values of 2 number using swap\n");
     int a=56 ,b=55;
    //  scanf("%d\n",&a);
    //  scanf("%d\n",&b);
     printf("the value of a and b before swap is %d and %d\n",a,b);
     swap(&a,&b);
     printf("the value of a and b after swap is %d and %d\n",a,b);
    return 0 ;
    
}
int swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}