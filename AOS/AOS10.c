#include <dirent.h>
#include <stdio.h>
int main(void)
{
    DIR *d;
    int nof=0;
    struct dirent *dir;
    d = opendir(".");
    if (d)
    {
        while ((dir = readdir(d)) != NULL)
        {
            printf("%s\n", dir->d_name);
            nof++;
        }
        closedir(d);
    }
    printf("\nTotal Number of Files=%d",nof);
    return(0);
}
