#include <stdio.h>
int main(){
    int marks;
    printf("enter your marks");
    scanf("%d",&marks);
    int grade;
    if (marks<60){
        grade=5;
    }
    else if (marks<=70 && marks>=60)
    {
        grade=4;
    }
    else if (marks<=80 && marks>70)
    {
        grade=3;
    }
    else if (marks<=90 && marks>80)
    {
        grade=2;
        
    }
    else if (marks<=100 && marks>90)
    {
        grade=1;
    }
    switch (grade)
    {
    case 1:
        /* code */
        printf("you have secured A grade\n");
        break;
    case 2:
        /* code */
        printf("you have secured B grade\n");
        break;
    case 3:
        /* code */
        printf("you have secured c grade\n");
        break;
    case 4:
        /* code */
        printf("you have secured D grade\n");
        break;
    case 5:
        /* code */
        printf("you could probably suicide, so we will not tell you.\n");
        break;
    case 0 :
        printf("hello");
        break;

    default:
        printf("invalid operation\n");
        break;
    }
    
    return 0;
}