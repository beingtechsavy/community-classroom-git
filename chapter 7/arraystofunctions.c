#include <stdio.h>
void printarray(int *ptr,int n){
    for (int i = 0; i < n; i++)
    {
        printf("the value of %d th element is %d \n",i+1,*(ptr+i));
    }
    
}
int main(){
     int arr[4]={1,2,3,4};
     int *ptr=arr;
     printarray(ptr,4);
     return 0 ;
}