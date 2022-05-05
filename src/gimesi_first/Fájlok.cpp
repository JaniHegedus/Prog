#include <stdio.h>
#include <iostream>
#include <stdlib.h>
void line(FILE*, char*);
int beszamfajl()
{
	int a;
	FILE *fp;
	fp=fopen("teszt.txt","w");//Új fájl megnyitása, csak írás.
	if(fp==NULL)
	{//Nem sikerült a megnyitás
		printf("hibás fájl\n");
		system ("pause");
		return -1; 
	} 
	printf("kérek egy számot: ");scanf("%d",&a);
	while(a)
	{//Beolvasás 0 végjeligf
		fprintf(fp,"%d",a);
		printf("kérek egy számot: ");
		scanf("%d",&a);
	}
	fprintf(fp,"\n",a);
	fclose(fp);
	fp=fopen("teszt.txt","r");//Meglévo fájl megnyitása, csak olvasás
	fscanf(fp,"%d",&a);while(!feof(fp))
	{//Olvasás a fájl végéig
		printf("%d\n",a);fscanf(fp,"%d",&a);
	} 
	fclose(fp);
} 
int bechar_szam_line()
{
	char a[40];
	FILE *fp;
	fp=fopen("teszt.txt","w");
	if(fp==NULL)
	{
		printf("hibás fájl\n");
		system ("pause");
		return -1;
	} 
	printf("kérek egy szöveget: ");
	while(scanf("%[^\n]",a))
	{	//Olvasás üres sorig (csak enter).
		fflush(stdin);
		fprintf(fp,"%s\n",a);
		printf("kérek egy számot: ");
	}
	fclose(fp);
	fp=fopen("teszt.txt","r");   
	line(fp, a);
	while(!feof(fp))
	{
		printf("%s",a);
		line(fp, a);
	}
	fclose(fp);
}
int be_tetszoleges()
{
	int a;
	char sz[20];
	FILE *fp;
	fp=fopen("teszt.txt","a");
	if(fp==NULL)
	{
		printf("hibás fájl\n");
		system ("pause");
		return -1;
	} 
	printf("kérek egy számot: ");scanf("%d",&a);
	while(a)
	{
		fflush(stdin);//Billentyupuffer törlése
		printf("kérek egy szöveget: ");scanf("%[^\n]",sz);
		fprintf(fp,"%d - %s\n",a,sz);
		printf("kérek egy számot: ");scanf("%d",&a);
	} 
	fclose(fp);
	fp=fopen("teszt.txt","r"); fscanf(fp,"%d - %[^  \n]",&a,sz);
	while(!feof(fp))
	{
		printf("%d : %s\n",a,sz);fscanf(fp,"%d - %[^  \n]",&a,sz);
	} 
	fclose(fp);
}
int linefuggvenyhasznalata()
{
	char a[80];  
	FILE *in, *out;
	in=fopen("Fájlok.cpp","r");
	if(in==NULL)
	{
		printf("hibás fájl\n"); 
		system ("pause");
		return -1;
	}  
	out=fopen("Fájl_5.txt", "w");
	if(out==NULL)
	{
		printf("megnyitási hiba\n"); 
		system ("pause");
		return -1;
	}  
	line(in, a);
	while(!feof(in))
	{
		fprintf(out,"%s",a);
		line(in, a);
	} 
	fclose(in);
	fclose(out);
	system("pause");
}
int tetszoleges_valos_szam()
{
	float a;
	FILE *fp;
	fp=fopen("teszt.bin","w+b");//Új fájl megnyitása írásra és olvasásra
	printf("kérek egy számot: ");scanf("%f",&a);
	while(a)
	{
		fwrite(&a, sizeof (a), 1, fp);//float hosszának megfelelo bájt kiírása
		printf("kérek egy számot: ");scanf("%f",&a);
	} 
	fseek(fp, 0, SEEK_SET);//Fájlmutató pozicionálása az elejére
	fread(&a, sizeof (a),1, fp);
	while(!feof(fp))
	{
		printf("%10.2f\n",a);
		fread(&a, sizeof (a),1, fp);     //float hosszának megfelelo bájt beolvasása
	} 
	fclose(fp);
}
struct adat
{
	int azon;
	char nev[20];
	float fiz;
}; 
int struct_binarisba()
{
	
	adat a;
	FILE *fp;
	fp=fopen("teszt.bin","w+b");
	if(fp==NULL)
	{
		printf("Megnyitási hiba\n"); 
		system("pouse"); 
		return -1;
	}  
	printf("kérek az azonosítót: ");scanf("%d",&a.azon);
	while(a.azon)
	{
		fflush(stdin);
		printf("kérem a nevet: "); 
		scanf("%[^\n]",a.nev);
		printf("kérem a fizetést: ");
		scanf("%f",&a.fiz);
		fwrite (&a, sizeof (adat), 1, fp);
		printf("kérek az azonosítót: ");
		scanf("%d",&a.azon);
	} 
	fseek(fp, 0, SEEK_SET);
	fread(&a, sizeof (adat),1, fp);
	while(!feof(fp))
	{
		printf("%10d%30s%10.2f\n",a.azon,a.nev,a.fiz);
		fread(&a, sizeof (adat),1, fp);
	}
	fclose(fp);
	
}
void kiir(FILE*, adat, int);
int kiegeszitett()
{
	adat a;
	int az;
	FILE *fp;
	int hossz = sizeof (adat);
	fp=fopen("teszt.bin","r+b");
	if(fp==NULL)
	{
		fp=fopen("teszt.bin","w+b");
		if(fp==NULL)
		{
			printf("Megnyitási hiba\n"); 
			system("pouse"); 
			return -1;
		}
	} 
	else fseek(fp, 0, SEEK_END);
	printf("kérek az azonosítót: ");scanf("%d",&a.azon);
	while(a.azon)
	{
		fflush(stdin);
		printf("kérem a nevet: ");scanf("%[^\n]",a.nev);
		printf("kérem a fizetést: ");scanf("%f",&a.fiz);
		fwrite (&a, sizeof (adat), 1, fp);
		printf("kérek az azonosítót: ");scanf("%d",&a.azon);
	} 
	kiir(fp, a, hossz);
	printf("Kérem a keresendo azonosítót: "); scanf("%d",&az);
	fseek(fp, 0, SEEK_SET);
	fread(&a, hossz, 1, fp);
	while(!feof(fp))
	{
		if(az==a.azon)break;
		fread(&a, hossz, 1, fp);
	} 
	if(feof(fp)) printf("Nincs ilyen azonosító!\n");
	else 
	{
		printf("%10d%30s%10.2f\n",a.azon,a.nev,a.fiz);
		fflush(stdin); printf("kérem az új nevet: "); scanf("%[^\n]",a.nev);
		printf("kérem az új fizetést: "); scanf("%f",&a.fiz);
		fseek(fp, -hossz, SEEK_CUR);
		fwrite (&a, hossz, 1, fp);
		kiir(fp, a, hossz);
	} 
	fclose(fp);
	system("pause");
}
struct adat0
{
	int azon;
	char nev[20];
	float fiz;
}; 
int modositott_struct_tombre()
{
	FILE *f;
	adat a[100];
	int i=0; //A beolvasott elemek száma
	printf("kérek az azonosítót: ");scanf("%d",&a[i].azon);
	while(a[i].azon)
	{
		fflush(stdin);printf("kérem a nevet: ");scanf("%[^\n]",a[i].nev);
		printf("kérem a fizetést: ");scanf("%f", &a[i].fiz);
		i++;
		printf("kérek az azonosítót: ");scanf("%d",&a[i].azon);
	}
	f=fopen("teszt.dat","wb");
	if(f==NULL)
	{
		printf("Megnyitási hiba\n"); 
		system("pouse"); 
		return -1;
	}   
	fwrite(&a, sizeof(adat0), i, f);
	fclose(f);
	f=fopen("teszt.dat","rb");
	if(f==NULL)
	{
		printf("Megnyitási hiba\n"); 
		system("pouse"); 
		return -1;
	}        
	for (int j=0; j<i; j++)
	{
		fread(&a, sizeof(adat0), 1, f);
		printf("%d\t%s  \t%f\n",a[j].azon,a[j].nev,a[j].fiz);
	} 
	fclose(f);
} 
int F1()
{
	char a[80];  
	FILE *in;
	in=fopen("Fájlok.cpp","r");
	if(in==NULL)
	{
		printf("hibás fájl\n"); 
		system ("pause");
		return -1;
	}  
	int db=0;
	while(!feof(in))
	{
		for (int i=0;i<80;i++)
		{
			if(a[i]>='a'&&a[i]<='z'|| a[i]>='A'&&a[i]<='Z')
			{
				db++;
			}
		}
		line(in, a);
		//printf("%s",a);
	} 
	/*
	while(a[i++])
	{
		if(a>'a'&&a<'z')
		{
			db++;
		}
		printf("%s",a[i]);
		
	} */
	printf("Betû karakterek a programkódban: %d\n",db);
	fclose(in);
	system("pause");
}
int F2()
{
	char a[80];  
	FILE *in;
	in=fopen("Fájlok.cpp","r");
	if(in==NULL)
	{
		printf("hibás fájl\n"); 
		system ("pause");
		return -1;
	}  
	int db=0;
	while(!feof(in))
	{
		for (int i=0;i<80;i++)
		{
			if(a[i]=='\n')
			{
				db++;
				printf("%c",a[i]);
				line(in, a);
			}
		}
	} 
	printf("Sorok száma a programkódban: %d\n",db);
	fclose(in);
	system("pause");
}
int F3()
{
	char a[80];  
	FILE *in;
	in=fopen("Fájlok.cpp","r");
	if(in==NULL)
	{
		printf("hibás fájl\n"); 
		system ("pause");
		return -1;
	}  
	int dbs[80];
	while(!feof(in))
	{
		for (int i=0;i<80;i++)
		{
			if(a[i]!='\0')
			{
				dbs[i]++;
				printf("%c",a[i]);
			}
		}
		line(in, a);
		for (int i=0;i<80;i++)
		{
			//printf("%d",dbs[i]);
		}
	} 
	//printf("Sorok száma a programkódban: %d\n",db-2);
	fclose(in);
	system("pause");
}
int main()
{
	setlocale(LC_ALL, "HUN");
	//beszamfajl()
	//bechar_szam_line();
	//be_tetszoleges();
	//linefuggvenyhasznalata();
	//tetszoleges_valos_szam();
	//struct_binarisba();
	//kiegeszitett();
	//modositott_struct_tombre();
	//F1();
	//F2();
	F3();
}
void line(FILE *f, char *p)
{
	while((*p = fgetc (f))!='\n' && *p != EOF)p++;
	*p++='\n';
	*p=' \0';  
} 
void kiir(FILE *f, adat d, int hossz)
{
	fseek(f, 0, SEEK_SET);
	fread(&d, hossz,1, f);
	while(!feof(f))
	{
		printf("%10d%30s%10.2f\n",d.azon,d.nev,d.fiz);
		fread(&d, hossz, 1, f);
	} 
} 
