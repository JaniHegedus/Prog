#include <iostream>
using namespace std;

class szoveg
{ //3
	char szovegPeldany [80];
	public:
	//char* setszoveg(char tomb[80]);
	szoveg(char tomb[80])
	{
		int i = 0;
		while(tomb[i]){
			szovegPeldany[i] = tomb[i];
			i++;
		}
	}
	~szoveg()
	{
	cout<<szovegPeldany<<endl;
	}
};

class tomb1
{
	protected:
		int tomb [10];
	public:
		void setTomb();
		void getTomb()
		{
			for(int i = 0; i < 10; i++) cout<<tomb[i]<<endl;
		}
};

class tomb11: public tomb1
{
	public:
		void getTomb()
		{
			for(int i = 0; i < 10; i++) cout<<i<<".: "<<tomb[i]<<endl;
		}
};

void tomb1::setTomb()
{
	for(int i = 0; i < 10; i++)
	{
		printf("Adja meg a(z) %d. adatot: ", i); scanf("%d", &tomb[i]);
	}
}

//2
class szoveg2
{
	protected:
		char tomb[80];
	public:
		void setTomb();
		void getTomb(){cout<<tomb<<endl;}
};

class szoveg2Szamolo: public szoveg2
{
	int kisbetuk;
	public:
		void kisbetukSzamlalo();
};

void szoveg2::setTomb()
{
	printf("Adjon meg egy karakterlancot: ");
	fflush(stdin); scanf("%[^\n]", tomb);
}

void szoveg2Szamolo::kisbetukSzamlalo()
{
	int i = 0;
	kisbetuk = 0;
	while(tomb[i++])
	{
		if(tomb[i] >= 'a' && tomb[i] <= 'z') kisbetuk++;
	}
	cout<<"kisbetuk szama: "<<kisbetuk<<endl;
}

class szoveg24: public szoveg2
{
	int szamok;
	public: 
		void szamSzamlalo();
};

void szoveg24::szamSzamlalo()
{
	szamok = 0;
	int i = 0;
	while(tomb[i])
	{
		if(tomb[i] >= '0' && tomb[i] <= '9') szamok++;
		i++;
	}
	cout<<"Szamkarakterek szama: "<<szamok<<endl;
}

class teglatest
{
	protected:
		int a;
		int b;
		int c;
	public:
		void setOldalak();
		void getOldalak()
		{
			cout<<a<<"-"<<b<<"-"<<c<<endl;
		}
		void felszin()
		{
			int felszin = 0;
			felszin = 2 * ((a * b) + (a * c) + (b * c));
			cout<<"A felszín: "<<felszin<<endl;
		}
};


void teglatest::setOldalak()
{
	printf("Adja meg az elsõ oldalat: "); scanf("%d", &a);
	printf("Adja meg a második oldalat: "); scanf("%d", &b);
	printf("Adja meg a harmadik oldalat: "); scanf("%d", &c);
}

class teglatestTerfogat : public teglatest
{
	private:	
		int terfogat;
	public:
		void terfogata()
		{
			terfogat = a * b * c;
			cout << "A térfogat: " << terfogat << endl;
		}
};

class teglatest6f
{
	private:
		int a;
		int b;
		int c;
		int terfogat;
		int felszin;
	public:
		// *** CONSTRUCTOR ***
		teglatest6f(int a, int b, int c)
		{
			this->a = a;
			this->b = b;
			this->c = c;
			cout << "Constructor" << endl;
		}
		
		// *** GETTERS ***
		int getA()
		{
			return a;
		}
		int getB()
		{
			return b;
		}
		int getC()
		{
			return c;
		}
		
		// *** METHODS ***
		void felszin2()
		{
			felszin = 2 * ((a * b) + (a * c) + (b * c));
		}
		
		void terfogat2()
		{
			terfogat = a * b * c;
		}
		
		// *** DESTRUCTOR ***
		~teglatest6f()
		{
			cout << "felszín: " << felszin << "\ttérfogat: " << terfogat << endl;
		}
};

class haromszog8
{
	private:
		int a;
		int b;
		int c;
		bool szerkeszthetoe;
	public:
		// *** CONSTRUCTOR ***
		haromszog8(int a, int b, int c)
		{
			this->a = a;
			this->b = b;
			this->c = c;
			cout << "Constructor" << endl;
		}
		
		// *** GETTERS ***
		int getA()
		{
			return a;
		}
		int getB()
		{
			return b;
		}
		int getC()
		{
			return c;
		}
		
		// *** METHODS ***
		void szerkesztheto()
		{
			if (a+b>c && a+c>b && b+c>a)
			{
				szerkeszthetoe=true;
			}
		}
		
		// *** DESTRUCTOR ***
		~haromszog8()
		{
			if (szerkeszthetoe)
			{
				cout << "Szerkeszthetõ" << endl;	
			}
			else
				cout << "Nem szerkeszthetõ" << endl;	
		}
};

class tomb10
{
	private:
		int osszeg=0;
	public:
		int tomb10[10];
		void setTomb();
		void getTomb()
		{
			for(int i = 0; i < 10; i++) cout<<i+1<<".: "<<tomb10[i]<<endl;
		}
		void elemek_osszege()
		{
			for(int i = 0; i < 10; i++) osszeg+=tomb10[i];
			cout<<osszeg<<endl;
		}
};

void tomb10::setTomb()
{
	for(int i = 0; i < 10; i++)
	{
		printf("Adja meg a(z) %d. adatot: ", i+1); scanf("%d", &tomb10[i]);
	}
}

class tomb100: public tomb10
{
	private:
		float atlag=0;
		int osszeg=0;
	public:
		void elemek_osszege()
		{
			for(int i = 0; i < 10; i++) osszeg+=tomb10[i];
			atlag=(osszeg/10);
			cout<<atlag<<endl;
		}
};

class henger
{
	private:
		int r;
		int m;
		float terfogat;
		float felszin;
	public:
		// *** CONSTRUCTOR ***
		void setoldalak();
		void getoldalak()
		{
			cout<<r<<"-"<<m<<endl;
		}
		// *** GETTERS ***
		int getA()
		{
			return r;
		}
		int getB()
		{
			return m;
		}
		
		// *** METHODS ***
		void felszin2()
		{
			felszin = 2*r*3.14*(r+m);
			cout<<"A henger felszine: "<<felszin<<endl;
		}
		
		void terfogat2()
		{
			terfogat = r*r*3.14*m;
			cout<<"A henger térfogata: "<<terfogat<<endl;
		}
		
		
};
void henger::setoldalak()
{
	printf("Adja meg a henger sugarát: "); scanf("%d", &r);
	printf("Adja meg a henger magasságát: "); scanf("%d", &m);
}

class henger1
{
	private:
		int r;
		int m;
		float terfogat;
		float felszin;
	public:
		// *** CONSTRUCTOR ***
		
		henger1(int r, int m)
		{
			this->r = r;
			this->m = m;
			cout << "Constructor" << endl;
		}
		void getoldalak()
		{
			cout<<r<<"-"<<m<<endl;
		}
		// *** GETTERS ***
		int getA()
		{
			return r;
		}
		int getB()
		{
			return m;
		}
		
		// *** METHODS ***
		void felszin2()
		{
			felszin = 2*r*3.14*(r+m);
		}
		
		void terfogat2()
		{
			terfogat = r*r*3.14*m;
		}
		
		~henger1()
		{
			cout<<"A henger térfogata: "<<terfogat<<"\nA henger felszine: "<<felszin<<endl;
		}
};
class halmazallapot
{
	private:
		int homerseklet;
		bool jeg=false;
		bool viz=false;
		bool goz=false;
	public:
		void sethomerseklet();
		void gethomerseklet()
		{
			cout<<homerseklet<<endl;	
		}
		//Metódusok
		void halmazallapota()
		{
			if (homerseklet<0)
			{
				jeg=true;
			}
			else if (homerseklet>100)
			{
				goz=true;
			}
			else
			{
				viz=true;
			}
			if (goz)
				cout<<homerseklet<<" fokon Gõz a halmazállapota"<<endl;
			if (jeg)
				cout<<homerseklet<<" fokon Jég a halmazállapota"<<endl;
			if (viz)
				cout<<homerseklet<<" fokon Víz a halmazállapota"<<endl;
				
		}
};
void halmazallapot::sethomerseklet()
{
	printf("Kérem a víz hõmérsékletét: ");scanf("%d",&homerseklet);
}
class teglatest13f
{
	private:
		int a;
		int b;
		int c;
		float terfogat;
		float felszin;
	public:
		void kiir();
		// *** CONSTRUCTOR ***
		teglatest13f(int a, int b, int c)
		{
			this->a = a;
			this->b = b;
			this->c = c;
			cout << "Constructor" << endl;
		}
		
		// *** GETTERS ***
		int getA()
		{
			return a;
		}
		int getB()
		{
			return b;
		}
		int getC()
		{
			return c;
		}
		
		// *** METHODS ***
		void felszin2()
		{
			felszin = 2 * ((a * b) + (a * c) + (b * c));
		}
		
		void terfogat2()
		{
			terfogat = a * b * c;
		}
		
};
void teglatest13f::kiir()
{
	cout<<felszin<<endl;
	cout<<terfogat<<endl;
}
int main()
{
	setlocale(LC_ALL, "hun");
	//szoveg sz("kezdo szoveg");
	/*tomb1 peldany;
	peldany.setTomb();
	peldany.getTomb();
	tomb11 peldany2;
	peldany2.setTomb();
	peldany2.getTomb();*/
	
	/*szoveg2 peldany;
	peldany.setTomb();
	peldany.getTomb();
	szoveg2Szamolo peldany2;
	peldany2.setTomb();
	peldany2.getTomb();
	peldany2.kisbetukSzamlalo();*/
	/*szoveg24 peldany3;
	peldany3.setTomb();
	peldany3.getTomb();
	peldany3.szamSzamlalo();*/
	
	/*teglatestTerfogat peldany2;
	peldany2.setOldalak();
	peldany2.felszin();
	peldany2.terfogata();*/
	
	/*teglatest6f peldany(3, 4, 5);
	cout << peldany.getA() << endl;
	cout << peldany.getB() << endl;	
	cout << peldany.getC() << endl;
	peldany.felszin2();
	peldany.terfogat2();*/
	/*
	haromszog8 peldany(3, 4, 5);
	cout << peldany.getA() << endl;
	cout << peldany.getB() << endl;	
	cout << peldany.getC() << endl;
	peldany.szerkesztheto();
	*/
	/*
	tomb10 peldany;
	peldany.setTomb();
	peldany.getTomb();
	peldany.elemek_osszege();
	tomb100 peldany2;
	peldany2.setTomb();
	peldany2.getTomb();
	peldany2.elemek_osszege();
	*/
	/*
	henger peldany;
	peldany.setoldalak();
	peldany.getoldalak();
	peldany.felszin2();
	peldany.terfogat2();
	*/
	/*
	henger1 peldany(4,5);
	peldany.felszin2();
	peldany.terfogat2();
	*/
	/*
	halmazallapot peldany;
	peldany.sethomerseklet();
	peldany.gethomerseklet();
	peldany.halmazallapota();
	*/
	teglatest13f peldany(3,4,5);
	peldany.felszin2();
	peldany.terfogat2();
	peldany.kiir();
}
