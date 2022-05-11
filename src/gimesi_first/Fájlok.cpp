#include <stdio.h>
#include <iostream>
#include <stdlib.h>
void line(FILE*, char*);
int beszamfajl()
{
	int a;
	FILE *fp;
	fp=fopen("teszt.txt","w");//�j f�jl megnyit�sa, csak �r�s.
	if(fp==NULL)
	{//Nem siker�lt a megnyit�s
		printf("hib�s f�jl\n");
		system ("pause");
		return -1; 
	} 
	printf("k�rek egy sz�mot: ");scanf("%d",&a);
	while(a)
	{//Beolvas�s 0 v�gjeligf
		fprintf(fp,"%d",a);
		printf("k�rek egy sz�mot: ");
		scanf("%d",&a);
	}
	fprintf(fp,"\n",a);
	fclose(fp);
	fp=fopen("teszt.txt","r");//Megl�vo f�jl megnyit�sa, csak olvas�s
	fscanf(fp,"%d",&a);while(!feof(fp))
	{//Olvas�s a f�jl v�g�ig
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
		printf("hib�s f�jl\n");
		system ("pause");
		return -1;
	} 
	printf("k�rek egy sz�veget: ");
	while(scanf("%[^\n]",a))
	{	//Olvas�s �res sorig (csak enter).
		fflush(stdin);
		fprintf(fp,"%s\n",a);
		printf("k�rek egy sz�mot: ");
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
		printf("hib�s f�jl\n");
		system ("pause");
		return -1;
	} 
	printf("k�rek egy sz�mot: ");scanf("%d",&a);
	while(a)
	{
		fflush(stdin);//Billentyupuffer t�rl�se
		printf("k�rek egy sz�veget: ");scanf("%[^\n]",sz);
		fprintf(fp,"%d - %s\n",a,sz);
		printf("k�rek egy sz�mot: ");scanf("%d",&a);
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
	in=fopen("F�jlok.cpp","r");
	if(in==NULL)
	{
		printf("hib�s f�jl\n"); 
		system ("pause");
		return -1;
	}  
	out=fopen("F�jl_5.txt", "w");
	if(out==NULL)
	{
		printf("megnyit�si hiba\n"); 
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
	fp=fopen("teszt.bin","w+b");//�j f�jl megnyit�sa �r�sra �s olvas�sra
	printf("k�rek egy sz�mot: ");scanf("%f",&a);
	while(a)
	{
		fwrite(&a, sizeof (a), 1, fp);//float hossz�nak megfelelo b�jt ki�r�sa
		printf("k�rek egy sz�mot: ");scanf("%f",&a);
	} 
	fseek(fp, 0, SEEK_SET);//F�jlmutat� pozicion�l�sa az elej�re
	fread(&a, sizeof (a),1, fp);
	while(!feof(fp))
	{
		printf("%10.2f\n",a);
		fread(&a, sizeof (a),1, fp);     //float hossz�nak megfelelo b�jt beolvas�sa
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
		printf("Megnyit�si hiba\n"); 
		system("pouse"); 
		return -1;
	}  
	printf("k�rek az azonos�t�t: ");scanf("%d",&a.azon);
	while(a.azon)
	{
		fflush(stdin);
		printf("k�rem a nevet: "); 
		scanf("%[^\n]",a.nev);
		printf("k�rem a fizet�st: ");
		scanf("%f",&a.fiz);
		fwrite (&a, sizeof (adat), 1, fp);
		printf("k�rek az azonos�t�t: ");
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
			printf("Megnyit�si hiba\n"); 
			system("pouse"); 
			return -1;
		}
	} 
	else fseek(fp, 0, SEEK_END);
	printf("k�rek az azonos�t�t: ");scanf("%d",&a.azon);
	while(a.azon)
	{
		fflush(stdin);
		printf("k�rem a nevet: ");scanf("%[^\n]",a.nev);
		printf("k�rem a fizet�st: ");scanf("%f",&a.fiz);
		fwrite (&a, sizeof (adat), 1, fp);
		printf("k�rek az azonos�t�t: ");scanf("%d",&a.azon);
	} 
	kiir(fp, a, hossz);
	printf("K�rem a keresendo azonos�t�t: "); scanf("%d",&az);
	fseek(fp, 0, SEEK_SET);
	fread(&a, hossz, 1, fp);
	while(!feof(fp))
	{
		if(az==a.azon)break;
		fread(&a, hossz, 1, fp);
	} 
	if(feof(fp)) printf("Nincs ilyen azonos�t�!\n");
	else 
	{
		printf("%10d%30s%10.2f\n",a.azon,a.nev,a.fiz);
		fflush(stdin); printf("k�rem az �j nevet: "); scanf("%[^\n]",a.nev);
		printf("k�rem az �j fizet�st: "); scanf("%f",&a.fiz);
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
	int i=0; //A beolvasott elemek sz�ma
	printf("k�rek az azonos�t�t: ");scanf("%d",&a[i].azon);
	while(a[i].azon)
	{
		fflush(stdin);printf("k�rem a nevet: ");scanf("%[^\n]",a[i].nev);
		printf("k�rem a fizet�st: ");scanf("%f", &a[i].fiz);
		i++;
		printf("k�rek az azonos�t�t: ");scanf("%d",&a[i].azon);
	}
	f=fopen("teszt.dat","wb");
	if(f==NULL)
	{
		printf("Megnyit�si hiba\n"); 
		system("pouse"); 
		return -1;
	}   
	fwrite(&a, sizeof(adat0), i, f);
	fclose(f);
	f=fopen("teszt.dat","rb");
	if(f==NULL)
	{
		printf("Megnyit�si hiba\n"); 
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
	in=fopen("F�jlok.cpp","r");
	if(in==NULL)
	{
		printf("hib�s f�jl\n"); 
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
	printf("Bet� karakterek a programk�dban: %d\n",db);
	fclose(in);
	system("pause");
}
int F2()
{
	char a[80];  
	FILE *in;
	in=fopen("F�jlok.cpp","r");
	if(in==NULL)
	{
		printf("hib�s f�jl\n"); 
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
	printf("Sorok sz�ma a programk�dban: %d\n",db);
	fclose(in);
	system("pause");
}
int F3()
{
	char a[80];  
	FILE *in;
	in=fopen("F�jlok.cpp","r");
	if(in==NULL)
	{
		printf("hib�s f�jl\n"); 
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
	//printf("Sorok sz�ma a programk�dban: %d\n",db-2);
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
