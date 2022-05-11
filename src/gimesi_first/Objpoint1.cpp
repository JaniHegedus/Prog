#include <iostream>
#define MAX_X 1024
#define MAX_Y 768
using namespace std;
class point
{
	int x;    
	int y;    
	public:
		int setx(int adat);
		int sety(int adat);
		int getx()
		{
			return x;
		} 
		int gety()
		{
			return y;
		}
}; 
int point::setx(int adat)
{
	if(adat >= 0 && adat < MAX_X)
	{
		x = adat;return 0;
	} 
	return -1;  
} 
int point::sety(int adat)
{
	if(adat >= 0 && adat < MAX_Y)
	{
		y = adat;return 0;
	} return -1;  
} 
int main()
{
	point p1, p2;
	p1.setx(100);
	p1.sety(200);
	p2.setx(500);
	p2.sety(300);
	cout <<  p1.getx() <<  "  - " <<  p1.gety() <<  endl;
	cout <<  p2.getx() <<  "  - " <<  p2.gety() <<  endl;   
}

