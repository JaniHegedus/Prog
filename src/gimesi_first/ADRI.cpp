#include <stdio.h>
#include <stdlib.h>
#include <iostream>
void kiir(FILE*, int, char[]);

//K�sz�tsen programot, amely a main seg�ts�g�vel sorokat olvas be a billentyuzetrol, 
//majd egy f�ggv�ny seg�ts�g�vel ki�rja azokat a sorsz�mokkal egy�tt egy sz�veges �llom�nyba 
//(a f�ggv�ny param�terei: f�jlmutat�, sorsz�m �s a sort tartalmaz� t�mb). Az adatmegad�s v�g�t szabadon 
//v�laszthatja meg.
int main(){
	FILE *fp;
	fp = fopen("ADRI.txt", "w");
	char tomb[80];
	int i = 0, sorIndex;
	while((tomb[i] = getchar()) != '\n'){
		i++;
	}
	printf("A sor: %s", tomb);
}

void kiir(FILE *f, int sorIndex, char tomb[]){
	
}

