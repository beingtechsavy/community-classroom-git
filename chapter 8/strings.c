#include <stdio.h>
int main(){
     char c[]={'h','i','\0'};
     char sub[]="subscribe";
     // printf(c);
     // printf("\n");
     // printf(sub);
     char  *ptr=sub;
     while (*ptr!='\0')
     {
          printf("%c",*ptr);
          ptr++;
     }
     
     return 0 ;
}