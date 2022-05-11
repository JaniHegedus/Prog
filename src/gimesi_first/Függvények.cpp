#include <stdio.h>
#include <iostream>
#define MAX 5
#define M 80
using namespace std;

void tegla(int x,int y,int *k,int *t)
{
	*k=2*(x+y);
	*t=x*y;
}
int kerulet(int x, int y)
	{
		int z;
		z=2*(x+y);
		return z;
	}
int terulet(int x, int y)
	{
		return x*y;
	}
int fakt(int n)
{
	if(n<=1) return 1;
	else return n*fakt(n-1);
}
int fibonacci(int n)
{
	if((0==n)||(1==n))
		return n;
	else
		return fibonacci(n-1)+fibonacci(n-2);
}
/*int strlen(char *s)
{
	char *p=s;
	while(*s) s++;
	return s-p;
}*/
int strlen(char* s)
{
	int i=0;
	while(s[i])i++;
	return i;
}
void strcpy(char *s, char *t)
{
	while(*s++=*t++);
}
char *honev(int ho)
{
	static char *nev[]={"hibas honap","januar","februar","marcius","aprilis","majus","junius","julius","augusztus","szeptember","oktober","november","december"};
	return (ho<1 || ho>12)? nev[0]:nev[ho];
}
int strin(char *s)
{
	int db=0;
	while(*s++)
	{
		if(*s>='a'&& *s<='z') db++;
	}
	return db;
}
int strinn(char *s)
{
	int db=0;
	while(*s++)
	{
		if(*s>='0'&& *s<='9') db++;
	}
	return db;
}
int strinsz(char *s)
{
	int db=1;
	while(*s++)
	{
		if(*s==' ' && *(s-1)!=' ') db++;
	}
	return db;
}
float terfogat(float x, float y, float z)
{
		return x*y*z;
	}
float felszin(float x, float y, float z)
{
	return 2*(x*y+x*z+y*z);
}
void haromszogg(int x, int y, int z)
{
	if(x+y>z&&x+z>y&&y+z>x)
	{
		printf("Szerkesztheto");
	}
	else
	{
		printf("Nem szerkesztheto");
	}
	return 0;	
}
char* haromszoggg(int x, int y, int z)
{
	
	char* answer;
	if(x+y>z&&x+z>y&&y+z>x)
	{
		answer= "Szerkesztheto 3szog";
		//printf("Szerkesztheto 3szog");
	}
	else
	{
		answer = "Nem szerkesztheto 3szog";
		//printf("Nem szerkesztheto 3szog");
	}
	
	return answer;	
}
int legkissebb(int x,int y,int z)
{
	if (x<y && x<z) return x;
	else if(y<x && y<z) return y;
	else return z;
}
void halmazallapot(int x)
{
	if(x<=0)
	{
		printf("Jég ");
	}
	else if(x>0&&x<100)
	{
		printf("Folyékony ");
	}
		
	else
	{
		printf("Gõz ");
	}
}
char* halmazallapott(int x)
{
	char* answer;
	if(x<=0)
	{
		answer= "Jég";
	}
	else if(x>0&&x<100)
	{
		answer= "Folyékony";
	}
		
	else
	{
		answer= "Gõz";
	}
	return answer;
}	
int atlag(int x, int y, int z)
{
	return (x+y+z)/3;
}
void rendezes(int* arr)
{	
	int i, length, temp = 0 ;
	length=MAX;
	for (int i = 0; i < length; i++)
	{     
        for (int j = i+1; j < length; j++)
		{     
           if(arr[i] > arr[j])
		   {    
               temp = arr[i];    
               arr[i] = arr[j];    
               arr[j] = temp;    
           }     
        }     
    }    
	i=0;    
    while (arr[i++])
	{
		printf("%d ", arr[i-1]);
	}
}
int hanyadik(char* string, char character)
{
	int i=0;
	while (string[i])
	{
		//printf("%c",string[i-1]);
		if (string[i]==character)
		{
			return i+1;
		}
		else
		{
			i++;
		}
	}
}
int hossz(char* string)
{
	int i=0;
	while(string[i++]);
	return i+1;
}
void nagysagrend(int x, int y, int z)
{
	if (x>=y && y>=z)      printf("%d %d %d", z, y, x);
	else if (x>=y && z>=y) printf("%d %d %d", y, z, x);
	else if (y>=x && x>=z) printf("%d %d %d", z, x, y);
	else if (y>=z && z>=x) printf("%d %d %d", x, z, y);
	else if (z>=x && x>=y) printf("%d %d %d", y, x, z);
	else printf("%d %d %d", x, y, z);
}
char* evszak(int x)
{
	char* answer;
	if(x>=3 && x<=5)
	{
		answer= "Tavasz";
	}
	else if(x>=9 && x<=11)
	{
		answer= "Õsz";
	}
	else if(x>=6 && x<=8)
	{
		answer= "Nyár";
	}	
	else if(x==12 || x==1 || x==2)
	{
		answer= "Tél";
	}
	else 
		answer = "Hibás hónap";
	return answer;
}

void fuggvenyek()
{
	int kerulet(int, int);
	int terulet(int, int);
	int ker,ter,a,b,n;
	printf("Kérem a téglalap egyik oldalának hosszát: "); scanf("%d",&a);
	printf("Kérem a téglalap másik oldalának hosszát: "); scanf("%d",&b);
	tegla(a,b, &ker,&ter);
	ker = kerulet(a,b);
	ter= terulet(a,b);
	printf("A téglalap kerülete=%d, a területe=%d\n",ker, ter);
	
	printf("Kérek egy számot: "); scanf("%d",&n);
	printf("%d!=%d\n",n,fakt(n));
	
	printf("Kérek egy számot: "); scanf("%d",&n);
	printf("A %d. fibonacci szám =%d\n",n,fibonacci(n));
	
	char in[80], out[80], i=0;
	printf("Kerem a szoveget: "); scanf("%[^\n]", in);
	printf("A szoveg hossza = %d\n", strlen(in));
	
	printf("Kerem a szoveget: ");
	scanf("%[^\n]", in);
	strcpy(out, in);
	printf("\n%s  \n",out);  
	
	int ho;
	printf("Kerem a honap szamat: "); scanf("%d",&ho);
	printf("\n%s  \n",honev(ho));
}

void Fel_1()
{
	char ins[80], i=0;
	printf("Kerem a szoveget: ");
	scanf("%[^\n]", ins);
	printf("\n%ddb kisbetû van a karakterek között!  \n",strin(ins));  
}
void Fel_2()
{
	char ins[80], i=0;
	printf("Kerem a szoveget: ");
	scanf("%[^\n]", ins);
	printf("\n%ddb szám van a karakterek között!  \n",strinn(ins));  
}
void Fel_3()
{
	char ins[80], i=0;
	printf("Kerem a szoveget: ");
	scanf("%[^\n]", ins);
	printf("\n%ddb szó van!  \n",strinsz(ins));  
}
void Fel_4()
{
	float a,b,c;
	printf("Kérem a hasáb elsõ oldalának hosszát: "); scanf("%f",&a);
	printf("Kérem a hasáb második oldalának hosszát: "); scanf("%f",&b);
	printf("Kérem a hasáb harmadik oldalának hosszát: "); scanf("%f",&c);
	printf("A hasáb térfogata=%f\n", terfogat(a,b,c));
		
}
void Fel_5()
{
	int a,b,c;
	printf("Kérem a haromszog elso oldalat: ");scanf("%d",&a);
	printf("Kérem a haromszog második oldalat: ");scanf("%d",&b);
	printf("Kérem a haromszog harmadik oldalat: ");scanf("%d",&c);
	printf("%s\n", haromszoggg(a,b,c));
	
}
void Fel_6()
{
	int a,b,c;
	printf("Kérem a elsõ számot: ");scanf("%d",&a);
	printf("Kérem a második számot: : ");scanf("%d",&b);
	printf("Kérem a harmadik számot: : ");scanf("%d",&c);
	printf("A legkissebb szám=%d\n", legkissebb(a,b,c));
	
}
void Fel_7()
{
	int a;
	printf("Kérem a hõmérsékletet! ");scanf("%d",&a);
	printf("a víz halmazállapota %d fokon \n",a, halmazallapot(a));
	
}
void Fel_8()
{
	int a,b,c;
	printf("Kérem a elsõ számot: ");scanf("%d",&a);
	printf("Kérem a második számot: : ");scanf("%d",&b);
	printf("Kérem a harmadik számot: : ");scanf("%d",&c);
	printf("Az átlag=%d\n", atlag(a,b,c));
	
}
void Fel_9()
{
	int tomb[MAX];
	int i,j;
	for(i=0; i<MAX;i++)
	{
		printf("Kérem a %d. számot: ", i+1);scanf("%d", &tomb[i]);
	}
  	printf("%s ", rendezes(tomb));
  	/*
	printf("\n");
  	int length, temp = 0 ;
	length=sizeof(tomb)/sizeof(tomb[0]);
	for (i=0; i < length; i++)
	{     
        for (int j = i+1; j < length; j++)
		{     
           if(tomb[i] > tomb[j])
		   {    
               temp = tomb[i];    
               tomb[i] = tomb[j];    
               tomb[j] = temp;    
           }     
        }     
    }
	i=0;    
    while (tomb[i++])
	{
		printf("%d ", tomb[i-1]);
	}
	*/
}
void Fel_10()
{
	char szoveg[M], *p=szoveg, karakter;
	printf("kerek egy sor szoveget: ");
	while((*p++=getchar())!='\n') *p=' \0'; 
	printf("kerek egy karaktert: ");scanf("%c", &karakter);
	printf("A karakter elsõ elõfordulása: %d\n", hanyadik(szoveg, karakter));
}
void Fel_11()
{
	char szoveg[M], *p=szoveg;
	printf("kerek egy sor szoveget: ");
	while((*p++=getchar())!='\n') *p=' \0'; 
	printf("A karakter szöveg hossza: %d\n", hossz(szoveg));
}
void Fel_12()
{
	float a,b,c;
	printf("Kérem a téglatest elsõ oldalának hosszát: "); scanf("%f",&a);
	printf("Kérem a téglatest második oldalának hosszát: "); scanf("%f",&b);
	printf("Kérem a téglatest harmadik oldalának hosszát: "); scanf("%f",&c);
	printf("A téglatest térfogata=%f\n", terfogat(a,b,c));
	printf("A téglatest felszíne=%f\n", felszin(a,b,c));	
}
void Fel_13()
{
	int a,b,c;
	printf("Kérem a haromszog elso oldalat: ");scanf("%d",&a);
	printf("Kérem a haromszog második oldalat: ");scanf("%d",&b);
	printf("Kérem a haromszog harmadik oldalat: ");scanf("%d",&c);
	printf("%s\n", haromszogg(a,b,c));
}
void Fel_14()
{
	int a,b,c;
	printf("Kérem a elsõ számot: ");scanf("%d",&a);
	printf("Kérem a második számot: : ");scanf("%d",&b);
	printf("Kérem a harmadik számot: : ");scanf("%d",&c);
	printf(" ", nagysagrend(a,b,c));
	
}
void Fel_15()
{
	int a;
	printf("Kérem a hõmérsékletet! ");scanf("%d",&a);
	printf("A víz halmazállapota %d fokon %s\n",a, halmazallapott(a));
	
}
void Fel_16()
{
	int honap;
	printf("Kérem a hónap számát: ");scanf("%d",&honap);
	//printf("%d", honap);
	printf("Az évszak %s ", evszak(honap));
}
int main()
{
	setlocale(LC_ALL, "HUN");
	
	fuggvenyek();
	
	Fel_1();
	Fel_2();
	Fel_3();
	Fel_4()
	Fel_5();
	Fel_6();
	Fel_7();
	Fel_8();
	Fel_9();
	Fel_10();
	Fel_11();
	Fel_12();
	Fel_13();
	Fel_14();
	Fel_15();
	Fel_16();
}
