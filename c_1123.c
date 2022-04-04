#include <stdio.h>
int main(void)
{
	int celsius;
	scanf("%d", &celsius);
	printf("%.3f", (float)(1.8*celsius+32));
	return 0;
}