#include <stdio.h>

int main(){
    float celcius;
    printf("please enter the degree in celcius");
    scanf("%f",&celcius);
    float farenheit = (1.8*celcius)+32;
    printf("the temp in farenheit is about %f degrees",farenheit);
    return 0;
}