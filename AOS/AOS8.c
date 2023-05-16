#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(void)
{
FILE *fp;
int i;
char fname[10];
printf("Enter the Name of File");
scanf("%s",fname);
fp=fopen(fname,"r");
if(fp==NULL)
printf("Error opening in file");
else
{
printf("\nSleeping for 15 Sec");
sleep(10);
printf("\nWake up \n");
}
fclose(fp);
printf("\n %s Terminated \n",fname);
}
