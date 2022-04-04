#include <stdio.h>
int main(void)
{
	char n[30];
	fgets(n, 30, stdin);
	printf("%s", n);
	return 0;
}