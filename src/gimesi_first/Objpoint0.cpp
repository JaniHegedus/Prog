#include <iostream>
#define MAX_X 1024
#define MAX_Y 768
using namespace std;
struct point
{
	int x;
    int y;
    int setx(int adat);
	int sety(int adat);
};
int point::setx(int adat)
{
	if(adat >= 0 && adat < MAX_X)
	{//Képernyo 
		x = adat;
		return 0;
	} 
	return -1;  //A megadott érték a  képernyon kívül van
} 
int point::sety(int adat)
{
	if(adat >= 0 && adat < MAX_Y)
	{//Képernyo 
		y = adat;
		return 0;
	} 
	return -1;   //A megadott érték a képernyon kívül van
} 
int main()
{
	point p1, p2;//Példányosítás
	p1.setx(100);
	p1.sety(200);
	p2.x   =  5000;   
	p2.y    =  3000;   
	cout <<  p1.x   <<  "  - " <<  p1.y   <<  endl;    
	cout <<  p2.x   <<  "  - " <<  p2.y   <<  endl;    
}

