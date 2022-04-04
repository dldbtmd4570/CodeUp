#include <stdio.h>
int main(void)
{
	int n;
	scanf("%d", &n);
	printf("%s", (n < 10 ?  "small":"big"));
	return 0;
}