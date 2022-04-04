#include <stdio.h>
int main()
{
    float a;
    scanf("%f",&a);
    printf("%s",a>=50?(a<=60?"win":"lose"):"lose");
    return 0;
}