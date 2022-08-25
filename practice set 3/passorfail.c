#include <stdio.h>
int main(){
    int physics,chemistry,maths;
    printf("enter your marks in physics out of 100 \n");
    scanf("%d",&physics);
    printf("enter your marks in chemistry out of 100 \n");
    scanf("%d",&chemistry);
    printf("enter your marks in maths out of 100 \n");
    scanf("%d",&maths);
    int percentage;
    percentage=((physics+maths+chemistry)/3);
    if(percentage>44 && physics>33 && maths>33 && chemistry>33){
        printf("YOU HAVE PASSED\n");
    }
    else{
        printf("YOU HAVE FAILED");
    }
    
    
    return 0 ;
}