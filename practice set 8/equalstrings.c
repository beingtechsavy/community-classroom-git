#include <stdio.h>
int main(){
     char st1[34];
     char st2[34];
    //  char c=scanf("%c\n",&c);
     printf("enter the value of first string\n");
     gets(st1);
     int i=0;
     char c;
     
     while (c!='\n')
     {  scanf("%c",&c);
        st2[i]=c;
        i++;
     }
     st2[i]='\0';
     printf("the value of st1  is %s\n",st1);
     printf("the value of str2 is %s\n",st2);

     
     return 0 ;
}