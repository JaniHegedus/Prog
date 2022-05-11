#include <iostream>
#define MAX_X 1023
#define MAX_Y 768
using namespace std;
class stringg
{
	unsigned char* tomb;
	public:
		char* setszoveg(int adat);
		void kiir(char* szoveg);
	
};
	
class index: public stringg
{
	public:
		void kiir(char* szoveg);
};

char* stringg::setszoveg(int adat)
{
	stringg sz;
	sz.tomb;
	int i=0;
	printf("Kérek egy sor szöveget: ");
	while(i<adat)
	{
		sz.tomb[i]=getchar();
		i++;
	}
	sz.tomb[i++]='\0';
	//printf("%s", szoveg);
	return sz.tomb;
}
void stringg::kiir(char* szoveg)
{
	cout<<szoveg<<endl;
}
void index::kiir(char* szoveg)
{
	int i=0;
	while(szoveg[i++])
	{
		cout<<i<<" "<<szoveg[i-1]<<endl;
	}
}
int main()
{
	setlocale(LC_ALL, "HUN");
	stringg sz;
	index s;
	sz.kiir(sz.setszoveg(10));
	s.kiir(sz.setszoveg(10));
}
