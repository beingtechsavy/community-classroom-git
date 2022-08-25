#include <stdio.h>
#include <string.h>

int main(){
     char ptr[]="Harry";
     char st2[45]="willy";
     strcat(st2,ptr);
     printf("%s",st2);
    
     return 0 ;
}