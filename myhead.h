#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int add(int x,int y)
{
	double time;
	clock_t begin =clock();
	for(int i=0;i<100000000000;i++);
	clock_t end =clock();
    time=end-begin;
    printf("time take by program is %lf",time);
	return x+y;		
}
