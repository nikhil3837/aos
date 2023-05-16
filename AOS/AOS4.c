#include <stdio.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdlib.h>
int main (int argc, char *argv[])
{
        struct stat fileStat;
        int fd=0,i;
        FILE *filename;// = "abc.txt";
	for(i=1;i<argc;i++)
	{
	filename=argv[i];
  if ( ( fd = open (filename, O_RDONLY) ) == -1)
  {
                perror ( "open " );
                system("pause");
                exit (1) ;
        }

        if(fstat(fd, &fileStat)<0) return 1;

       printf("File inode:%ld\n",fileStat.st_ino);
}        return 0;
}
