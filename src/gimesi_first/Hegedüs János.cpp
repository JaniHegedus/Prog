#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

class teglatest
{
	private:
		int a;
		int b;
		int c;
	public:
		int felszin2;
		int terfogat2;
		// Met�dusok:
		void setoldalak();
		void getoldalak() //DEBUG
		{
			cout<<a<<"-"<<b<<"-"<<c<<endl;
		}
		void felszin();
		void terfogat();
		void kiir()
		 {
		 	cout<<"A felsz�n: "<<felszin2<<endl;
			cout << "A t�rfogat: " << terfogat2 << endl;
		 }
};
void teglatest::setoldalak() // Oldalsetter met�dus
{
	printf("Adja meg az els� oldalat: "); scanf("%d", &a);
	printf("Adja meg a m�sodik oldalat: "); scanf("%d", &b);
	printf("Adja meg a harmadik oldalat: "); scanf("%d", &c);
}

class teglatest_konstruktor: public teglatest //konstruktoros alosztaly
{
	private:
		int a;
		int b;
		int c;
	public:
		teglatest_konstruktor(int a, int b, int c)
			{
				this->a = a;
				this->b = b;
				this->c = c;
				cout << "Constructor" << endl;
			}
		void getoldalak() //DEBUG
		{
			cout<<a<<"-"<<b<<"-"<<c<<endl;
		}
		teglatest_konstruktor.terfogat();
		teglatest_konstruktor.felszin();
		~teglatest_konstruktor()
		{
			cout << "A felsz�n: " << felszin2 << endl;
			cout << "A t�rfogat: " << terfogat2 << endl;
		}
};

int main()
{
	setlocale(LC_ALL, "HUN");
	
	teglatest peldany;
	peldany.setoldalak();
	peldany.getoldalak();
	peldany.felszin();
	peldany.terfogat();
	peldany.kiir();
	
	teglatest_konstruktor peldany2(3,4,5);
	peldany2.getoldalak();
	peldany2.felszin();
	peldany2.terfogat();
}
void teglatest::felszin()
{
	felszin2 = 2 * ((a * b) + (a * c) + (b * c));
}
void teglatest::terfogat()
{
	terfogat2=a*b*c;
}
