#include <stdio.h>
#include <stdlib.h>
#include <iostream>
void kiir(FILE*, int, char[]);

//Készítsen programot, amely a main segítségével sorokat olvas be a billentyuzetrol, 
//majd egy függvény segítségével kiírja azokat a sorszámokkal együtt egy szöveges állományba 
//(a függvény paraméterei: fájlmutató, sorszám és a sort tartalmazó tömb). Az adatmegadás végét szabadon 
//választhatja meg.
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

