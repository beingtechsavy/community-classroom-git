#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(){
     int number,guess,nguesses=1;
     srand(time(0));
     number=rand()%100+1;
     printf("the number is in between %d  and %d\n",number-10,number+10);
    do{
        printf("enter a number between 1 to 100\n");
        scanf("%d",&guess);
        if (guess>number){
            printf("enter a lower number \n");
        }
        else if (guess<number)
        {
            printf("enter a higher number\n");
        }
        else if(guess==number)
        {
            printf("you guessed the answer right in %d attempts",nguesses);
        }
        nguesses++;
        

    }while (guess!=number);
    
    
     return 0 ;
}