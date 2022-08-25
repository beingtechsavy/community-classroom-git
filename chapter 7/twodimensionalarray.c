#include <stdio.h>
int main(){
     int student=1;
     int subject=5;
     int marks[student][subject];
     for (int i = 0; i <student; i++)
     {
        for (int j = 0; j <subject; j++)
        {
            printf("enter the marks of %d student in subject %d \n",i+1,j+1);
            scanf("%d",&marks[i][j]);
        }
        
     }
     printf("the value of 5th element is %d",marks[0][4]);
     
     return 0 ;
}