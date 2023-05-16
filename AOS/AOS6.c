
#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<dirent.h>
int main (int argc, char *argv[])
{
char ext=strrchr(argv[1],'.');
if (!ext) {
    /* no extension */
} else {
    printf("extension is %c\n", ext + 1);
}
