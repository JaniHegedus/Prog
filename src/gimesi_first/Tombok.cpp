#include <stdio.h>
#include <iostream>
#define MAX 5
#define M 80
using namespace std;

void tomb()
{
	int tomb[MAX];
	int i,j;
	for(i=0; i<MAX;i++)
	{
		printf("Kérem a %d. számot: ", i+1);scanf("%d", &tomb[i]);
	}
	int min, max;
	min = max= tomb[0];
	for(i=1;i<MAX;i++)
	{
		if(tomb[i]>max)max=tomb[i];
		if(tomb[i]<min)min=tomb[i];
	}
	printf("Minimum=%d\nMaximum=%d",min,max);
	int csere;
	for (j=0;j<MAX-1;j++)
	{
		if(tomb[i]>tomb[i+1])
		{
			csere=tomb[i];
			tomb[i]=tomb[i+1];
			tomb[i+1]=csere;
		}
	}
	for (i=0;i<MAX;i++) printf("%d\n",tomb[i]);
}
void tombi()
{
	int tomb[10];
	int db=0;
	printf("Kérek 1 számot: ");scanf("%d", &tomb[db]);
	while(tomb[db])
	{
		db++;
		printf("Kérek egy másik számot: ");scanf("+",tomb[db]);
	}
	for (char i=0;i<db;i++) printf("%d\n",
	tomb[i]);
}
void megegyezik()
{
	int tomb[MAX], temp, vege=MAX;int i,j;
	for (i=0;i<MAX;i++)
	{
	printf("Kerem a %d. szamot ", i+1); scanf("%d",&tomb[i]);
	} 
	int keres;
	printf("Kerem a torlendo szamot ");
	scanf("%d",&keres);
	for (i=0;i<MAX;i++) if(tomb[i]==keres) break;
	if(i==MAX) printf("\nNincs ilyen elem\n");
	else 
		{
		 for(;i<vege; i++)tomb[i]=tomb[i+1];
		 	vege--;
		}
	for(i=0; i<vege;i++) printf("%d\n",tomb[i]);
}
void valtozo()
{
int a,*b, c;
printf("Kerek egy szamot: "); scanf("%d",&a);
b=&a;c=*b;
printf("%d  %d  %d\n", a, *b, c);
}
void tombtoltes()
{
	int tomb[MAX];
	int i, *p=tomb;
	for(i=0; i<MAX; p++, i++)
	{
	printf("Kerem a %d. szamot ", i+1);scanf("%d", p);
	}
	for(i=0, p=tomb;i<MAX; p++, i++) printf("%d\n",*p);
}
void F1()
{
	int tomb[MAX];
	int a,i, *h=tomb;
	for(i=0; i<MAX; h++, i++)
	{
	printf("Kerem a %d. Hõmérsékletet ", i+1);scanf("%d", h);
	}
	for(i=0, h=tomb;i<MAX; h++, i++)
	{
		if(tomb[i]>=0&&tomb[i]<=100) a++;
	}
	printf("%ddb 0-100C fok közötti hõmérséklet van.",a);
}
void stringtomb()
{
	char szoveg[80],sz[80], i=0;
	printf("Kérek egy sor szöveget: ");
	while((szoveg[i]=getchar())!='\n') i++;
	szoveg[i++]='\n';
	szoveg[i]='\0';
	i=0;
	printf("Kérek egy másik szöveget: ");
	while((sz[i++]=getchar())!='\n');
	sz[i]='\0';
	printf("A beírt szövegek:\n %s %s",szoveg,sz);
}
void stringtombbe()
{
	char szoveg[80],sz[80], i=0;
	printf("Kérek egy sor szöveget: ");
	scanf("%s", szoveg);fflush(stdin);
	printf("Kérek egy másik szöveget: "); 
	scanf("%[^\n]", sz);
	printf("A beírt szövegek:\n %s   \n %s \n",  szoveg,sz);
}
void stringtombbe_mutato()
{
	char szoveg[M],*p=szoveg;
	printf("kerek egy sor szoveget: ");
	while((*p=getchar())!='\n')p++;
	*p=' \0';
	p=szoveg;
	while(*p)p++;
	printf("\n\"%s  \" szoveg hossza = %d\n",szoveg, p-szoveg);
}
void stringtombbe_mutato2()
{
	char szoveg[M], masolat[80], *p=szoveg, *m=masolat;
	printf("kerek egy sor szoveget: ");
	while((*p++=getchar())!='\n');
	*p=' \0';  
	p=szoveg;while(*m++=*p++);
	printf("\nEz a masolt szoveg: %s",masolat); 
}
void sorszoveg_be()
{
	char a, szoveg[3][M];
	for (char j=0;j<3;j++)
	{
	printf("kerem az %d. sor szöveget: ",j);
	fflush(stdin); scanf("%[^\n]",szoveg[j]);
	} 
	for (char j=0;j<3;j++) printf("\nEz a szoveg: %s\n",szoveg[j]);
}
void sorszoveg_be_getchar_putchar()
{
	char szoveg[3][M],i,j;for (j=0; j<3; j++)
	{
	printf("kerem az %d. sor szoveget: ",j+1);
	i = 0;    
	while((szoveg[j][i++]=getchar())!='\n');  
	szoveg[j][i] = '\0';  
	} 
	for (j=0; j<3; j++)
	{
	printf("A %d. sor szovege: ",j+1);
	i = 0;   
	while(szoveg[j][i]) putchar(szoveg[j][i++]);
	} 
}
void sorszoveg_be_getchar_putchar_mutato()
{
	char szoveg[3][M], *s;
	for (char j=0; j<3; j++)
	{
	printf("kerem az %d. sor szoveget: ",j+1);s = szoveg[j];while((*s++=getchar())!='\n');  *s = '\0';  
	} 
	for (char j=0; j<3; j++)
	{
	printf("A %d. sor szovege: ",j+1);
	s = szoveg[j];
	while(*s) putchar(*s++);
	} 
}
void ketdimenzios_tomb()
{
	char *honev[]={"","januar","februar","marcius","aprilis","majus","junius","julius","augusztus","szeptember","oktober","november","december"}; 
	int ho;
	printf("Kerem a honap szamat: "); scanf("%d",&ho);
	if(ho>=1 && ho<=12) 
		printf("%s\n",honev[ho]);
	else   
		printf("Hibas honapnev");
}
void Feladat_1()
{
	int lower=0, i=0;
	char a, szoveg[M];
	printf("kerem a sor szöveget: ");
	fflush(stdin); scanf("%[^\n]",szoveg);
	while(szoveg[i]!='\0')
	{
		if (szoveg[i] >= 'a' && szoveg[i] <= 'z')
            lower++;
        i++;  
	} 
	printf("\nEz a szoveg: %d darab kisbetût tartalmaz",lower);
	printf("\nEz a szoveg: %s\n",szoveg); //debug
}
void Feladat_2()
{
	int num=0,i;
	char a, szoveg[M];
	printf("kerem a sor szöveget: ");
	fflush(stdin); scanf("%[^\n]",szoveg);
	while(szoveg[i]!='\0')
	{
		if (szoveg[i] >= '0' && szoveg[i] <= '9')
            num++;
		i++;
	}
	printf("\nEz a szoveg: %d darab numerikus karaktert tartalmaz",num);
	printf("\nEz a szoveg: %s\n",szoveg);
}
void Feladat_3()
{
	char szoveg[2][M], *s,i=0,ig=0;
	for (char j=0; j<2; j++)
	{
	printf("kerem az %d. sor szoveget: ",j+1);s = szoveg[j];while((*s++=getchar())!='\n');  *s = '\0';  
	} 
	for (char j=0; j<2; j++)
	{
	printf("A %d. sor szovege: ",j+1);
	s = szoveg[j];
	while(*s) putchar(*s++);
	}
	while(szoveg[0][i]!='\0' && szoveg[1][i]!='\0')
	{
		if (szoveg[0][i]==szoveg[1][i]) 
		{
			ig++;
		}
		
		i++;
	}	
	if (i==ig) printf("A két szöveg megegyezik");
	else printf("A két szöveg eltérõ");
}
void Feladat_4()
{
	char szoveg[M];
	printf("kerek egy sor szoveget: ");
	//while((*p++=getchar())!='\n');
	
}
void Feladat_5_6()
{
	int i=0,m=80,g=0;
	char szoveg[m][M], *s;
	for (char j=0; j<m; j++)
	{
		g++;
		printf("kerem az %d. sor szoveget: ",j+1);s = szoveg[j];while((*s++=getchar())!='\n');  *s = '\0';
		if ((*s++=getchar())==EOF) 
		{
			m=g;
			break;
		}
	} 
	//printf("%d\n",m);
	for (char j=0; j<m; j++)
	{
		//printf("A %d. sor szovege: ",j+1);
		s = szoveg[j];
		while(*s) 
		{
			*s++;
			if (*s!='\n') i++;
		}
	} 
	printf("%d karakter van! \n", i);
	printf("6. feladat: %d sor van",g);
}
void Feladat_7()
{
	int tomb[10], i = 0, db = 0, paros = 0, paratlan = 0;
	printf("Adja meg a(z) %d. adatot: ", i + 1); scanf("%d", &tomb[db]);
	while(tomb[db])
	{
		i++;
		db++;
		printf("Adja meg a(z) %d. adatot: ", i + 1); scanf("%d", &tomb[db]);	
	}
	for(i = 0; i < db; i++)
	{
		if(tomb[i]%2 == 0)
		{
			paros ++;
		}
		else {
			paratlan ++;
		}
	}
	printf("Páros számok: %d db\tPáratlan számok: %d db", paros, paratlan);
}
void Feladat_8()
{
	int tomb[10], i = 0, db = 0, paros = 0, paratlan = 0;
	printf("Adja meg a(z) %d. adatot: ", i + 1); scanf("%d", &tomb[db]);
	while(tomb[db])
	{
		i++;
		db++;
		printf("Adja meg a(z) %d. adatot: ", i + 1); scanf("%d", &tomb[db]);	
	}
	for(i = 0; i < db; i++)
	{
		switch(tomb[i])
		{
		case 10: case 20: case 30: case 40: case 50: case 60: case 70: case 80: case 90: case 100: printf("Gratulálunk\n"); break;
		default: if(tomb[i] > 0 && tomb[i] < 30)
					{
		            	printf("Fiatal\n");
	                 }
	             else if(tomb[i] < 60)
				 {
		             printf("Középkorú\n");
	                 }
	             else if(tomb[i] <= 100)
				 {
	              	printf("Idõs\n");
	            	}
	             else
				 {
		             printf("Hibás adat\n");
                }
                 	break;
		}
	}
}
void Feladat_9()
{
	int tomb[MAX], i, also, felso;
	for(i = 0; i < MAX; i++){
		printf("Adja meg a(z) %d. számot: ", i + 1); scanf("%d", &tomb[i]);
	}
	printf("Kérem a zárt intervallum alsó határát: "); scanf("%d", &also);
	printf("Kérem a zárt intervallum felsõ határát: "); scanf("%d", &felso);
	if (felso <= also){
		printf("A felsõ határ nem lehet kisebb vagy egyenlõ az alsó határral, adja meg újra a számot: "); scanf("%d", &felso);
	}
	
	for(i = 0; i < MAX; i++){
		if(tomb[i] < also) {
			printf("A(z) %d. elem az intervallum alatt helyezkedik el.\n", i + 1);
		}
		else if (tomb[i] > felso){
			printf("A(z) %d. elem az intervallum felett helyezkedik el.\n", i + 1);
		}
		else {
			printf("A(z) %d. elem az intervallumban helyezkedik el.\n", i + 1);
		}
	}
}
void Feladat_10()
{
	float tomb[MAX];
	int i;
	for(i = 0; i < MAX; i++){
		printf("Kérem a(z) %d. hõmérsékletet: ", i + 1); scanf("%f", &tomb[i]);
	}
	for(i = 0; i < MAX; i++){
		if(tomb[i] <= 0){
			printf("%f celsius fokon jég.\n", tomb[i]);
		}
		else if(tomb[i] >= 100) {
			printf("%f celsius fokon gõz.\n", tomb[i]);
		}
		else {
			printf("%f celsius fokon víz.\n", tomb[i]);
		}
	}
}
void Feladat_11()
{
	int tomb[MAX], ev, eletkor, n = 0, i;
	for(i = 0; i < MAX; i++
	){
		printf("Kérem a(z) %d. születési évet: ", i + 1); scanf("%d", &tomb[i]);
	}
	printf("Adja meg az idei évet: "); scanf("%d", &ev);
	
	for(i = 0; i < MAX; i++)
	{
		eletkor = ev - tomb[i];
		printf("A(z) %d. ember %d éves.\n", i + 1, eletkor);
		if(eletkor > 45){
			n++;
		}
	}
	printf("Összesen %d 45 év feletti van.", n);
}
void Feladat_12()
{
	float tomb[MAX], ker, ter;
	int i;
	for(i = 0; i < MAX; i++)
	{
		printf("Kérem a(z) %d. kör sugarát: ", i + 1); scanf("%f", &tomb[i]);
	}
	for(i = 0; i < MAX; i++)
	{
		ker = 2 * tomb[i] * PI;
		ter = tomb[i] * tomb[i] * PI;
		printf("A(z) %d. kör kerülete: %f\tterülete: %f\n", i + 1, ker, ter);
	}
}
void Feladat_13()
{
	int tomb[10], ev, osszeg = 0, atlag, db = 0, i = 0;
	printf("Kérem a(z) %d. elemet: ", i + 1); scanf("%d", &tomb[db]);
	while(tomb[db])
	{
		db++;
		i++;
		printf("Kérem a(z) %d. elemet: ", i + 1); scanf("%d", &tomb[db]);
	}
	printf("Adja meg az idei évet: "); scanf("%d", &ev);
	
	for(i = 0; i < db; i++)
	{
		osszeg += (ev - tomb[i]);
	}
	atlag = osszeg / db;
	printf("Az átlag életkor %d", atlag);
}
void Feladat_14()
{
	char tomb[20];
	int i = 0, n = 0;
	printf("Adjon meg karaktersorozatot ENTER-ig (három elemet kötelezõ): ");
	tomb[i] = getchar();
	while(tomb[i] != '\n')
	{
		i++;
		n++;
		tomb[i] = getchar();
	}
	if(n < 3)
	{
		printf("Nem adott meg három karaktert.");
	}
	else
	{
		for(i = 0; i < n; i++)
		{
			if (i == 0)
			{
				printf("Az elsõ karakter: %c\n", tomb[i]);
			}
			else if (i == n - 1)
			{
				printf("Az utolsó karakter: %c\n", tomb[i]);
			}
			else if (n % 2 == 1 && i == n / 2) 
			{
				printf("A középsõ karakter: %c\n", tomb[i]);
			}
			else if (n % 2 == 0 && (i == n / 2 || i == n / 2 - 1))
			{
				printf("A középsõ karakter(ek): %c\n", tomb[i]);
			}
		}
	}
}
void Feladat_15()
{
	int tomb[MAX], keres, i;
	for(i = 0; i < MAX; i++)
	{
		printf("Adja meg a(z) %d. számot: ", i + 1); scanf("%d", &tomb[i]);
	}
	printf("Adja meg a keresett értéket: "); scanf("%d", &keres);
	for(i = 0; i < MAX; i++)
	{
		if(tomb[i] == keres)
		{
			printf("A keresett elem a(z) %d indexen található.", i); break;
		} 
	}
	if(i==MAX){
		printf("Nincs ilyen elem");
	}
}
void Feladat_16()
{
	int tomb[MAX], i, max, min;
	for (i = 0; i < MAX; i++)
	{
		printf("Kérem a(z) %d. elemet: ", i + 1); scanf("%d", &tomb[i]);
	}
	max = tomb[0];
	for (i = 0; i < MAX; i++)
	{
		if(tomb[i] > max)
		{
			max = tomb[i];
		}
	}
	printf("A legnagyobb elem: %d\n", max);
	
	min = tomb[0];
	for (i = 0; i < MAX; i++)
	{
		if(tomb[i] < min)
		{
			min = tomb[i];
		}
	}
	printf("A legkisebb elem: %d", min);
}
int main()
{
	setlocale(LC_ALL, "HUN");
	
	karakter()
	karaktersorozat();
	vltozo();
	egeszkarakter();
	tomb();
	tombi();
	tombtoltes();
	megegyezik();
	
	F1();
	
	stringtomb();
	stringtombbe();
	stringtombbe_mutato();
	stringtombbe_mutato2();
	sorszoveg_be();
	sorszoveg_be_getchar_putchar();
	sorszoveg_be_getchar_putchar_mutato();
	ketdimenzios_tomb();
	
	
	Feladat_1();
	Feladat_2();
	Feladat_3();
	Feladat_4();
	Feladat_5_6();
	Feladat_7();
	Feladat_8();
	Feladat_9();
	Feladat_10();
	Feladat_11();
	Feladat_12();
	Feladat_13();
	Feladat_14();
	Feladat_15();
	Feladat_16();
	
}
