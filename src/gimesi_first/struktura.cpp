#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#define MAX 5
#define M 80
using namespace std;
struct date
{
int day;
char month[10];
int year;
}; 

void feltolt(struct date*);
void feltolt(struct date *f)
{
printf("�v:\t");scanf("%d",&f->year);
printf("h�nap:\t");scanf("%s",f->month);
printf("nap:\t");scanf("%d",&f->day);
}
void feltolto0()
{
	date d;
	printf("�v:\t");scanf("%d",&d.year);
	printf("h�nap:\t");scanf("%s",d.month);
	printf("nap:\t");scanf("%d",&d.day);
	printf("\n%d    - %s   - %d\n", d.year, d.month, d.day);
}
void feltolto1()
{
	date d;
	feltolt(&d);
	printf("\n%d    - %s   - %d\n", d.year, d.month, d.day);
}
int feltolto3(struct date*);
void for_feltolto()
{
	struct date tomb[10];
	int n,i;
	n=feltolto3(tomb);
	for(i=0;i<n;i++)printf("\n%d - %s   - %d\n", tomb[i].year, tomb[i].month, tomb[i].day);
} 
int feltolto3(struct date *f)
{
	int db=0;printf("k�rem az �vet: ");scanf("%d",&f->year);
	while (f->year)
	{
		printf("k�rem a h�napot: ");scanf("%s",f->month);
		printf("k�rem a napot: ");scanf("%d",&f->day);
		db++;
		f++;
		printf("k�rem az �vet: ");scanf("%d",&f->year);
	}
	return db;
}
struct rec
{
	int szam;
	rec *kovetkezo;
};
/*void helyfoglalasos()
 {
 int adat;rec *uj, *elso=NULL, *aktualis;
 printf("Kerek egy sz�mot: "); scanf("%d",&adat);
 while(adat)
 {
	uj=(rec*)malloc(sizeof(rec)); //T�pusk�nyszer�t�s, helyfoglal�s
	if(!uj)
	{
		// Ha nincs c�m (NULL), akkor nem siker�lt a helyfoglal�s
		printf("Nincs el�g mem�ria \n");
		system("pause");
		return -1;
		}
	uj->szam=adat;
	uj->kovetkezo=NULL;
	if(!elso) elso=uj;//Ha legelso elem
	else aktualis->kovetkezo=uj;
	aktualis=uj;
	printf("Kerek egy sz�mot: "); scanf("%d",&adat);
} //Adatki�r�s
	aktualis=elso;//Ez elso elem c�me
	while(aktualis)
	{
		//A lista v�g�n NULL
		printf("%d\n",aktualis->szam);
		aktualis=aktualis->kovetkezo;
	}
} 
void helykereses()
{
	int adat;
	rec *uj, *elso=NULL, *elozo, *aktualis;
	printf("Kerek egy sz�mot: "); scanf("%d",&adat);
	while(adat)
	{
		uj=(rec*)malloc(sizeof(rec));
		if(!uj)
		{
			printf("Nincs el�g   mem�ria\n");   system("pause");
			return -1;  
		} 
		uj->szam=adat;
		elozo=NULL;
		aktualis=elso;
		while(aktualis && adat>aktualis->szam)
		{
			 //Az �j �rt�k hely�nek megkeres�se
			 elozo=aktualis;
			 aktualis=aktualis->kovetkezo;
		}
		if(!elozo) elso=uj;//Ha a lista elso eleme
		else elozo->kovetkezo=uj;
		uj->kovetkezo=aktualis;
		printf("Kerek egy sz�mot: "); scanf("%d",&adat);
	} //Adatki�r�s
	aktualis=elso;
	while(aktualis)
	{
		printf("%d\n",aktualis->szam);
		aktualis=aktualis->kovetkezo;
	} 
} 
}
void rendezett_feltoltes()
{
	int adat;
	rec *uj, *elso=NULL, *elozo, *aktualis;//Rendezett felt�lt�s
	printf("Kerek egy sz�mot: "); scanf("%d",&adat);
	while(adat)
	{
		uj=(rec*)malloc(sizeof(rec));
		if(!uj)
		{	//Ellenorz�s
			printf("Nincs el�g   mem�ria\n");
			system("pause");
			return -1;
		}
		uj->szam=adat;
		elozo=NULL;
		aktualis=elso;
		while(aktualis && adat>aktualis->szam)
		{
			elozo=aktualis;
			aktualis=aktualis->kovetkezo;
		} 
		if(!elozo) elso=uj;
		else elozo->kovetkezo=uj; 
		uj->kovetkezo=aktualis;
		printf("Kerek egy szamot: "); scanf("%d",&adat);
	} // Lista ki�r�s
	aktualis=elso;
	while(aktualis)
	{
		printf("%d\n",aktualis->szam);
		aktualis=aktualis->kovetkezo;
	} 
	// Egy elem t�rl�se
	printf("K�rem a t�rlendo azonos�t�t: "); scanf("%d",&adat);
	aktualis=elso;
	elozo=NULL;
	while(aktualis)
	{//Keres�s a list�ban
		if(adat==aktualis->szam)break;
		elozo=aktualis;
		aktualis=aktualis->kovetkezo;
	}
	if(!aktualis) printf("A keresett elem nem tal�lhat  �\n");   
	else
	{//Megvan a keresett elem
		if(!elozo) elso=aktualis->kovetkezo; //Ha az elso elemet t�r�lt�k
		else elozo->kovetkezo=aktualis->kovetkezo;
		free(aktualis);//A    t�r  �lt elem hely�nek felszabad�t�sa
	} //  Az �j lista ki�r�s
	aktualis=elso;
	while(aktualis)
	{
		printf("%d\n",aktualis->szam);
		aktualis=aktualis->kovetkezo;
	} 
}
*/
struct ember
{
char* nev;
int eletkor;
float testmagassag;
}; 

void feltoltt(struct ember*);

int main()
{
	setlocale(LC_ALL, "HUN");
	/*
	feltolto0();
	feltolto1();
	for_feltolto();
	helyfoglalasos();
	helykereses();
	rendezett_feltoltes();
	*/
}
void feltoltt(struct ember *f)
{
printf("�v:\t");scanf("%d",&f->nev);
printf("h�nap:\t");scanf("%s",f->eletkor);
printf("nap:\t");scanf("%d",&f->testmagassag);
}
