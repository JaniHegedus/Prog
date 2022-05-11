#include <stdio.h>
int main(int db, char *szoveg[])
{
	int a, b;
	szoveg++;
	sscanf(*szoveg++, "%d", &a);
	sscanf(*szoveg++, "%d", &b);
	return a*b;
} 
