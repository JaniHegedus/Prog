#include <stdio.h>
#include <iostream>
#define MAX 5
#define M 80
using namespace std;

void muveletek()
{
	int a,b,c,d,e,f;
	printf("K�rek egy sz�mot: ");scanf("%d",&a);
	b=5;
	c=a+b;
	d=a-b;
	e=a*b;
	f=a/b;
    printf("Jani\n");
    printf("osszeadas: %d + %d = %d\n",a,b,c);
    printf("kivonas: %d - %d = %d\n",a,b,d);
    printf("szorzas: %d * %d = %d\n",a,b,e);
    printf("osztas: %d %% %d = %d\n",a,b,f);
    
}
void kerekasztal()
{
	int k,b,a,ker,bker,osz;
    printf("K�rem a k�ls� sugarat: (m)");scanf("%d",&k);
    printf("K�rem a bels� sugarat: (m)");scanf("%d",&b);
    printf("K�rem az �veg �r�t: (Ft/m2)");scanf("%d",&a);
    ker=2*k*3.14;
    bker=2*b*3.14;
    osz=(ker-bker)*a;
    printf("Az �vegez�s �ra: %d",osz);
}
void tartaly()
{
	int sz,h,m,mp,dm3,ke;
	printf("K�rem a has�b sz�less�g�t: (dm)");scanf("%d",&sz);
	printf("K�rem a has�b hossz�t: (dm)");scanf("%d",&h);
	printf("K�rem a has�b magass�g�t: (dm)");scanf("%d",&m);
	printf("K�rem a v�zhozamot: (mp/l)");scanf("%d",&mp);
	dm3=(sz*h*m);
	ke=dm3/mp;
	printf("A %dl-es tart�lyt %dmp-ig tart megt�lteni ", dm3,ke);
}
void gula()
{
	int a,ta,m,tg,f,w;
	printf("K�rem alaplap a oldal�nak hossz�t: (m)");scanf("%d",&a);
    ta=a*a;
    printf("K�rem a g�la magass�g�nak hossz�t: (m)");scanf("%d",&m);
    tg=(ta*m)/3;
    printf("K�rem a g�la anyag�nak fajs�ly�t: (m3/kg)");scanf("%d",&f);
    w=tg*f;
    printf("Az g�la t�mege: %dkg",w);
}
void henger()
{
	int r,m,l,th,o;
	printf("K�rem a henger sugar�t: (m)");scanf("%d",&r);
    printf("K�rem a henger magass�g�t: (m)");scanf("%d",&m);
    printf("K�rem a fest�k m2-renk�nti mennyis�g�t: (m2/l)");scanf("%d",&l);
    th=2*r*3.14*m;
    o=l*th;
    printf("Az g�la t�mege: %dl",o);
}
void haszon()
{
	
	int be,hk,h,hks;
	printf("K�rem a beszerz�si �rat: (Ft)");scanf("%d",&be);
    printf("K�rem a haszonkulcsot: (%)");scanf("%d",&hk);
    hks=hk/100;
    h=be*hks;
    printf("A keresked� haszna: %dFt ", h);
}
void ha()
{
	int a;
	printf("K�rek egy szamot: ");scanf("%d",&a);
	if(a>0)
		printf("A sz�m pozitiv\n");
	else if (a<0)
		printf("A sz�m negativ\n");
		else
			printf("Nulla\n");
}
void haromszog()
{
	int a,b,c;
	printf("K�rem a haromszog elso oldalat: ");scanf("%d",&a);
	printf("K�rem a haromszog elso oldalat: ");scanf("%d",&b);
	printf("K�rem a haromszog elso oldalat: ");scanf("%d",&c);
	if(a+b>c&&a+c>b&&b+c>a)
		printf("Szerkesztheto 3szog");
	else
		printf("Nem szerkesztheto 3szog");
}
void honap()
{
	
	int a;
	printf("K�rem a honap sorszamat: ");scanf("%d",&a);
	switch(a)
	{
		case 1:printf("January\n");break;
		case 2:printf("Februar\n");break;
		case 3:printf("Marcius\n");break;
		case 4:printf("Aprilis\n");break;
		case 5:printf("Majus\n");break;
		case 6:printf("Junius\n");break;
		case 7:printf("Julius\n");break;
		case 8:printf("August\n");break;
		case 9:printf("September\n");break;
		case 10:printf("October\n");break;
		case 11:printf("November\n");break;
		case 12:printf("December\n");break;
		default:printf("Hibas adat\n");break;
		
	}
	
}
void evszak()
{
	int a;
	printf("K�rem a honap sorszamat: ");scanf("%d",&a);
	switch(a)
	{
		case 12:case 1:case 2:printf("Tel\n");break;
		case 3:case 4:case 5:printf("Tavasz\n");break;
		case 6:case 7:case 8:printf("Nyar\n");break;
		case 9:case 10:case 11:printf("Osz\n");break;
		default:printf("Hibas adat\n");break;
	}
}
void intervallum()
{
	int a,b,c;
	printf("K�rem az intervallum also korlatjat: ");scanf("%d",&a);
	printf("K�rem az intervallum felso korlatjat: ");scanf("%d",&b);
	printf("K�rek egy szamot: ");scanf("%d",&c);
	if (a>b)
		printf("Hibas korlatok");
	else if (a<=c && c<=b)
		printf("A szam benne van az intervallumban!");
		else if(b<c or c<a)
			printf("A szam nincs benne az intervallumban!");
			else 
				printf("Hibas adat!");
}
void novekvo()
{
	int a,b,c;
	printf("K�rem az elso szamot: ");scanf("%d",&a);
	printf("K�rem az masodik szamot: ");scanf("%d",&b);
	c=b-a;
	if(c>0)
		printf("%d, %d", a,b);
	else if (c>0) 
		printf("%d, %d",b,a);
		else if (c=0)
			printf("Egyenloek");
			else
				printf("Hibas adat");
	
}
void whilec()
{
	int n,i=0;
	printf("kerek egy szamot: ");scanf("%d",&n);
	while(i<=n)
	{
		printf("%d ",i);
		i++;
	}
}
void doc()
{
	int n,i=0;
	printf("kerek egy szamot: ");scanf("%d",&n);
	do
	{
		printf("%d ",i);
		i++;
	} while(i<=n);
}
void forc()
{
	int n,i;
	printf("kerek egy szamot: ");scanf("%d",&n);
	for(i=0;i<=n;i++)
		printf("%d ",i);
}
void osszeg()
{
	int szam,n=0,osszeg=0;
	printf("kerek egy szamot: ");scanf("%d",&szam);
	while(szam)
	{
		osszeg+=szam;
		n++;
		printf("kerek egy szamot: ");scanf("%d",&szam);
	}
	printf("A szam osszege=%d, az atlag=%d, a maradek=%d\n",osszeg,osszeg/n,osszeg%n);
}
void osszeghatul()
{
	int szam,n=0,osszeg=0;
	printf("kerek egy szamot: ");scanf("%d",&szam);
	do
	{
		osszeg+=szam;
		printf("kerek egy szamot: ");scanf("%d",&szam);
		n++;
	} while(szam);
	printf("A szam osszege=%d, az atlag=%d, a maradek=%d\n",osszeg,osszeg/n,osszeg%n);
}
void fakt()
{
	int n, fakt=1;
	printf("kerek egy szamot: ");scanf("%d",&n);
	for(int i=1; i<=n;i++)
		fakt=fakt*i;
	printf("%d! = %d\n", n,fakt);
}
void karakter()
{
	char c;
	printf("K�rek egy karaktert: "); scanf("%d",&c);
	if(c>='0'&&c<='9') printf("sz�m\n");
	else printf("Nem sz�m\n");
	printf("Karakter k�d: %d - karakter: \"%c\"\n",c,c);
	int N=91;
	
	for(int i=65;i<N;i++)
	{
		char d;
		d=i;
		printf("Karakter k�d: %d - karakter: \"%c\"\n",d,d);
	}
}
void karaktersorozat()
{
	printf("K�rek egy karaktersorozatot, CTRL Z-ig:\n");
	char c;
	c=getchar();
	while((c=getchar())!=EOF)
	{
		putchar(c);
		
	}
}
void vltozo()
{
	char i; 
	float j=1E35;
	for (i=0;i<10;j++,i++)
	{
		printf("%g\n",j);
	}
}
void egeszkarakter()
{
	char c;
	printf("K�rek egy karaktersorozatot, ENTER-ig:\n");
	while((c=getchar())!='\n')
	{
//		putchar(c);
		int ic = c-'0';
		printf(" Karakter eg�sz alakban: %d\n",ic);
		
	}
}
void F8()
{
	printf("K�rek egy karaktersorozatot, CTRL Z-ig:\n");
	int a=0,b=0;
	char c;
	c=getchar();
	while((c=getchar())!=EOF)
	{
		if(c<='0'&&c<='9' or  c=='\n') a+=1;
		else b+=1;
	}
	b=b-2;
	printf("%d db nemsz�m karakter van", b);
}
void F9()
{
	printf("K�rek egy karaktersorozatot, CTRL Z-ig:\n");
	int a=0,b=0;
	char c;
	c=getchar();
	while((c=getchar())!=EOF)
	{
		if(c>='A'&&c<='Z' or c<='a'&&c<='z' or  c=='\n')  {
		b+=1; putchar(c); printf("%d",b);}
		else b+=1;
	}
	b=b-1;
	printf("%d db nembet� karakter van", b);
}
void F11()
{
	char c;
	printf("K�rek egy karaktersorozatot, ENTER-ig:\n");
	while((c=getchar())!='\n')
	{
		putchar(c);
		printf("\n");
	}
}
void F14()
{
	int a[10],n,i;
	printf("K�rek egy Sz�mot: "); scanf("%d",&n);
	for(i=0; n>0; i++)    
	{    
		a[i]=n%2;  
		n=n/2;
	} 
	printf("Bin�ris alak: ");
	for(i=i-1 ;i>=0 ;i--)    
	{    
		printf("%d", a[i]);    
	}  
}

int main()
{
	setlocale(LC_ALL, "HUN");
	
	muveletek();
	kerekasztal();
	tartaly();
	gula();
	henger();
	haszon();
	ha();
	haromszog();
	honap();
	evszak();
	intervallum();
	novekvo();
	whilec()
	doc();
	forc();
	osszeg();
	osszeghatul();
	fakt();
	F8();
	F9();
	F14();
	F11();
	
}
