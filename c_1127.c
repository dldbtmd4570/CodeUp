#include <stdio.h>
int main(void)
{
	float a, b, c;
	int a_a, b_b, c_c;
	scanf("%f %d", &a, &a_a);
	scanf("%f %d", &b, &b_b);
	scanf("%f %d", &c, &c_c);
	printf("%.1f", a * a_a + b * b_b + c * c_c);
	return 0;
}