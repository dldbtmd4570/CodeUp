#include <stdio.h>
int main(void)
{
	int a, b;
	scanf("C%dH%d", &a, &b);
	printf("%d", a * 12 + b);
	return 0;
}