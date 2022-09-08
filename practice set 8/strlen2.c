#include <stdio.h>
void stheight(char ch[]){
    int count=0;
  while (ch[count]!='\0')
  {
    count++;
    
  }
  printf("%d",count);
  
    
}
int main(){
    printf("enter the charachter you want to know the length of ");
    char *ch;
    scanf("%s",ch);
    stheight(ch);
    return 0 ;
}