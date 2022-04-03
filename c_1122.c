#include <stdio.h>
int main(void)
{
	int second;
	scanf("%d", &second);
	printf("%d %d", second / 60, second % 60);
	return 0;
}