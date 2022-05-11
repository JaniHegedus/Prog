#include <stdio.h>
#include <iostream>
#define MAX 5
#define M 80
using namespace std;

void muveletek()
{
	int a,b,c,d,e,f;
	printf("Kérek egy számot: ");scanf("%d",&a);
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
    printf("Kérem a külsõ sugarat: (m)");scanf("%d",&k);
    printf("Kérem a belsõ sugarat: (m)");scanf("%d",&b);
    printf("Kérem az üveg árát: (Ft/m2)");scanf("%d",&a);
    ker=2*k*3.14;
    bker=2*b*3.14;
    osz=(ker-bker)*a;
    printf("Az üvegezés ára: %d",osz);
}
void tartaly()
{
	int sz,h,m,mp,dm3,ke;
	printf("Kérem a hasáb szélességét: (dm)");scanf("%d",&sz);
	printf("Kérem a hasáb hosszát: (dm)");scanf("%d",&h);
	printf("Kérem a hasáb magasságát: (dm)");scanf("%d",&m);
	printf("Kérem a vízhozamot: (mp/l)");scanf("%d",&mp);
	dm3=(sz*h*m);
	ke=dm3/mp;
	printf("A %dl-es tartályt %dmp-ig tart megtölteni ", dm3,ke);
}
void gula()
{
	int a,ta,m,tg,f,w;
	printf("Kérem alaplap a oldalának hosszát: (m)");scanf("%d",&a);
    ta=a*a;
    printf("Kérem a gúla magasságának hosszát: (m)");scanf("%d",&m);
    tg=(ta*m)/3;
    printf("Kérem a gúla anyagának fajsúlyát: (m3/kg)");scanf("%d",&f);
    w=tg*f;
    printf("Az gúla tömege: %dkg",w);
}
void henger()
{
	int r,m,l,th,o;
	printf("Kérem a henger sugarát: (m)");scanf("%d",&r);
    printf("Kérem a henger magasságát: (m)");scanf("%d",&m);
    printf("Kérem a festék m2-renkénti mennyiségét: (m2/l)");scanf("%d",&l);
    th=2*r*3.14*m;
    o=l*th;
    printf("Az gúla tömege: %dl",o);
}
void haszon()
{
	
	int be,hk,h,hks;
	printf("Kérem a beszerzési árat: (Ft)");scanf("%d",&be);
    printf("Kérem a haszonkulcsot: (%)");scanf("%d",&hk);
    hks=hk/100;
    h=be*hks;
    printf("A kereskedõ haszna: %dFt ", h);
}
void ha()
{
	int a;
	printf("Kérek egy szamot: ");scanf("%d",&a);
	if(a>0)
		printf("A szám pozitiv\n");
	else if (a<0)
		printf("A szám negativ\n");
		else
			printf("Nulla\n");
}
void haromszog()
{
	int a,b,c;
	printf("Kérem a haromszog elso oldalat: ");scanf("%d",&a);
	printf("Kérem a haromszog elso oldalat: ");scanf("%d",&b);
	printf("Kérem a haromszog elso oldalat: ");scanf("%d",&c);
	if(a+b>c&&a+c>b&&b+c>a)
		printf("Szerkesztheto 3szog");
	else
		printf("Nem szerkesztheto 3szog");
}
void honap()
{
	
	int a;
	printf("Kérem a honap sorszamat: ");scanf("%d",&a);
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
	printf("Kérem a honap sorszamat: ");scanf("%d",&a);
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
	printf("Kérem az intervallum also korlatjat: ");scanf("%d",&a);
	printf("Kérem az intervallum felso korlatjat: ");scanf("%d",&b);
	printf("Kérek egy szamot: ");scanf("%d",&c);
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
	printf("Kérem az elso szamot: ");scanf("%d",&a);
	printf("Kérem az masodik szamot: ");scanf("%d",&b);
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
	printf("Kérek egy karaktert: "); scanf("%d",&c);
	if(c>='0'&&c<='9') printf("szám\n");
	else printf("Nem szám\n");
	printf("Karakter kód: %d - karakter: \"%c\"\n",c,c);
	int N=91;
	
	for(int i=65;i<N;i++)
	{
		char d;
		d=i;
		printf("Karakter kód: %d - karakter: \"%c\"\n",d,d);
	}
}
void karaktersorozat()
{
	printf("Kérek egy karaktersorozatot, CTRL Z-ig:\n");
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
	printf("Kérek egy karaktersorozatot, ENTER-ig:\n");
	while((c=getchar())!='\n')
	{
//		putchar(c);
		int ic = c-'0';
		printf(" Karakter egész alakban: %d\n",ic);
		
	}
}
void F8()
{
	printf("Kérek egy karaktersorozatot, CTRL Z-ig:\n");
	int a=0,b=0;
	char c;
	c=getchar();
	while((c=getchar())!=EOF)
	{
		if(c<='0'&&c<='9' or  c=='\n') a+=1;
		else b+=1;
	}
	b=b-2;
	printf("%d db nemszám karakter van", b);
}
void F9()
{
	printf("Kérek egy karaktersorozatot, CTRL Z-ig:\n");
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
	printf("%d db nembetû karakter van", b);
}
void F11()
{
	char c;
	printf("Kérek egy karaktersorozatot, ENTER-ig:\n");
	while((c=getchar())!='\n')
	{
		putchar(c);
		printf("\n");
	}
}
void F14()
{
	int a[10],n,i;
	printf("Kérek egy Számot: "); scanf("%d",&n);
	for(i=0; n>0; i++)    
	{    
		a[i]=n%2;  
		n=n/2;
	} 
	printf("Bináris alak: ");
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
