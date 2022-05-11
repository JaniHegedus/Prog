#include <iostream>
#define MAX_X 1023
#define MAX_Y 768
using namespace std;
class stringg
{
	public:
		char* setszoveg();
};
class les: public stringg
{
	public:
		int kisbetuszamlalo(char szoveg[]);
};
char* stringg::setszoveg()
{
	char szoveg[10];
	int i=0;
	printf("Kérek egy sor szöveget: ");
	scanf("%s", szoveg);fflush(stdin);
	return szoveg;
}
int stringg::kisbetuszamlalo(char szoveg[])
{
	int i=0,db=0;
	while(szoveg[i++])
	{
		if (szoveg[i-1]>='a' && szoveg[i-1]<='z')
		{
			db++;
		}
		//printf("%c",szoveg[i-1]);
	}
	//printf("%d", db);
	return db;
}

int main()
{
	setlocale(LC_ALL, "HUN");
	stringg sz;
	les s;
	//cout<<sz.setszoveg()<<endl;
	cout<<"Kisbetûk száma: "<<s.kisbetuszamlalo(sz.setszoveg())<<endl;
}
