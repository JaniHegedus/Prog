#include <iostream>
#define MAX_X 1023
#define MAX_Y 768
using namespace std;
class point
{
	protected:
		unsigned int x;
		unsigned int y;
	public:
		int setx(int adat);
		int sety(int adat);
		void ki()
		{
			cout<<x<<" - "<<y<<endl;
		}
}; 
class color: public point
{
	int c;    
	public:
		void setc(unsigned short int adat)
		{
			c=adat;
		}
		void ki()
		{
			cout<<x<<" - "<<y<<" - "<<c<<endl;
		}
}; 
int point::setx(int adat)
{
	if(adat >= 0 && adat < MAX_X)
	{
		x = adat;
		return 0;
	} 
	return -1;  
} 
int point::sety(int adat)
{
	if(adat >= 0 && adat < MAX_Y)
	{
		y = adat;
		return 0;
	} 
	return -1;  
} 
int main()
{
	color p1;
	point p2;
	p1.setx(100);
	p1.sety(200);
	p2.setx(500);
	p2.sety(300);
	p1.setc(55);
	p1.ki();
	p2.ki();
}
