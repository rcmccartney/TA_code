#include <stdio.h>

int main() {

	double c[100];
	c[0] = 909.4;

	printf("Size of each element is %lu\n", sizeof(c[0]));
	printf("Size of c is %lu\n", sizeof(c));
	printf("Length of array is %lu\n", sizeof(c)/sizeof(c[0]));
}
