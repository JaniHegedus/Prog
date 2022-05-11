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
		// Metódusok:
		void setoldalak();
		void getoldalak() //DEBUG
		{
			cout<<a<<"-"<<b<<"-"<<c<<endl;
		}
		void felszin();
		void terfogat();
		void kiir()
		 {
		 	cout<<"A felszín: "<<felszin2<<endl;
			cout << "A térfogat: " << terfogat2 << endl;
		 }
};
void teglatest::setoldalak() // Oldalsetter metódus
{
	printf("Adja meg az elsõ oldalat: "); scanf("%d", &a);
	printf("Adja meg a második oldalat: "); scanf("%d", &b);
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
			cout << "A felszín: " << felszin2 << endl;
			cout << "A térfogat: " << terfogat2 << endl;
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
