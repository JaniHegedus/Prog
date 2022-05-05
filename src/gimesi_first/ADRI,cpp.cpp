#include <stdio.h>
#include <stdlib.h>
#include <iostream>
int karakterSoronkent(char[]);


int main(){
	setlocale(LC_ALL, "hun");
	FILE *in;
	in = fopen("ADRI,cpp.cpp", "r");
	
	char tomb[80];
	int i = 0, sorIndex = 1, j = 0;
	while(tomb[i] != EOF){
		while((tomb[i] = fgetc(in)) != '\n'){
			i++;
			//printf("A szöveg: %s, i: %d\n", tomb, i);
		}
		//printf("A karakterek száma a %d. sorban: %d\n", sorIndex, karakterSoronkent(tomb));
		printf("A %d. beolvasott sor: %s\n", sorIndex, tomb);
		int db = karakterSoronkent(tomb);
		printf("A %d. sorban %d karakter van\n", sorIndex, db);
		i = 0;
		sorIndex++;
		for(; j < 80; j++){
			tomb[j] = {0};
		}
		j = 0;
	}
	
	
	fclose(in);
}

int karakterSoronkent(char tomb[]){
	int i = 0;
	while(tomb[i]){
		i++;
	}
	return i;
}

